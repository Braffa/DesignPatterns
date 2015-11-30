package com.braffa.creational.factory;

public class ErrorXMLDisplayService extends AbstractDisplayService {

	@Override
	public IXMLParser getParser() {
		return new ErrorXMLParser();
	}

}