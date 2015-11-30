package com.braffa.creational.abstractfactory;

public class NYErrorXMLParser implements IXMLParser{

	@Override
	public String parse() {
		System.out.println("NY Parsing error XML...");
		return "NY Error XML Message";
	}

}
