package com.braffa.creational.abstractfactory;

public class TWResponseXMLParser implements IXMLParser{

	@Override
	public String parse() {
		System.out.println("TW Parsing response XML...");
		return "TW Response XML Message";
	}

}
