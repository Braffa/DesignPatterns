package com.braffa.creational.abstractfactory;

public class NYFeedbackXMLParser implements IXMLParser{

	@Override
	public String parse() {
		System.out.println("NY Parsing feedback XML...");
		return "NY Feedback XML Message";
	}

}

