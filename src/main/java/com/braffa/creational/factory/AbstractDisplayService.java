package com.braffa.creational.factory;

public abstract class AbstractDisplayService {
	
	public void display() {
		IXMLParser parser = getParser();
		String msg = parser.parse();
		System.out.println(msg);
	}

	protected abstract IXMLParser getParser();
}
