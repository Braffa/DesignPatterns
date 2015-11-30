/*
 * http://www.javacodegeeks.com/2015/09/builder-design-pattern.html
 * 
 * Use the Builder pattern when
 *    1.	The algorithm for creating a complex object should be independent of the parts that make up the object 
 *    		and how they’re assembled.
 *    2.	The construction process must allow different representations for the object that’s constructed.
 */


package com.braffa.creational.builder.form;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.braffa.creational.builder.form.Form;

public class TestForm {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void mandatoryFieldTest() {
		Form form = new Form.FormBuilder("Dave", "Carter", "DavCarter",
				"DAvCaEr123").build();
		
		System.out.println(form);
		System.out.println("==============================================");
		assertEquals("Incorrect first name should be dave ", "Dave", form.getFirstName());
		assertEquals("Incorrect last name should be Carter ", "Carter", form.getLastName());
		assertEquals("Incorrect first name should be DavCarter ", "DavCarter", form.getUserName());
		assertEquals("Incorrect first name should be DAvCaEr123 ", "DAvCaEr123", form.getPassword());
	}
	
	@Test
	public void extraFieldTest() {
		Form form = new Form.FormBuilder("Dave", "Carter", "DavCarter",
				"DAvCaEr123").passwordHint("MyName").city("NY")
				.language("English").build();
		
		System.out.println(form);
		
		assertEquals("Incorrect first name should be dave ", "Dave", form.getFirstName());
		assertEquals("Incorrect last name should be Carter ", "Carter", form.getLastName());
		assertEquals("Incorrect first name should be DavCarter ", "DavCarter", form.getUserName());
		assertEquals("Incorrect first name should be DAvCaEr123 ", "DAvCaEr123", form.getPassword());
		
		assertEquals("Incorrect first name should be MyName ", "MyName", form.getPasswordHint());	
		assertEquals("Incorrect first name should be NY ", "NY", form.getCity());
		assertEquals("Incorrect first name should be English ", "English", form.getLanguage());
	}


}
