package edu.neu.csye6200.patterns;

public class SimpleSingleton {
	private static final SimpleSingleton instance = new SimpleSingleton();
	
	private SimpleSingleton() {
		// private, for internal use only NOT part of API
	}
	
	public static SimpleSingleton getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "I am a very simple Singleton because I instantiate my ONLY instance (even if nobody ever asks :-).";
	}
	
	public static void demo() {
		System.out.println(SimpleSingleton.class.getName() + ".demo() starting...\n");
		SimpleSingleton obj = SimpleSingleton.getInstance();
		System.out.println(obj);
		System.out.println(SimpleSingleton.class.getName() + ".demo() done!");
	}
}
