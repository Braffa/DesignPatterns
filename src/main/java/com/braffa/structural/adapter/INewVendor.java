package com.braffa.structural.adapter;


public interface INewVendor {
	
	public String getCustCardNo();

	public String getCardOwnerName();

	public String getCardExpMonthDate();

	public Integer getCVVNo();

	public Double getTotalAmount();
	
	public IExistingVendor getExistingVendor();

	public void setCustCardNo(String custCardNo);

	public void setCardOwnerName(String cardOwnerName);

	public void setCardExpMonthDate(String cardExpMonthDate);

	public void setCVVNo(Integer cVVNo);

	public void setTotalAmount(Double totalAmount);

}
