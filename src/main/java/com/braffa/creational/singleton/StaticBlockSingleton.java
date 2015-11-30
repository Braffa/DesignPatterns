/*
  	Static block initialization implementation is similar to eager initialization,
	except that instance of class is created in the static block that provides option
	for exception handling.
	
	Both eager initialization and static block initialization creates the instance
	even before it’s being used and that is not the best practice to use. So in
	further sections, we will learn how to create Singleton class that supports
	lazy initialization.
 */

package com.braffa.creational.singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
	}

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException(
					"Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
