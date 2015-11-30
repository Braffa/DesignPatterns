/*
 *	Decorator
 * 
 *		Decorator class implements the component interface and it has a HAS-A
 *		relationship with the component interface. The component variable should
 *		be accessible to the child decorator classes, so we will make this variable
 *		protected.
 */

package com.braffa.structural.decorator.journaldev;

public class CarDecorator implements ICar {

	protected ICar car;

	public CarDecorator(ICar c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}

}
