package edu.neu.csye6200;

import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * Consumer for reading from BlockingQueue.
 * 
 * @author danielgmp
 * Based on:
 * http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html
 *
 */
public class Consumer<E> implements Runnable {

    protected BlockingQueue<E> queue = null;
    protected List<E> data = null;
    protected int rCount = 0;
    protected Runnable tAction = null;
    protected Runnable rAction = null;
    protected E element = null;

    public Consumer(BlockingQueue<E> queue, List<E> dataList, int rCount) {
    		super();
        this.queue = queue;
        this.data = dataList;
        this.rCount = rCount;
//	    this.rAction = () -> {this.data.forEach((e) -> System.out.println(e + " "));};
    }

    public Consumer(BlockingQueue<E> queue, List<E> dataList, int rCount, Runnable rAction) {
		super();
        this.queue = queue;
        this.data = dataList;
        this.rCount = rCount;
	    this.rAction = rAction;
    }

    public Consumer(BlockingQueue<E> queue, List<E> dataList, int rCount, Runnable tAction, Runnable rAction) {
		super();
        this.queue = queue;
        this.data = dataList;
        this.rCount = rCount;
	    this.tAction = tAction;
	    this.rAction = rAction;
    }

    public E consume() throws InterruptedException {
    	
		this.element = queue.take();
		this.data.add(this.element);
        System.out.println("\t BlockingQueue Consumer take '" + element + "'");
		if (null != this.tAction) this.tAction.run();		// process take data
    		return this.element;
    }
    
    public void run() {
        try {
        		for (int i = 0; i < this.rCount; i++) {
        			this.consume();
        		}
        		if (null != this.rAction) 
        			new Thread(this.rAction).start();		// process all receive data
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
