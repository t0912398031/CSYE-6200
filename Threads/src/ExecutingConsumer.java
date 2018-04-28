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
public class ExecutingConsumer extends Consumer<Runnable> implements Runnable {

    public ExecutingConsumer(BlockingQueue<Runnable> queue, List<Runnable> dataList, int rCount) {
    		super(queue, dataList, rCount);
    }

    public ExecutingConsumer(BlockingQueue<Runnable> queue, List<Runnable> dataList, int rCount, Runnable rAction) {
		super(queue, dataList, rCount, rAction);
	    this.rAction = rAction;
    }

    public ExecutingConsumer(BlockingQueue<Runnable> queue, List<Runnable> dataList, int rCount, Runnable tAction, Runnable rAction) {
		super(queue, dataList, rCount, tAction, rAction);
    }

	public Runnable consume() throws InterruptedException {
		this.element = queue.take();
		if ((this.element instanceof Runnable) && (null != this.element)) {			
			this.element.run(); // execute Runnable in this thread
		} else {
			System.out.println(this.getClass().getName() + ".consume(): NOT A RUNNABLE !!!");
		}
		return this.element;
	}
    
	@Override
    public void run() {
        try {
        		for (int i = 0; i < this.rCount; i++) {
        			this.consume();
        		}
        		if ((this.rAction instanceof Runnable) && (null != this.rAction)) {
        			new Thread(this.rAction).start();		// execute post processing
        		} 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
