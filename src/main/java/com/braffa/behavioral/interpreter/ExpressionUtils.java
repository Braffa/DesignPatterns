package com.braffa.behavioral.interpreter;

public class ExpressionUtils {

	public static boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
			return true;
		else
			return false;
	}
	
	public static IExpression getOperator(String s, IExpression left,	IExpression right) {
		switch (s) {
		case "+":
			return new Add(left, right);
		case "-":
			return new Substract(left, right);
		case "*":
			return new Product(left, right);
		case "/":
			return new Divide(left, right);
		}
		return null;
	}

}
