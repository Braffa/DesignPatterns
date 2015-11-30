package com.braffa.behavioral.visitor;

public interface IVisitor {
	public void visit(HtmlElement element);
	public void visit(HtmlParentElement parentElement);
}
