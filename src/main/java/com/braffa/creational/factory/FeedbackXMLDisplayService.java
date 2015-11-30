package com.braffa.creational.factory;

public class FeedbackXMLDisplayService extends AbstractDisplayService {

	@Override
	public IXMLParser getParser() {
		return new FeedbackXML();
	}

}