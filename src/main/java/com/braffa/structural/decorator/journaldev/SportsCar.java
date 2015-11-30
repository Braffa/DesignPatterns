/*
 * 	Concrete Decorators
 *		Extending the base decorator functionality and modifying the component
 *		behavior accordingly. We can have concrete decorator classes as LuxuryCar
 *		and SportsCar.
 * 
 */

package com.braffa.structural.decorator.journaldev;

public class SportsCar extends CarDecorator {

	public SportsCar(ICar c) {
		super(c);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.println(" Adding features of Sports Car.");
	}
}
