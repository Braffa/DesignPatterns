/*
 * 	1. 	We can keep Factory class Singleton or we can keep the method that
 *		returns the subclass as static.
 *	2. 	Notice that based on the input parameter, different subclass is created
 *		and returned.
 *
 */
package com.braffa.creational.factory.journaldev.factory;

import com.braffa.creational.factory.journaldev.subclass.PC;
import com.braffa.creational.factory.journaldev.subclass.Server;
import com.braffa.creational.factory.journaldev.superclass.Computer;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd,
			String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);
		return null;
	}

}
