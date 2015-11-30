/*
 * 	To solve the issues with large number of parameters  provide a constructor with required parameters and then 
 *  different setter methods to set the optional parameters but the problem with this is that the Object state will
 *	be inconsistent until unless all the attributes are set explicitly.
 *
 *	Builder pattern solves the issue with large number of optional parameters
 *	and inconsistent state by providing a way to build the object
 *
 *	The Computer class has only getter methods and no public constructor, 
 *	so the only way to get a Computer object is through the ComputerBuilder class.
 *
 *	1. 	Create a static nested class (builder class) and then copy all the arguments from the outer class to the Builder class. 
 *    	We should follow the naming convention and if the class name is Computer then builder class should be 
 *     	named as ComputerBuilder.
 *	2. 	The Builder class should have a public constructor with all the
 *		required attributes as parameters.
 *	3.	Builder class should have methods to set the optional parameters and it should return the same Builder object after 
 *		setting the optional attribute.
 *	4.	The final step is to provide a build() method in the builder class that will return the Object needed by client program. 
 *		For this we need to have a private constructor in the Class with Builder class as argument.
 */


package com.braffa.creational.builder.journaldev.computer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.braffa.creational.builder.journaldev.computer.Computer;

public class TestComputer {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAllAttributeSet() {
		// Using builder to get the object in a single line of code and
		// without any inconsistent state or argument management issues

		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
				.setBluetoothEnabled(true).setGraphicsCardEnabled(true)
				.setMonitord("24 inch").build();
		System.out.println(comp.toString());
		assertEquals("incorrect HDD    ", "500 GB", comp.getHDD());
		assertEquals("Incorrect RAM    ", "2 GB", comp.getRAM());
		assertEquals("Incorrect Monitor", "24 inch", comp.getMonitor());
		assertTrue("GraphicsCard should be enabled", comp.isGraphicsCardEnabled() );
		assertTrue("Bluetooth should be enabled", comp.isBluetoothEnabled() );
	}

	@Test
	public void testWithoutMonitor() {
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
				.setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println(comp.toString());
		assertEquals("incorrect HDD    ", "500 GB", comp.getHDD());
		assertEquals("Incorrect RAM    ", "2 GB", comp.getRAM());
		assertEquals("Incorrect Monitor", null, comp.getMonitor());
		assertTrue("GraphicsCard should be enabled", comp.isGraphicsCardEnabled() );
		assertTrue("Bluetooth should be enabled", comp.isBluetoothEnabled() );
	}
	
	@Test
	public void testwithoutGraphicsCardEnabled() {
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
				.setBluetoothEnabled(true).setMonitord("36 inch").build();
		System.out.println(comp.toString());
		assertEquals("incorrect HDD    ", "500 GB", comp.getHDD());
		assertEquals("Incorrect RAM    ", "2 GB", comp.getRAM());
		assertEquals("Incorrect Monitor", "36 inch", comp.getMonitor());
		assertFalse("GraphicsCard should be enabled", comp.isGraphicsCardEnabled() );
		assertTrue("Bluetooth should be enabled", comp.isBluetoothEnabled() );
	}
	
	@Test
	public void testwithoutBluetoothEnabled() {
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").build();
		System.out.println(comp.toString());
		assertEquals("incorrect HDD    ", "500 GB", comp.getHDD());
		assertEquals("Incorrect RAM    ", "2 GB", comp.getRAM());
		assertEquals("Incorrect Monitor", null, comp.getMonitor());
		assertFalse("GraphicsCard should be enabled", comp.isGraphicsCardEnabled() );
		assertFalse("Bluetooth should be enabled", comp.isBluetoothEnabled() );
	}
}
