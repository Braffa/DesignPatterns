package com.braffa.creational.abstractfactory;

public class NYResponseXMLParser implements IXMLParser{

	@Override
	public String parse() {
		System.out.println("NY Parsing response XML...");
		return "NY Response XML Message";
	}

}
