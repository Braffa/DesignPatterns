package com.braffa.structural.adapter;


public class ExistingToNewVendorAdaptor implements INewVendor {

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;

	private final IExistingVendor existingVendor;

	public ExistingToNewVendorAdaptor(IExistingVendor existingVendor) {
		this.existingVendor = existingVendor;
		setProp();
	}

	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		return cVVNo;
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public IExistingVendor getExistingVendor() {
		return existingVendor;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	private void setProp() {
		setCardOwnerName(this.existingVendor.getCustomerName());
		setCustCardNo(this.existingVendor.getCreditCardNo());
		setCardExpMonthDate(this.existingVendor.getCardExpMonth() + "/"
				+ this.existingVendor.getCardExpYear());
		setCVVNo(this.existingVendor.getCardCVVNo().intValue());
		setTotalAmount(this.existingVendor.getAmount());
	}
}
