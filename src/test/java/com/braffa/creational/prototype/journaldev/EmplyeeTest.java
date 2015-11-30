/*
 * 	Prototype pattern is used when the Object
 *	creation is a costly affair and requires a lot of time and resources and you
 *	have a similar object already existing. So this pattern provides a mechanism
 *	to copy the original object to a new object and then modify it according to
 *	our needs. This pattern uses java cloning to copy the object.
 * 
 * 	suppose we have an Object that loads data from database. Now we need to modify this
 * 	data in our program multiple times, so it’s not a good idea to create the
 *	Object using new keyword and load all the data again from database. So the
 *	better approach is to clone the existing object into a new object and then do
 *	the data manipulation.
 *
 *	Prototype design pattern mandates that the Object which you are copying
 *	should provide the copying feature. It should not be done by any other class.
 *	However whether to use shallow or deep copy of the Object properties
 *	depends on the requirements and it’s a design decision.
 *
 *	Notice that the clone method is overridden to provide a deep copy of the
 *	employees list.
 */

package com.braffa.creational.prototype.journaldev;

import java.util.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmplyeeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		try {
			Employees emps = new Employees();
			
			emps.loadData();
			
			System.out.println("Load Data emps List: " + emps.getEmpList());
			assertTrue("Load Data Should be 4 empoyees ", 4 == emps.getEmpList().size());
			assertEquals("Load Data ", emps.getEmpList().get(0), "Pankaj");
			assertEquals("Load Data ", emps.getEmpList().get(1), "Raj");
			assertEquals("Load Data ", emps.getEmpList().get(2), "David");
			assertEquals("Load Data ", emps.getEmpList().get(3), "Lisa");
			
			// Use the clone method to get the Employee object
			Employees empsNew;
			
			empsNew = (Employees) emps.clone();
			System.out.println("empsNew: " + empsNew.getEmpList());
			
			assertTrue("empsNew Should be 4 empoyees ", 4 == empsNew.getEmpList().size());
			assertEquals("empsNew ", empsNew.getEmpList().get(0), "Pankaj");
			assertEquals("empsNew ", empsNew.getEmpList().get(1), "Raj");
			assertEquals("empsNew ", empsNew.getEmpList().get(2), "David");
			assertEquals("empsNew ", empsNew.getEmpList().get(3), "Lisa");

			Employees empsNew1 = (Employees) emps.clone();
			System.out.println("empsNew1: " + empsNew1.getEmpList());
			
			assertTrue("empsNew1 Should be 4 empoyees ", 4 == empsNew1.getEmpList().size());
			assertEquals("empsNew1 ", empsNew1.getEmpList().get(0), "Pankaj");
			assertEquals("empsNew1 ", empsNew1.getEmpList().get(1), "Raj");
			assertEquals("empsNew1 ", empsNew1.getEmpList().get(2), "David");
			assertEquals("empsNew1 ", empsNew1.getEmpList().get(3), "Lisa");
			
			List<String> list = empsNew.getEmpList();
			list.add("John");
			System.out.println("empsNew john added: " + empsNew.getEmpList());
			
			assertTrue("added 1 to empsNew Should be 5 empoyees ", 5 == empsNew.getEmpList().size());
			assertEquals("empsNew ", empsNew.getEmpList().get(0), "Pankaj");
			assertEquals("empsNew ", empsNew.getEmpList().get(1), "Raj");
			assertEquals("empsNew ", empsNew.getEmpList().get(2), "David");
			assertEquals("empsNew ", empsNew.getEmpList().get(3), "Lisa");
			assertEquals("empsNew ", empsNew.getEmpList().get(4), "John");
			
			List<String> list1 = empsNew1.getEmpList();
			list1.remove("Pankaj");
			System.out.println("empsNew1 Pankaj removed: " + empsNew1.getEmpList());
			
			assertTrue("removed  Pankaj from empsNew1 Should be 5 empoyees ", 3 == empsNew1.getEmpList().size());
			assertEquals("empsNew1 ", empsNew1.getEmpList().get(0), "Raj");
			assertEquals("empsNew1 ", empsNew1.getEmpList().get(1), "David");
			assertEquals("empsNew1 ", empsNew1.getEmpList().get(2), "Lisa");
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
