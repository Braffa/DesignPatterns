package com.braffa.structural.bridge.cartype;

import com.braffa.structural.bridge.product.IProduct;

public abstract class AbstractCar {

	private final IProduct product;

	private final String carType;

	public AbstractCar(IProduct product, String carType) {
		this.product = product;
		this.carType = carType;
	}

	public abstract void assemble();

	public abstract void produceProduct();
	
	public IProduct getProduct() {
		return product;
	}

	public String getCarType() {
		return carType;
	}

	public void printDetails() {
		System.out.println("Car: " + carType + ", Product:"
				+ product.productName());
	}
}
