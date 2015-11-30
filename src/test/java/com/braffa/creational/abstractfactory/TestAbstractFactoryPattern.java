/*
 * http://www.javacodegeeks.com/2015/09/abstract-factory-design-pattern.html
 * 
 * Use the Abstract Factory pattern when
 *
 *	1.	A system should be independent of how its products are created, composed, and represented.
 *	2.	A system should be configured with one of multiple families of products.
 *  3.	A family of related product objects is designed to be used together, and you need to enforce this constraint.
 *  4.	You want to provide a class library of products, and you want to reveal just their interfaces, not their implementations.
 */

package com.braffa.creational.abstractfactory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.braffa.creational.abstractfactory.IAbstractParserFactory;
import com.braffa.creational.abstractfactory.IXMLParser;
import com.braffa.creational.abstractfactory.ParserFactoryProducer;

public class TestAbstractFactoryPattern {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void NYFactoryTest() {
		IAbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");
		IXMLParser parser = parserFactory.getParserInstance("NYERROR");
		String msg = parser.parse();
		System.out.println(msg);
		assertEquals("Incorrect xml message ", "NY Error XML Message", msg);
		
		parser = parserFactory.getParserInstance("NYFEEDBACK");
		msg = parser.parse();
		System.out.println(msg);
		assertEquals("Incorrect xml message ", "NY Feedback XML Message", msg);
		
		parser = parserFactory.getParserInstance("NYORDER");
		msg = parser.parse();
		System.out.println(msg);
		assertEquals("Incorrect xml message ", "NY Order XML Message", msg);
		
		parser = parserFactory.getParserInstance("NYRESPONSE");
		msg = parser.parse();
		System.out.println(msg);
		assertEquals("Incorrect xml message ", "NY Response XML Message", msg);
		
		System.out.println("************************************");
	}
	
	@Test
	public void TWFactoryTest() {
		IAbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("TWFactory");
		IXMLParser parser = parserFactory.getParserInstance("TWERROR");
		String msg = parser.parse();
		System.out.println(msg);
		assertEquals("Incorrect xml message ", "TW Error XML Message", msg);
		
		parser = parserFactory.getParserInstance("TWFEEDBACK");
		msg = parser.parse();
		System.out.println(msg);
		assertEquals("Incorrect xml message ", "TW Feedback XML Message", msg);
		
		parser = parserFactory.getParserInstance("TWORDER");
		msg = parser.parse();
		System.out.println(msg);
		assertEquals("Incorrect xml message ", "TW Order XML Message", msg);
		
		parser = parserFactory.getParserInstance("TWRESPONSE");
		msg = parser.parse();
		System.out.println(msg);
		assertEquals("Incorrect xml message ", "TW Response XML Message", msg);
		
		
		System.out.println("************************************");
		
	}

}
