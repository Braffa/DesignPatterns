/*
 * 	Template Method Concrete Classes
 *		We can have different type of houses, such as Wooden House and Glass House.
 */
package com.braffa.behavioral.template.journaldev2;

public class WoodenHouse2 extends AbstractHouseTemplate2 {
	
	@Override
	public void buildWalls() {
		house.setWalls("Building Wooden Walls");
	}

	@Override
	public void buildPillars() {
		house.setPillars("Building Pillars with Wood coating");
	}

}
