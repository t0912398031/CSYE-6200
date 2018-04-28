package edu.neu.csye6200;

import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
	 * Producer for writing supplied data List into BlockingQueue.
	 * 
	 * @author danielgmp
	 * Based on:
	 * http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html
	 *
	 */
	public class Producer<E> implements Runnable{

	    protected BlockingQueue<E> queue = null;
	    protected List<E> data = null;
	    protected boolean verbose = false;

	    public Producer(BlockingQueue<E> queue, List<E> dataList) {
    		super();
        this.queue = queue;
        this.data = dataList;
    }

	    public Producer(BlockingQueue<E> queue, List<E> dataList, boolean verbose) {
    		super();
        this.queue = queue;
        this.data = dataList;
        this.verbose = verbose;
    }

	    public boolean isVerbose() {
			return verbose;
		}

		public void setVerbose(boolean verbose) {
			this.verbose = verbose;
		}

		public void run() {
			try {
				for (E e : this.data) {
					if (verbose) System.out.println("BlockingQueue Producer put " + e);
					queue.put(e);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}	
