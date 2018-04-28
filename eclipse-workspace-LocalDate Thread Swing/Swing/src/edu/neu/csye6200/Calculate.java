package edu.neu.csye6200;

public class Calculate {
	private static Calculate calculator = null;
	private int result;
	private static int sum = 0;
	private static int difference = 0;
	private static int product = 0;
	private static int quotient = 0;
	
	private Calculate() {
		super();
		this.result = 0;
	}

	private Calculate(int result) {
		super();
		this.result = result;
	}
	
	public static Calculate getInstance() {
		Calculate.calculator = new Calculate();
		return Calculate.calculator;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int add(int x, int y) {
		Runnable addLambda = () -> { 
			sum = x + y;
			System.out.println("Lambda named addLambda(" + x + "," + y + ") = " + sum + " implementing runnable");
		};
		Thread t = new Thread(addLambda);		// instantiate Thread object with Lambda implementation of the runnable interface
		t.start();    	// begin execution of task() in a new thread
		try {
			t.join();	// wait for thread to complete before continuing
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		this.result = x + y;
		this.result = sum;
		return result;
	}

	public int sub(int x, int y) {
		Thread t = new Thread(() -> {
			difference = x - y ;
			System.out.println("Lambda sub(" + x + "-" + y + ") = " + difference);
			} );		// instantiate Thread object with Lambda implementation of the runnable interface
//		Thread t = new Thread(() -> difference = x - y );		// instantiate Thread object with Lambda implementation of the runnable interface
		t.start();    	// begin execution of task() in a new thread
		try {
			t.join();	// wait for thread to complete before continuing
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.result = difference;
//		this.result = x - y;
		return result;
	}

	public int mult(int x, int y) {
		Thread t = new Thread(() -> { 
			product = x * y; 
			System.out.println("Lambda mult(" + x + "*" + y + ") = " + product);
		});		// instantiate Thread object with Lambda implementation of the runnable interface
//		Thread t = new Thread(() -> product = x * y );		// instantiate Thread object with Lambda implementation of the runnable interface
		t.start();    	// begin execution of task() in a new thread
		try {
			t.join();	// wait for thread to complete before continuing
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.result = product;
//		this.result = x * y;
		return result;
	}

	public int div(int x, int y) {
		Thread t = new Thread(() -> { 
			quotient = x / y; 
			System.out.println("Lambda div(" + x + "/" + y + ") = " + quotient);
		});		// instantiate Thread object with Lambda implementation of the runnable interface
//		Thread t = new Thread(() -> quotient = x / y );		// instantiate Thread object with Lambda implementation of the runnable interface
		t.start();    	// begin execution of task() in a new thread
		try {
			t.join();	// wait for thread to complete before continuing
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.result = quotient;
//		this.result = x / y;
		return result;
	}
	
	public void show() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Calc Result: " + this.result;
	}
	
	public static void demo() {
//		Calculate obj = new Calculate();
		Calculate obj = Calculate.getInstance();
		obj.add(2, 3);
		obj.show();
		obj.sub(7, 4);
		System.out.println(obj);
		obj.mult(3, 5);
		System.out.println(obj);
		obj.div(20, 4);
		System.out.println(obj);
	}
}
