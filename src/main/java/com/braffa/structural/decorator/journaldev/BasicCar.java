/*
 * Component Implementation
 * 
 * 	The basic implementation of the component interface. We can have
 *	BasicCar class as our component implementation.
 * 
 */

package com.braffa.structural.decorator.journaldev;

public class BasicCar implements ICar {

	@Override
	public void assemble() {
		System.out.println("Basic Car.");
	}

}
