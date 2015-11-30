package com.braffa.structural.bridge.product;

public class CentralLocking implements IProduct {

	private final String productName;

	public CentralLocking(String productName) {
		this.productName = productName;
	}

	@Override
	public String productName() {
		return productName;
	}

	@Override
	public void produce() {
		System.out.println("Producing Central Locking System");
	}

}