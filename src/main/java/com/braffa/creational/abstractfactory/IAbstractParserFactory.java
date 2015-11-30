package com.braffa.creational.abstractfactory;

public interface IAbstractParserFactory {
	public IXMLParser getParserInstance(String parserType);
}
