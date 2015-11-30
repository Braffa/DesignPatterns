package com.braffa.creational.abstractfactory.journaldev.factory;

import com.braffa.creational.abstractfactory.journaldev.superclass.Computer;

public class ComputerFactory {

	public static Computer getComputer(IComputerAbstractFactory factory){
		return factory.createComputer();
		}
	
}
