/*
 * 	To overcome the problem with Reflection, Joshua Bloch suggests the use of
 *	Enum to implement Singleton design pattern as Java ensures that any enum
 *	value is instantiated only once in a Java program. Since Java Enum values
 *	are globally accessible, so is the singleton. The drawback is that the enum
 *	type is somewhat inflexible; for example, it does not allow lazy
 *	initialization.
 */

package com.braffa.creational.singleton;

public class SingletoneEnum {

	public enum SingleEnum {
		SINGLETON_ENUM, INSTANCE;
		public static void doSomething() {
			// do something
		}
	}
}
