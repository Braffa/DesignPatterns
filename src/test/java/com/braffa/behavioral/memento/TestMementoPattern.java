/*
 * http://www.javacodegeeks.com/2015/09/memento-design-pattern.html
 * 
 * 	Use the Memento Pattern in the following cases:
 *		A snapshot of (some portion of) an object’s state must be saved so that it can be restored to that state later, and
 *		A direct interface to obtaining the state would expose implementation details and break the object’s encapsulation.
 */

package com.braffa.behavioral.memento;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMementoPattern {
	CareTaker careTaker;
	Originator originator;

	@Before
	public void setUp() throws Exception {
		careTaker = new CareTaker();
		originator = new Originator(5, 10, careTaker);
	}
	
	@Test
	public void testInitialState () {
		assertTrue("Incorrect originator y value ", 10 == originator.getY());
		assertTrue("Incorrect originator x value ", 5 == originator.getX());
	}

	@Test
	public void testUndo () {
		originator.setX(originator.getY() * 51);
		
		assertTrue("Incorrect originator y value ", 10 == originator.getY());
		assertTrue("Incorrect originator x value ", 510 == originator.getX());
		
		originator.createSavepoint("SAVE1");
		
		originator.setY(originator.getX() / 22);
		
		assertTrue("Incorrect originator y value ", 23.181818181818183 == originator.getY());
		assertTrue("Incorrect originator x value ", 510 == originator.getX());
		
		originator.undo();
		
		assertTrue("Incorrect originator y value ", 10 == originator.getY());
		assertTrue("Incorrect originator x value ", 510 == originator.getX());
	}
	
	@Test
	public void testUndoSave2 () {
		originator.setX(originator.getY() * 51);
		originator.createSavepoint("SAVE1");
		originator.setY(originator.getX() / 22);
		originator.undo();
		originator.setX(Math.pow(originator.getX(), 3));
		originator.createSavepoint("SAVE2");
		
		assertTrue("Incorrect originator y value ", 10 == originator.getY());
		assertTrue("Incorrect originator x value ",  1.32651E8 == originator.getX());
		
		originator.setY(originator.getX() - 30);
		originator.createSavepoint("SAVE3");
		
		assertTrue("Incorrect originator y value ", 1.3265097E8 == originator.getY());
		assertTrue("Incorrect originator x value ", 1.32651E8 == originator.getX());
		
		originator.setY(originator.getX() / 22);
		originator.createSavepoint("SAVE4");
		
		assertTrue("Incorrect originator y value ", 6029590.909090909 == originator.getY());
		assertTrue("Incorrect originator x value ", 1.32651E8 == originator.getX());
		
		originator.undo("SAVE2");
		assertTrue("Incorrect originator y value ", 10.0 == originator.getY());
		assertTrue("Incorrect originator x value ", 1.32651E8 == originator.getX());
	}
	
	@Test
	public void testUndoAll () {
		originator.setX(originator.getY() * 51);
		originator.createSavepoint("SAVE1");
		originator.setY(originator.getX() / 22);
		originator.setX(Math.pow(originator.getX(), 3));
		originator.createSavepoint("SAVE2");
		originator.setY(originator.getX() - 30);
		originator.createSavepoint("SAVE3");
		originator.setY(originator.getX() / 22);
		originator.createSavepoint("SAVE4");

		originator.undoAll();
		
		assertTrue("Incorrect originator y value ", 10.0 == originator.getY());
		assertTrue("Incorrect originator x value ", 5 == originator.getX());
	}
}
