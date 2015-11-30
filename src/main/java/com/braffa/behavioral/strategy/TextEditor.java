package com.braffa.behavioral.strategy;

public class TextEditor {
	
	private final ITextFormatter textFormatter;
	
	public TextEditor(ITextFormatter textFormatter){
		this.textFormatter = textFormatter;
	}
	
	public String publishText(String text){
		return textFormatter.format(text);
	}

}
