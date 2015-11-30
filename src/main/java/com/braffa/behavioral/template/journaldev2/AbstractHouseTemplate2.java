/*
 * 	1. Template Method Abstract Class
 *		Since we want some of the methods to be implemented by subclasses, we
 *		have to make our base class as abstract class.
 */

package com.braffa.behavioral.template.journaldev2;

public abstract class AbstractHouseTemplate2 {
	
	protected House2 house;

	// template method, final so subclasses can't override
	public final void buildHouse() {
		house = new House2();
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		house.complete = true;
	}

	// default implementation
	private void buildWindows() {
		house.setWindows("Default Building Glass Windows");
	}

	// methods to be implemented by subclasses
	public abstract void buildWalls();

	public abstract void buildPillars();

	private void buildFoundation() {
		house.setFoundation("Default Building foundation with cement,iron rods and sand");
	}
	
	protected String getFoundation() {
		return house.foundation;
	}

	protected void setFoundation(String foundation) {
		house.foundation = foundation;
	}

	protected String getPillars() {
		return house.pillars;
	}

	protected void setPillars(String pillars) {
		house.pillars = pillars;
	}

	protected String getWalls() {
		return house.walls;
	}

	protected void setWalls(String walls) {
		house.walls = walls;
	}

	protected String getWindows() {
		return house.windows;
	}

	protected void setWindows(String windows) {
		house.windows = windows;
	}
	
	protected String isComplete () {
		if (house.isComplete()) {
			return "House is complete";
		} else {
			return "House under construction";	
		}
	}

	@Override
	public String toString () {
		StringBuffer sb = new StringBuffer ();
		sb.append("\nfoundation " + house.foundation );
		sb.append("\npillars    " + house.pillars );
		sb.append("\nwalls      " + house.walls );
		sb.append("\nwindows    " + house.windows );
		sb.append("\n           " + this.isComplete() );
		return sb.toString();
	}
}
