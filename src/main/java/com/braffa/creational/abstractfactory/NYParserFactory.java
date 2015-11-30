package com.braffa.creational.abstractfactory;

public class NYParserFactory implements IAbstractParserFactory {

	@Override
	public IXMLParser getParserInstance(String parserType) {
		
		switch(parserType){
			case "NYERROR": return new NYErrorXMLParser();
			case "NYFEEDBACK": return new NYFeedbackXMLParser();
			case "NYORDER": return new NYOrderXMLParser();
			case "NYRESPONSE": return new NYResponseXMLParser();
		}
		
		return null;
	}

}
