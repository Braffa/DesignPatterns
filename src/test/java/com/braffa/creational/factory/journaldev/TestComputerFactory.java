/*
 *	1. 	Factory pattern provides approach to code for interface rather than
 *		implementation.
 *	2.	Factory pattern removes the instantiation of actual implementation
 *		classes from client code, making it more robust, less coupled and easy
 *		to extend. For example, we can easily change PC class
 *		implementation because client program is unaware of this.
 *	3.	Factory pattern provides abstraction between implementation and
 *		client classes through inheritance.
 */

package com.braffa.creational.factory.journaldev;

import org.junit.Before;
import org.junit.Test;

import com.braffa.creational.factory.journaldev.factory.ComputerFactory;
import com.braffa.creational.factory.journaldev.superclass.Computer;

public class TestComputerFactory {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPc() {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500GB",
				"2.4 GHz");
		System.out.println("Factory PC Config::" + pc);
	}

	@Test
	public void testServer() {
		Computer server = ComputerFactory.getComputer("server", "16GB", "1 TB",
				"2.9 GHz");
		System.out.println("Factory Server Config::" + server);
	}
}
