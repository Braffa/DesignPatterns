package com.braffa.behavioral.strategy;

public class LowerTextFormatter implements ITextFormatter{

	@Override
	public String format(String text) {
		//System.out.println("[LowerTextFormatter]: "+text.toLowerCase());
		return text.toLowerCase();
	}

}
