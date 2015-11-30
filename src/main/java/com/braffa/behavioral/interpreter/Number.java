package com.braffa.behavioral.interpreter;

public class Number implements IExpression{

	private final int n;
	
	public Number(int n){
		this.n = n;
	}
	@Override
	public int interpret() {
		return n;
	}

}
