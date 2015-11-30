package com.braffa.creational.factory;

public class ResponseXMLParser implements IXMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing response XML...");
		return "Response XML Message";
	}

}
