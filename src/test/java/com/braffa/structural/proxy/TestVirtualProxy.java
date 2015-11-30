/*
 * http://www.javacodegeeks.com/2015/09/proxy-design-pattern.html
 * When to use the Proxy Pattern
 *     Proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer. 
 *     Here are several common situations in which the Proxy pattern is applicable:
 *          A remote proxy provides a local representative for an object in a different address space.
 *          A virtual proxy creates expensive objects on demand.
 *          A protection proxy controls access to the original object. Protection proxies are useful when objects should have different 
 *          access rights.
 */

package com.braffa.structural.proxy;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class TestVirtualProxy {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		IContactList contactList = new ContactListProxyImpl();
		Company company = new Company("ABC Company", "India", "+91-011-28458965", contactList);
		
		System.out.println("Company Name: "+company.getCompanyName());
		System.out.println("Company Address: "+company.getCompanyAddress());
		System.out.println("Company Contact No.: "+company.getCompanyContactNo());
		
		assertEquals("Incorrect company name ", "ABC Company", company.getCompanyName());
		assertEquals("Incorrect company address ", "India", company.getCompanyAddress());
		assertEquals("Incorrect company contact |No ", "+91-011-28458965", company.getCompanyContactNo());
		
		System.out.println("Requesting for contact list");
		
		contactList = company.getContactList();
		
		assertTrue("Number of employees should be 5 ", 5 == contactList.getEmployeeList().size());
		
		List<Employee>empList = contactList.getEmployeeList();
		for(Employee emp : empList){
			System.out.println(emp);
		}
	}

}
