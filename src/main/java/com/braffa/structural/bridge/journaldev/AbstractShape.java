package com.braffa.structural.bridge.journaldev;

public abstract class AbstractShape {
	// Composition - implementor
	protected IColor color;

	// constructor with implementor as input argument
	public AbstractShape(IColor c) {
		this.color = c;
	}

	abstract public String applyColor();
}