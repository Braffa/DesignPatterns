package com.braffa.creational.abstractfactory.journaldev.factory;

import com.braffa.creational.abstractfactory.journaldev.subclass.PC;
import com.braffa.creational.abstractfactory.journaldev.superclass.Computer;

public class PCFactory implements IComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}

}
