package com.braffa.creational.factory;

public class FeedbackXML implements IXMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing feedback XML...");
		return "Feedback XML Message";
	}
}