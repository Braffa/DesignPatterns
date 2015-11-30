package com.braffa.creational.abstractfactory.journaldev.factory;

import com.braffa.creational.abstractfactory.journaldev.superclass.Computer;

public interface IComputerAbstractFactory {

	/*
	 * Notice that createComputer() method is returning an instance of super
	 * class Computer. Now our factory classes will implement this interface and
	 * return their respective sub-class.
	 */

	public Computer createComputer();

}
