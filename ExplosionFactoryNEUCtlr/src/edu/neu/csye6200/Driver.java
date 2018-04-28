package edu.neu.csye6200;

import edu.neu.csye6200.patterns.ExplosionController;
import edu.neu.csye6200.patterns.LazySingleton;
import edu.neu.csye6200.patterns.SimpleSingleton;

public class Driver {

	public static void main(String[] args) {
		System.out.println("executing main...");
		NortheasternU.demo();
		SimplePersonFactory.demo();
		SimpleSingleton.demo();
		LazySingleton.demo();
		ExplosionController.demo();
		ExplosionController.demo2();
	}

}
