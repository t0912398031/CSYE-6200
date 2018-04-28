package edu.neu.csye6200.patterns;

public class LazySingleton {
	private static LazySingleton instance = null;
	
	private LazySingleton() {
		// private, not part of API (internal use only)
	}
	/**
	 * thread-safe method to obtain only instance of this singleton class
	 * @return
	 */
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance =  new LazySingleton();			
		}
		return instance;
	}
	
	@Override
	public String toString() {
		return "I am a very Lazy Singleton because I wait until the LAST minute to instantiate my ONLY instance.";
	}
	public static void demo() {
		System.out.println(LazySingleton.class.getName() + ".demo() starting...\n");
		LazySingleton obj = LazySingleton.getInstance();
		System.out.println(obj);
		System.out.println(LazySingleton.class.getName() + ".demo() done!");
	}
}
