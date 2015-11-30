/*
 * 	1. Template Method Abstract Class
 *		Since we want some of the methods to be implemented by subclasses, we
 *		have to make our base class as abstract class.
 */

package com.braffa.behavioral.template.journaldev;

public abstract class AbstractHouseTemplate {

	// template method, final so subclasses can't override
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}

	// default implementation
	private void buildWindows() {
		System.out.println("Default Building Glass Windows");
	}

	// methods to be implemented by subclasses
	public abstract void buildWalls();

	public abstract void buildPillars();

	private void buildFoundation() {
		System.out.println("Default Building foundation with cement,iron rods and sand");
	}
}
