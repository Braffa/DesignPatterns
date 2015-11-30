package com.braffa.behavioral.strategy;

public class CapTextFormatter implements ITextFormatter{

	@Override
	public String  format(String text) {
		//System.out.println("[CapTextFormatter]: "+text.toUpperCase());
		return text.toUpperCase();
	}

}
