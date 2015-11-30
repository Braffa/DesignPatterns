package com.braffa.behavioral.visitor;

public interface IElement {
	
	public void accept(IVisitor visitor);
}
