package com.braffa.creational.abstractfactory;

public class TWParserFactory implements IAbstractParserFactory {

	@Override
	public IXMLParser getParserInstance(String parserType) {
		
		switch(parserType){
			case "TWERROR": return new TWErrorXMLParser();
			case "TWFEEDBACK": return new TWFeedbackXMLParser();
			case "TWORDER": return new TWOrderXMLParser();
			case "TWRESPONSE": return new TWResponseXMLParser();
		}
		
		return null;
	}

}
