package com.braffa.behavioral.visitor;

public class StyleVisitor implements IVisitor {

	@Override
	public void visit(HtmlElement element) {
		element.setStartTag(element.getStartTag().replace(">", " style='width:46px;'>"));
		
	}

	@Override
	public void visit(HtmlParentElement parentElement) {
		parentElement.setStartTag(parentElement.getStartTag().replace(">", " style='width:58px;'>"));
	}

}
