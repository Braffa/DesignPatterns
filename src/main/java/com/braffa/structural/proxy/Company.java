package com.braffa.structural.proxy;


public class Company {
	
	private String companyName;
	private String companyAddress;
	private String companyContactNo;
	private IContactList contactList ;
	
	public Company(String companyName,String companyAddress, String companyContactNo,IContactList contactList){
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyContactNo = companyContactNo;
		this.contactList = contactList;
		
		System.out.println("Company object created...");
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public String getCompanyContactNo() {
		return companyContactNo;
	}

	public IContactList getContactList(){
		return contactList;
	}
	

}
