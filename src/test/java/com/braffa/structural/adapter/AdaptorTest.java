/*
 http://www.javacodegeeks.com/2015/09/adapter-design-pattern.html
  
 The Adapter pattern should be used when:
    1. There is an existing class, and its interface does not match the one you need.
    2. You want to create a reusable class that cooperates with unrelated or unforeseen 
       classes, that is, classes that don’t necessarily have compatible interfaces.
    3. There are several existing subclasses to be use, but it’s impractical to adapt 
       their interface by subclassing every one. An object adapter can adapt the 
       interface of its parent class.
 */

package com.braffa.structural.adapter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AdaptorTest {
	
	private INewVendor setUpAdapter () {
		// Object for Xpay
		IExistingVendor existingVendor = new ExistingVendorImpl();
		existingVendor.setCreditCardNo("4789565874102365");
		existingVendor.setCustomerName("Max Warner");
		existingVendor.setCardExpMonth("09");
		existingVendor.setCardExpYear("25");
		existingVendor.setCardCVVNo((short)235);
		existingVendor.setAmount(2565.23);
		
		INewVendor newVendor = new ExistingToNewVendorAdaptor(existingVendor);
		
		return newVendor;
	}

	@Test
	public void test() {
		INewVendor adapter = setUpAdapter ();
		
		System.out.println("new Vendor " + adapter.getCardOwnerName());
		System.out.println("new Vendor " + adapter.getCustCardNo());
		System.out.println("new Vendor " + adapter.getCardExpMonthDate());
		System.out.println("new Vendor " + adapter.getCVVNo());
		System.out.println("new Vendor " + adapter.getTotalAmount());
		
		System.out.println("existing Vendor " + adapter.getExistingVendor().getCustomerName());
		System.out.println("existing Vendor " + adapter.getExistingVendor().getCreditCardNo());
		System.out.println("existing Vendor " + adapter.getExistingVendor().getCardExpMonth());
		System.out.println("existing Vendor " + adapter.getExistingVendor().getCardExpYear());
		System.out.println("existing Vendor " + adapter.getExistingVendor().getCardCVVNo());
		System.out.println("existing Vendor " + adapter.getExistingVendor().getAmount());
		
		
		assertEquals("Incorrect new vendor card owner name should be ", "Max Warner", adapter.getCardOwnerName());
		assertEquals("Incorrect new vendor card number should be ", "4789565874102365", adapter.getCustCardNo());
		assertEquals("Incorrect new vendor expiry month should be ", "09/25", adapter.getCardExpMonthDate());
		assertTrue("Incorrect new vendor CV number should be ", 235 == adapter.getCVVNo());
		assertTrue("Incorrect new vendor total amount should be ", 2565.23 == adapter.getTotalAmount());
		
		assertTrue("Incorrect existing vendor amount should be ", 2565.23 == adapter.getExistingVendor().getAmount());	
		assertTrue("Incorrect existing vendor CV number should be ", 235 == adapter.getExistingVendor().getCardCVVNo());
		assertEquals("Incorrect existing vendor expiry month should be ", "09", adapter.getExistingVendor().getCardExpMonth());
		assertEquals("Incorrect existing vendor expiry year should be ", "25", adapter.getExistingVendor().getCardExpYear());
		assertEquals("Incorrect existing vendor card number should be ", "4789565874102365", adapter.getExistingVendor().getCreditCardNo());
		assertEquals("Incorrect existing vendor card owner name should be ", "Max Warner", adapter.getExistingVendor().getCustomerName());
	}

}
