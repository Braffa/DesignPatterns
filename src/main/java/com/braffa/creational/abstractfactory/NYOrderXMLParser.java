package com.braffa.creational.abstractfactory;

public class NYOrderXMLParser implements IXMLParser{

	@Override
	public String parse() {
		System.out.println("NY Parsing order XML...");
		return "NY Order XML Message";
	}

}

