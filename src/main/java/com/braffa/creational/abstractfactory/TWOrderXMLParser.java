package com.braffa.creational.abstractfactory;

public class TWOrderXMLParser implements IXMLParser{

	@Override
	public String parse() {
		System.out.println("TW Parsing order XML...");
		return "TW Order XML Message";
	}

}

