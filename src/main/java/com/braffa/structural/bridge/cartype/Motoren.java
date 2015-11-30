package com.braffa.structural.bridge.cartype;

import com.braffa.structural.bridge.product.IProduct;

public class Motoren extends AbstractCar {

	private final IProduct product;
	private final String carType;

	public Motoren(IProduct product, String carType) {
		super(product, carType);
		this.product = product;
		this.carType = carType;
	}

	@Override
	public void assemble() {
		System.out.println("Assembling " + product.productName() + " for "
				+ carType);
	}

	@Override
	public void produceProduct() {
		product.produce();
		System.out.println("Modifing product " + product.productName()
				+ " according to " + carType);
	}

}
