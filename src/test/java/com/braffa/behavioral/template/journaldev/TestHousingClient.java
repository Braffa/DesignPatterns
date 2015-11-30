package com.braffa.behavioral.template.journaldev;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestHousingClient {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWoodenHouse() {

		AbstractHouseTemplate houseType = new WoodenHouse();
		houseType.buildHouse();
	}
	
	@Test
	public void testGlassHousee() {

		AbstractHouseTemplate houseType = new WoodenHouse();
		houseType = new GlassHouse();
		houseType.buildHouse();
	}

}
