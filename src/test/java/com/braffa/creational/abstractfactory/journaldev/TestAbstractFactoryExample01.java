/*
 * 	Abstract Factory is one of the Creational pattern and almost similar to
	Factory Pattern except the fact that it’s more like factory of factories.
	If you are familiar with factory design pattern in java, you will notice that
	we have a single Factory class that returns the different sub-classes based on
	the input provided and factory class uses if-else or switch statement to
	achieve this.
	
	In Abstract Factory pattern, we get rid of if-else block and have a factory
	class for each sub-class and then an Abstract Factory class that will return
	the sub-class based on the input factory class. At first it seems confusing but
	once you see the implementation, it’s really easy to grasp and understand the
	minor difference between Factory and Abstract Factory pattern.
	
	1.	Create abstract super class 										(computer)
	2.  Create sub classes extending super class							(PC and Server)
	3.	Create an Abstract Factory interface or abstract class.				(IComputerAbstractFactory)
			Notice that createComputer() method is returning an instance 
			of super class Computer. 
	4.	Create Factory Classes for Each sub-class 							(PCFactory and ServerFactory)
			The factory classes should implement this interface and 
			return their respective sub-class.
	5. 	Create a consumer class that will provide the entry point for the	(ComputerFactory)
		client classes to create sub-classes.	
			Notice that it’s a simple class and getComputer method is accepting
			ComputerAbstractFactory argument and returning Computer object.	
			
			
	Benefits of Abstract Factory Pattern
	
		1.	Abstract Factory pattern provides approach to code for interface rather Than implementation.
		2.	Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate 
			more products, for example we can add another sub-class Laptop and a factory LaptopFactory.
		3.	Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.

 */

package com.braffa.creational.abstractfactory.journaldev;

import org.junit.Before;
import org.junit.Test;

import com.braffa.creational.abstractfactory.journaldev.factory.ComputerFactory;
import com.braffa.creational.abstractfactory.journaldev.factory.PCFactory;
import com.braffa.creational.abstractfactory.journaldev.factory.ServerFactory;
import com.braffa.creational.abstractfactory.journaldev.superclass.Computer;

public class TestAbstractFactoryExample01 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB",
				"500 GB", "2.4 GHz"));

		Computer server = ComputerFactory.getComputer(new ServerFactory(
				"16 GB", "1 TB", "2.9 GHz"));

		System.out.println("AbstractFactory PC     Config::" + pc);
		System.out.println("AbstractFactory Server Config::" + server);
	}

}
