/*
  	Lazy initialization method to implement Singleton pattern creates the
	instance in the global access method. Here is the sample code for creating
	Singleton class with this.
	
	The above implementation works fine in case of single threaded
	environment but when it comes to multithreaded systems, it can cause issues
	if multiple threads are inside the if loop at the same time. It will destroy the
	singleton pattern and both threads will get the different instances of
	singleton class. In next section, we will see different ways to create a threadsafe
	singleton class.
	
 */

package com.braffa.creational.singleton;

public class SingletonLazy {

	private static SingletonLazy sc = null;

	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if (sc == null) {
			sc = new SingletonLazy();
		}
		return sc;
	}
}
