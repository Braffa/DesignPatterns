package com.braffa.creational.abstractfactory;

public final class ParserFactoryProducer {

	private ParserFactoryProducer(){
		throw new AssertionError();
	}

	public static IAbstractParserFactory getFactory(String factoryType){
		
		switch(factoryType)
		{
			case "NYFactory": return new NYParserFactory();
			case "TWFactory": return new TWParserFactory();
		}

		return null;
	}

}
