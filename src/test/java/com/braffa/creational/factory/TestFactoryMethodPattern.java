/*
 * http://www.javacodegeeks.com/2015/09/factory-method-design-pattern.html
 * 
 * Use the Factory Method pattern when
 *	1.	A class can’t anticipate the class of objects it must create.
 *	2.	A class wants its subclasses to specify the objects it creates.
 *  3.	Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of 
 *  	which helper subclass is the delegate.
 */
package com.braffa.creational.factory;

import org.junit.Before;
import org.junit.Test;

public class TestFactoryMethodPattern {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AbstractDisplayService service = new FeedbackXMLDisplayService();
		service.display();
		
		service = new ErrorXMLDisplayService();
		service.display();
		
		service = new OrderXMLDisplayService();
		service.display();
		
		service = new ResponseXMLDisplayService();
		service.display();
	}

}
