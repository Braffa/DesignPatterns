/*
 * http://www.javacodegeeks.com/2015/09/iterator-design-pattern.html
 * 
 *	Use the Iterator pattern:
 *		1.	To access an aggregate object’s contents without exposing its internal representation.
 *		2.  To support multiple traversals of aggregate objects.
 *		3.	To provide a uniform interface for traversing different aggregate structures (that is, to support polymorphic iteration).
 */

package com.braffa.behavioral.iterator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestIteratorPattern {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIterator () {
		ShapeStorage storage = new ShapeStorage();
		storage.addShape("Polygon");
		storage.addShape("Hexagon");
		storage.addShape("Circle");
		storage.addShape("Rectangle");
		storage.addShape("Square");
		
		assertTrue("Incorrect number of objects in shape storage ", 5 == storage.length());

		ShapeIterator iterator = new ShapeIterator(storage.getShapes());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void testIteratorRemove() {
		ShapeStorage storage = new ShapeStorage();
		storage.addShape("Polygon");
		storage.addShape("Hexagon");
		storage.addShape("Circle");
		storage.addShape("Rectangle");
		storage.addShape("Square");
		assertTrue("Incorrect number of objects in shape storage ", 5 == storage.length());
		
		ShapeIterator iterator = new ShapeIterator(storage.getShapes());
		iterator = new ShapeIterator(storage.getShapes());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		assertTrue("Incorrect number of objects in shape storage ", 2 == storage.length());
	}

}
