package com.braffa.creational.factory;

public class ErrorXMLParser implements IXMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing error XML...");
		return "Error XML Message";
	}

}