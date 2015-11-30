package com.braffa.behavioral.template.journaldev2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.braffa.behavioral.template.journaldev2.*;
public class TestHousingClient2 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWoodenHouse() {

		AbstractHouseTemplate2 houseType = new WoodenHouse2();
		houseType.buildHouse();
		
		assertEquals("wooden house foundations incorrect ", "Default Building foundation with cement,iron rods and sand", houseType.getFoundation());
		assertEquals("wooden house pillars incorrect ", "Building Pillars with Wood coating", houseType.getPillars());
		assertEquals("wooden house walls incorrect ", "Building Wooden Walls", houseType.getWalls());
		assertEquals("wooden house windows incorrect ", "Default Building Glass Windows", houseType.getWindows());
		assertEquals("house was not completet ", "House is complete", houseType.isComplete());
		
		System.out.println(houseType.toString());
	}
	
	@Test
	public void testGlassHousee() {

		AbstractHouseTemplate2 houseType = new GlassHouse2();
		houseType.buildHouse();
		
		assertEquals("Glass house foundations incorrect ", "Default Building foundation with cement,iron rods and sand", houseType.getFoundation());
		assertEquals("Glass house pillars incorrect ", "Building Pillars with glass coating", houseType.getPillars());
		assertEquals("Glass house walls incorrect ", "Building Glass Walls", houseType.getWalls());
		assertEquals("Glass house windows incorrect ", "Default Building Glass Windows", houseType.getWindows());
		assertEquals("house was not completet ", "House is complete", houseType.isComplete());
		
		System.out.println(houseType.toString());
	}

}
