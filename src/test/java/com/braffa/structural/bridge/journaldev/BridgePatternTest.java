/*
 * Bridge Pattern
 * 
 *	When we have interface hierarchies in both interfaces as well as
 *	implementations, then builder design pattern is used to decouple the
 *	interfaces from implementation and hiding the implementation details from
 *	the client programs
 *
 *	The implementation of bridge design pattern follows the notion to prefer
 *	Composition over inheritance.
 *
 *	Bridge design pattern can be used when both abstraction and implementation
 *	can have different hierarchies independently and we want to hide the
 *	implementation from the client application.
 * 
 */

package com.braffa.structural.bridge.journaldev;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BridgePatternTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTriangle() {
		AbstractShape tri = new Triangle(new RedColor());
		assertEquals("Triangle filled with color red.", "Red", tri.applyColor());
	}
	
	@Test
	public void testPentagon() {
		AbstractShape pent = new Pentagon(new GreenColor());
		assertEquals("Pentagon filled with color green.", "Green", pent.applyColor());
	}

}
