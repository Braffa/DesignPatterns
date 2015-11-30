/*
 * http://www.javacodegeeks.com/2015/09/strategy-design-pattern.html
 * 
 *	Use the Strategy pattern when:
 *		1.	Many related classes differ only in their behavior. Strategies provide a way to configure a class with one of many behaviors.
 *		2.	You need different variants of an algorithm. For example, you might define algorithms reflecting different space/time 
 *			trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms.
 *		3.	An algorithm uses data that clients shouldn’t know about. Use the Strategy pattern to avoid exposing complex, 
 *			algorithm-specific data structures.
 *		4.	A class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of 
 *			many conditionals, move related conditional branches into their own Strategy class.
 */

package com.braffa.behavioral.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestStrategyPattern {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testArialTextFormatter() {
		ITextFormatter formatter = new ArialTextFormatter();
		TextEditor editor = new TextEditor(formatter);
		String result = editor.publishText("Testing text in caps formatter");
		System.out.println(result);
		assertEquals("String incorrectly translated ", "Testing text in caps formatter", result);
	}

	@Test
	public void testCapTextFormatter() {
		ITextFormatter formatter = new CapTextFormatter();
		TextEditor editor = new TextEditor(formatter);
		String result = editor.publishText("Testing text in caps formatter");
		System.out.println(result);
		assertEquals("String incorrectly translated ", "TESTING TEXT IN CAPS FORMATTER", result);
	}

	@Test
	public void testLowerTextFormatter() {

		ITextFormatter formatter = new LowerTextFormatter();
		TextEditor editor = new TextEditor(formatter);
		String result = editor.publishText("Testing text in lower formatter");
		System.out.println(result);
		assertEquals("String incorrectly translated ", "testing text in lower formatter", result);
	}

}
