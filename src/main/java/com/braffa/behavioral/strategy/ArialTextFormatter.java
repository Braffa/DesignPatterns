package com.braffa.behavioral.strategy;

public class ArialTextFormatter implements ITextFormatter {

	@Override
	public String format(String text) {
		//System.out.println("[ArialTextFormatter]: "+text);
		return text;
	}

}
