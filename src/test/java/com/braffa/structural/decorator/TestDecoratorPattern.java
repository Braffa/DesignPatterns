/*
 * http://www.javacodegeeks.com/2015/09/decorator-design-pattern.html
 * 
 *	Use the Decorator pattern in the following cases:
 *		1.	To add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.
 *		2.	For responsibilities that can be withdrawn.
 *		3.	When extension by sub-classing is impractical. Sometimes a large number of independent extensions are possible and would 
 *			produce an explosion of subclasses to support every combination. Or a class definition may be hidden or otherwise unavailable for sub-classing.
 */

package com.braffa.structural.decorator;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

public class TestDecoratorPattern {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSimplyVegPizza() {
		DecimalFormat dformat = new DecimalFormat("#.##");
		IPizza pizza = new SimplyVegPizza();
		pizza = new RomaTomatoes(pizza);
		pizza = new GreenOlives(pizza);
		pizza = new Spinach(pizza);
		
		System.out.println("Desc: " + pizza.getDesc());
		System.out.println("Price: " + dformat.format(pizza.getPrice()));
		
		assertEquals("Incorrect pizza description ", "SimplyVegPizza (230), Roma Tomatoes (5.20), Green Olives (5.47), Spinach (7.92)", pizza.getDesc());
		assertEquals("Incorrect pizza price ", "248.59", dformat.format(pizza.getPrice()));

	}

	@Test
	public void testSimplyNonVegPizza() {
		DecimalFormat dformat = new DecimalFormat("#.##");
		IPizza pizza = new SimplyNonVegPizza();

		pizza = new Meat(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Ham(pizza);

		System.out.println("Desc: " + pizza.getDesc());
		System.out.println("Price: " + dformat.format(pizza.getPrice()));
		
		assertEquals("Incorrect pizza description ", "SimplyNonVegPizza (350), Meat (14.25), Cheese (20.72), Cheese (20.72), Ham (18.12)", pizza.getDesc());
		assertEquals("Incorrect pizza price ", "423.81", dformat.format(pizza.getPrice()));
	}
}
