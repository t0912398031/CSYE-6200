package project1;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DemoThreads {
	private int count;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public DemoThreads() {
		super();
		this.count = 0;
	}

	public DemoThreads(int count) {
		super();
		this.count = count;
	}
	
	/**
	 * inner class implements Runnable interface to provide a thread of execution.
	 */
	private class WorkThread implements Runnable {
		public WorkThread() {
			super();
			this.message = "WorkThread";
		}

		public WorkThread(String message) {
			super();
			this.message = message;
		}

		public WorkThread(String message, int n) {
			super();
			StringBuilder msg = new StringBuilder();
			this.message = msg.append(message).append(n).toString();
		}

		private String message = null;

		@Override
		public void run() {
			System.out.println(message);
		}
		
	}
	
	/**
	 * create and start executing a single new thread
	 */
	public void singleThread() {
		/*
		 *  implement Runnable interface: Lambda provides implementation for run() method
		 */
		Runnable r = () -> { System.out.println("\n" + this.getClass().getName() + ".singleThread() executing in background thread..."); };
		
		Thread t = new Thread(r);	// create thread
		t.start();					// start thread by calling run() method
	}

	/**
	 * create and start executing a multiple new threads from thread pool
	 */
	public void multipleThread() {
		/**
		 * 
		 */
        ExecutorService executor = Executors.newFixedThreadPool(5);
		/*
		 *  implement Runnable interface: Lambda provides implementation for run() method
		 */
		Runnable r1 = () -> { System.out.println("\n" + this.getClass().getName() + ".multipleThread() #1 executing in background thread..."); };
		Runnable r2 = () -> { System.out.println("\n" + this.getClass().getName() + ".multipleThread() #2 executing in background thread..."); };
		Runnable r3 = () -> { System.out.println("\n" + this.getClass().getName() + ".multipleThread() #3 executing in background thread..."); };
		
		Thread t1 = new Thread(r1);	// create thread
		t1.start();					// start thread by calling run() method
		Thread t2 = new Thread(r2);	// create thread
		t2.start();					// start thread by calling run() method
		Thread t3 = new Thread(r3);	// create thread
		t3.start();					// start thread by calling run() method
		
		Runnable worker1 = new WorkThread("\n" + Thread.currentThread().getName() + ".multipleThread() started background execution work thread # ", 1);
		Runnable worker2 = new WorkThread("\n" + Thread.currentThread().getName() + ".multipleThread() started background execution work thread # ", 2);
		Runnable worker3 = new WorkThread("\n" + Thread.currentThread().getName() + ".multipleThread() started background execution work thread # ", 3);
        executor.execute(worker1);	// start thread by calling run() method
        executor.execute(worker2);	// start thread by calling run() method
        executor.execute(worker3);	// start thread by calling run() method
        
        try {
			if (false == executor.awaitTermination(3, TimeUnit.SECONDS))
				System.out.println("executor.awaitTermination: TIMEOUT!");
		        executor.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * increment object counter
	 * 
	 * @return
	 */
	private int counter() {
		return this.count++;
	}

	/**
	 * show object counter.
	 */
	private void showCounter() {
		this.counter();
		/*
		 * exaggerate critical race between counter and console output
		 */
		try {
			Thread.sleep(2);	// milliseconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this);
	}
	
	/**
	 * show object counter, but only allow one thread at a time.
	 */
	private synchronized void showSynchronizedCounter() {
		this.counter();
//		/*
//		 * exaggerate critical race between counter and console output
//		 */
//		try {
//			Thread.sleep(2);	// milliseconds
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println(this);
	}
	
	private void runWorkers(int numWorkers, Runnable work) {
		ExecutorService executor = Executors.newFixedThreadPool(numWorkers);
		for (int i = 0; i < numWorkers; i++) 	executor.execute(work);
        
        try {
			if (false == executor.awaitTermination(3, TimeUnit.SECONDS))
				System.out.println("executor.awaitTermination: TIMEOUT!");
		        executor.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void synchronizedCounting() {
		this.setCount(0);
		Runnable r = () -> {
			this.showSynchronizedCounter();
		};
		this.runWorkers(12, r);
	}
	
	public void unSynchronizedCounting() {
		this.setCount(0);
		Runnable r = () -> {
			this.showCounter();
		};
		this.runWorkers(12, r);
	}
	
	public void countEmAll() {
		this.setCount(0);
		Runnable r = () -> {
//			this.showCounter();
			this.showSynchronizedCounter();
		};
		this.runWorkers(12, r);
		
//		ExecutorService executor = Executors.newFixedThreadPool(2);
//		executor.execute(r);
//		executor.execute(r);
//		executor.execute(r);
//		executor.execute(r);
//		executor.execute(r);
//		executor.execute(r);
//		executor.execute(r);
//		executor.execute(r);
//		executor.execute(r);
//		executor.execute(r);
//		executor.execute(r);
//		executor.execute(r);

	}
	
	@Override
	public String toString() {
		return "DemoThreads [count=" + count + "]";
	}

	public static void demo () {
		System.out.println("\n\t" + DemoThreads.class.getSimpleName() + ".demo()");
		
		DemoThreads obj = new DemoThreads();
		
//		obj.singleThread();
//		obj.multipleThread();
//		obj.countEmAll();
//		obj.synchronizedCounting();
		obj.unSynchronizedCounting();
		
		System.out.println("\n DemoThreads...done!");
	}

}
