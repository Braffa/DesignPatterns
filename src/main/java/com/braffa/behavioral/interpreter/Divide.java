package com.braffa.behavioral.interpreter;

public class Divide implements IExpression  {
	
	private final IExpression leftExpression;
	private final IExpression rightExpression;

	public Divide (IExpression leftExpression, IExpression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int interpret() {
		return leftExpression.interpret() / rightExpression.interpret();
	}
}
