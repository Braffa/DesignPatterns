package com.braffa.structural.bridge.journaldev;

public class Pentagon extends AbstractShape {
	public Pentagon(IColor c) {
		super(c);
	}
	
	@Override
	public String applyColor() {
		return color.applyColor();
	}
}