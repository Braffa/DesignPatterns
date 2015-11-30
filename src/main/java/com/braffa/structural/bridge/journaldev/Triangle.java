package com.braffa.structural.bridge.journaldev;

public class Triangle extends AbstractShape {

	public Triangle(IColor c) {
		super(c);
	}

	@Override
	public String applyColor() {
		return color.applyColor();
	}
}