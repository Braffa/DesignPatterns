/*
 * http://www.javacodegeeks.com/2015/09/state-design-pattern.html
 * 
 *	Use the State pattern in either of the following cases:
 *		1.	An object’s behavior depends on its state, and it must change its behavior at run-time depending on that state.
 *		2.	Operations have large, multipart conditional statements that depend on the object’s state. This state is usually 
 *			represented by one or more enumerated constants. Often, several operations will contain this same conditional structure. 
 *			The State pattern puts each branch of the conditional in a separate class. This lets you treat the object’s state as 
 *			an object in its own right that can vary independently from other objects.
 */

package com.braffa.behavioral.state;

import org.junit.Before;
import org.junit.Test;

public class TestStatePattern {
	Robot robot;

	@Before
	public void setUp() throws Exception {
		robot = new Robot();
	}

	@Test
	public void test() {
		robot.walk();
		robot.cook();
		robot.walk();
		robot.off();

		robot.walk();
		robot.off();
		robot.cook();
	}

}
