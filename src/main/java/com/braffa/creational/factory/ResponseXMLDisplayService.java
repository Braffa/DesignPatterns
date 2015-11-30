package com.braffa.creational.factory;

public class ResponseXMLDisplayService extends AbstractDisplayService {

	@Override
	public IXMLParser getParser() {
		return new ResponseXMLParser();
	}

}
