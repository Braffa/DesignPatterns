/*
	SingletonLazyMultithreadedn works fine and provides thread-safety but it reduces
	the performance because of cost associated with the synchronized method,
	although we need it only for the first few threads who might create the
	separate instances (Read: Java Synchronization). To avoid this extra
	overhead every time, double checked locking principle is used. In this
	approach, the synchronized block is used inside if condition with an
	additional check to ensure that only one instance of singleton class is
	created.
	
 */

package com.braffa.creational.singleton;

public class SingletonLazyDoubleCheck {

	private volatile static SingletonLazyDoubleCheck sc = null;

	private SingletonLazyDoubleCheck() {
	}

	public static SingletonLazyDoubleCheck getInstance() {
		if (sc == null) {
			synchronized (SingletonLazyDoubleCheck.class) {
				if (sc == null) {
					sc = new SingletonLazyDoubleCheck();
				}
			}
		}
		return sc;
	}
}
