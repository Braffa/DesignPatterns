package com.braffa.behavioral.template.journaldev2;

public class GlassHouse2 extends AbstractHouseTemplate2 {

	@Override
	public void buildWalls() {
		house.setWalls("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		house.setPillars("Building Pillars with glass coating");
	}

}
