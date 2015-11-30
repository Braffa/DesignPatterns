/*
 * 	Template Method Concrete Classes
 *		We can have different type of houses, such as Wooden House and Glass House.
 */
package com.braffa.behavioral.template.journaldev;

public class WoodenHouse extends AbstractHouseTemplate {
	
	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
	}

}
