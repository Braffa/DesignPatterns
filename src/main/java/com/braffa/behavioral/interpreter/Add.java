package com.braffa.behavioral.interpreter;

public class Add implements IExpression{
	
	private final IExpression leftExpression;
	private final IExpression rightExpression;

	public Add(IExpression leftExpression, IExpression rightExpression ){
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	@Override
	public int interpret() {
		return leftExpression.interpret() + rightExpression.interpret();
	}

}
