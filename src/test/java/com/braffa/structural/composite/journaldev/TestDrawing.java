/*
 * 	Composite Pattern consists of following objects.
 * 
 *		1.	Base Component (IShape)
 *				Base component is the interface for all objects in
 *				the composition, client program uses base component to work with
 *				the objects in the composition. It can be an interface or an abstract
 *				class with some methods common to all the objects.
 *		2.	Leaf (circle, triangle)
 *				Defines the behaviour for the elements in the composition. It is
 *				the building block for the composition and implements base
 *				component. It doesn’t have references to other Components.
 * 		3.	Composite (Drawing)
 * 				It consists of leaf elements and implements the
 *				operations in base component.
 *
 *	Notice that composite also implements component and behaves similar to
 *	leaf except that it can contain group of leaf elements.
 *
 *	Important Points about Composite Pattern
 *		1.	Composite pattern should be applied only when the group of objects
 *			should behave as the single object.
 *		2.	Composite pattern can be used to create a tree like structure.
 */

package com.braffa.structural.composite.journaldev;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.braffa.structural.composite.journaldev.basecomponent.IShape;
import com.braffa.structural.composite.journaldev.composite.Drawing;
import com.braffa.structural.composite.journaldev.leafobjects.Circle;
import com.braffa.structural.composite.journaldev.leafobjects.Triangle;

public class TestDrawing {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

		IShape tri = new Triangle();
		IShape tri1 = new Triangle();
		IShape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);
		
		assertTrue("drawing Should have 3 shapes ", 3 == drawing.getNoOfShapes());
		
		assertEquals("should be triangle ", drawing.getShape(0).getClass(), Triangle.class);
		assertEquals("should be triangle ", drawing.getShape(1).getClass(), Triangle.class);
		assertEquals("should be circle   ", drawing.getShape(2).getClass(), Circle.class);
		
		drawing.draw("Red");
		
		drawing.clear();
		
		assertTrue("drawing Should have no shapes ", 0 == drawing.getNoOfShapes());
		
		drawing.add(tri);
		drawing.add(cir);
		
		assertTrue("drawing Should have 2 shapes ", 2 == drawing.getNoOfShapes());
		assertEquals("should be triangle ", drawing.getShape(0).getClass(), Triangle.class);
		assertEquals("should be circle   ", drawing.getShape(1).getClass(), Circle.class);
		
		drawing.draw("Green");
	}

}
