/*
 * http://www.javacodegeeks.com/2015/09/prototype-design-pattern.html
 * 
 * Use the Prototype pattern when a system should be independent of how its products are created, composed, and represented; and
 * 
 *		When the classes to instantiate are specified at run-time, for example, by dynamic loading; or
 *		To avoid building a class hierarchy of factories that parallels the class hierarchy of products; or
 *		When instances of a class can have one of only a few different combinations of state. It may be more convenient to 
 *      install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time 
 *      with the appropriate state.
 */
package com.braffa.creational.prototype;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.braffa.creational.prototype.AccessControl;
import com.braffa.creational.prototype.AccessControlProvider;
import com.braffa.creational.prototype.User;

public class TestPrototypePattern {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBasicUser() {
		AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		System.out.println("************************************");
		User userA = new User("User A", "USER Level", userAccessControl);
		System.out.println(userA);
		assertEquals("Incorrect user name should be User A ", "User A", userA.getUserName());
		assertEquals("Incorrect level should be USER Level ", "USER Level", userA.getLevel());
		assertEquals("Incorrect access should be DO_WORK ", "DO_WORK", userA.getAccessControl().getAccess());
		assertEquals("Incorrect control should be USER ", "USER", userA.getAccessControl().getControlLevel());
	}
	
	@Test
	public void testChangeAccessControl() {
		AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		User userA = new User("User A", "USER Level", userAccessControl);
		
		userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		User userB = new User("User B", "USER Level", userAccessControl);
		
		System.out.println(userB);
		assertEquals("Incorrect user name should be User B ", "User B", userB.getUserName());
		assertEquals("Incorrect level should be USER Level ", "USER Level", userB.getLevel());
		assertEquals("Incorrect access should be DO_WORK ", "DO_WORK", userB.getAccessControl().getAccess());
		assertEquals("Incorrect control should be USER ", "USER", userB.getAccessControl().getControlLevel());

		System.out.println("Changing access control of: "+userB.getUserName());
		userB.getAccessControl().setAccess("READ REPORTS");
		
		System.out.println(userB);
		assertEquals("Incorrect user name should be User B ", "User B", userB.getUserName());
		assertEquals("Incorrect level should be USER Level ", "USER Level", userB.getLevel());
		assertEquals("Incorrect access should be DO_WORK ", "READ REPORTS", userB.getAccessControl().getAccess());
		assertEquals("Incorrect control should be USER ", "USER", userB.getAccessControl().getControlLevel());
		
		// make sure userA has not cheanged   
		System.out.println(userA);
		assertEquals("Incorrect user name should be User A ", "User A", userA.getUserName());
		assertEquals("Incorrect level should be USER Level ", "USER Level", userA.getLevel());
		assertEquals("Incorrect access should be DO_WORK ", "DO_WORK", userA.getAccessControl().getAccess());
		assertEquals("Incorrect control should be USER ", "USER", userA.getAccessControl().getControlLevel());
		
		System.out.println(userA);
		
		System.out.println("************************************");
	}

	@Test
	public void testAccessControlManager() {
		AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
		User userC = new User("User C", "MANAGER Level", managerAccessControl);
		System.out.println(userC);
		assertEquals("Incorrect user name should be User C ", "User C", userC.getUserName());
		assertEquals("Incorrect level should be MANAGER Level ", "MANAGER Level", userC.getLevel());
		assertEquals("Incorrect access should be GENERATE/READ REPORTS ", "GENERATE/READ REPORTS", userC.getAccessControl().getAccess());
		assertEquals("Incorrect control should be MANAGER ", "MANAGER", userC.getAccessControl().getControlLevel());
		System.out.println("************************************");
	}
}
