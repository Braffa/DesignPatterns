package com.braffa.creational.factory;

public class OrderXMLParser implements IXMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing order XML...");
		return "Order XML Message";
	}

}
