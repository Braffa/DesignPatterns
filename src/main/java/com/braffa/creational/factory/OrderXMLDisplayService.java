package com.braffa.creational.factory;

public class OrderXMLDisplayService extends AbstractDisplayService {

	@Override
	public IXMLParser getParser() {
		return new OrderXMLParser();
	}

}
