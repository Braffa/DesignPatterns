package com.braffa.creational.abstractfactory;

public class TWErrorXMLParser implements IXMLParser{

	@Override
	public String parse() {
		System.out.println("TW Parsing error XML...");
		return "TW Error XML Message";
	}

}
