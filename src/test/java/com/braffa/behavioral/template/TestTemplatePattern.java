/*
 * http://www.javacodegeeks.com/2015/09/template-design-pattern.html
 * 
 *		The Template Method pattern should be used in the following cases:
 *  		1.	To implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can 
 *  			vary.
 *   		2.	When common behavior among subclasses should be factored and localized in a common class to avoid code duplication. 
 *   			You first identify the differences in the existing code and then separate the differences into new operations. Finally, 
 *   			you replace the differing code with a template method that calls one of these new operations.
 *  		3.	To control subclasses extensions. You can define a template method that calls “hook” operations (see Consequences) at 
 *  			specific points, thereby permitting extensions only at those points
 */
package com.braffa.behavioral.template;

import org.junit.Before;
import org.junit.Test;

public class TestTemplatePattern {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMySqLCSVCon() {
		System.out.println("For MYSQL....");
		ConnectionTemplate template = new MySqLCSVCon();
		template.run();
	}
	
	@Test
	public void testOracleTxtCon() {
		System.out.println("\nFor Oracle...");
		ConnectionTemplate template = new OracleTxtCon();
		template.run();
	}

}
