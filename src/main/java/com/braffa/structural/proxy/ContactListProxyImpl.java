package com.braffa.structural.proxy;

import java.util.List;


public class ContactListProxyImpl implements IContactList {

	private IContactList contactList;

	@Override
	public List<Employee> getEmployeeList() {
		if (contactList == null) {
			System.out
					.println("Creating contact list and fetching list of employees...");
			contactList = new ContactListImpl();
		}
		return contactList.getEmployeeList();
	}

}
