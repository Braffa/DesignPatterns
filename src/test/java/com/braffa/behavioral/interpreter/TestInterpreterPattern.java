/*
 * http://www.javacodegeeks.com/2015/09/interpreter-design-pattern.html
 * 
 *	Use the Interpreter pattern when there is a language to interpret, and you can represent statements in the language as abstract syntax trees. The Interpreter pattern works best when
 *		1.	The grammar is simple. For complex grammars, the class hierarchy for the grammar becomes large and unmanageable. 
 *			Tools such as parser generators are a better alternative in such cases. They can interpret expressions without 
 *			building abstract syntax trees, which can save space and possibly time.
 *		2.	Efficiency is not a critical concern. The most efficient interpreters are usually not implemented by interpreting 
 *			parse trees directly but by first translating them into another form. For example, regular expressions are often 
 *			transformed into state machines. But even then, the translator can be implemented by the Interpreter pattern, so the 
 *			pattern is still applicable.
 */
package com.braffa.behavioral.interpreter;

import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class TestInterpreterPattern {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMinus() {
		String tokenString = "7 3 -";
		Stack<IExpression> stack = new Stack<>();
		String[] tokenArray = tokenString.split(" ");
		for (String s : tokenArray) {
			if (ExpressionUtils.isOperator(s)) {
				IExpression rightExpression = stack.pop();
				IExpression leftExpression = stack.pop();
				IExpression operator = ExpressionUtils.getOperator(s,
						leftExpression, rightExpression);
				int result = operator.interpret();
				stack.push(new Number(result));
			} else {
				IExpression i = new Number(Integer.parseInt(s));
				stack.push(i);
			}
		}
		int result = stack.pop().interpret();
		System.out.println("( " + tokenString + " ): " + result);
		assertTrue("Incorrect result from mius ", 4 == result);
	}

	@Test
	public void testPlus() {
		String tokenString = "2 1 +";
		Stack<IExpression> stack = new Stack<>();
		String[] tokenArray = tokenString.split(" ");
		for (String s : tokenArray) {
			if (ExpressionUtils.isOperator(s)) {
				IExpression rightExpression = stack.pop();
				IExpression leftExpression = stack.pop();
				IExpression operator = ExpressionUtils.getOperator(s,
						leftExpression, rightExpression);
				int result = operator.interpret();
				stack.push(new Number(result));
			} else {
				IExpression i = new Number(Integer.parseInt(s));
				stack.push(i);
			}
		}
		int result = stack.pop().interpret();
		System.out.println("( " + tokenString + " ): " + result);
		assertTrue("Incorrect result from plus ", 3 == result);
	}

	@Test
	public void testTimes() {
		String tokenString = "3 4 *";
		Stack<IExpression> stack = new Stack<>();
		String[] tokenArray = tokenString.split(" ");
		for (String s : tokenArray) {
			if (ExpressionUtils.isOperator(s)) {
				IExpression rightExpression = stack.pop();
				IExpression leftExpression = stack.pop();
				IExpression operator = ExpressionUtils.getOperator(s,
						leftExpression, rightExpression);
				int result = operator.interpret();
				stack.push(new Number(result));
			} else {
				IExpression i = new Number(Integer.parseInt(s));
				stack.push(i);
			}
		}
		int result = stack.pop().interpret();
		System.out.println("( " + tokenString + " ): " + result);
		assertTrue("Incorrect result from plus ", 12 == result);
	}

	@Test
	public void testDivide() {
		String tokenString = "30 5 /";
		Stack<IExpression> stack = new Stack<>();
		String[] tokenArray = tokenString.split(" ");
		for (String s : tokenArray) {
			if (ExpressionUtils.isOperator(s)) {
				IExpression rightExpression = stack.pop();
				IExpression leftExpression = stack.pop();
				IExpression operator = ExpressionUtils.getOperator(s,
						leftExpression, rightExpression);
				int result = operator.interpret();
				stack.push(new Number(result));
			} else {
				IExpression i = new Number(Integer.parseInt(s));
				stack.push(i);
			}
		}
		int result = stack.pop().interpret();
		System.out.println("( " + tokenString + " ): " + result);
		assertTrue("Incorrect result from plus ", 6 == result);
	}

	@Test
	public void testComplex() {
		String tokenString = "7 3 - 2 1 + *";
		Stack<IExpression> stack = new Stack<>();
		String[] tokenArray = tokenString.split(" ");
		for (String s : tokenArray) {
			if (ExpressionUtils.isOperator(s)) {
				IExpression rightExpression = stack.pop();
				IExpression leftExpression = stack.pop();
				IExpression operator = ExpressionUtils.getOperator(s,
						leftExpression, rightExpression);
				int result = operator.interpret();
				stack.push(new Number(result));
			} else {
				IExpression i = new Number(Integer.parseInt(s));
				stack.push(i);
			}
		}
		int result = stack.pop().interpret();
		System.out.println("( " + tokenString + " ): " + result);
		assertTrue("Incorrect result from plus ", 12 == result);
	}

	@Test
	public void testAll() {
		String tokenString = "7 3 - 2 1 + * 3 /";
		Stack<IExpression> stack = new Stack<>();
		String[] tokenArray = tokenString.split(" ");
		for (String s : tokenArray) {
			if (ExpressionUtils.isOperator(s)) {
				IExpression rightExpression = stack.pop();
				IExpression leftExpression = stack.pop();
				IExpression operator = ExpressionUtils.getOperator(s,
						leftExpression, rightExpression);
				int result = operator.interpret();
				stack.push(new Number(result));
			} else {
				IExpression i = new Number(Integer.parseInt(s));
				stack.push(i);
			}
		}
		int result = stack.pop().interpret();
		System.out.println("( " + tokenString + " ): " + result);
		assertTrue("Incorrect result from plus ", 4 == result);
	}
}
