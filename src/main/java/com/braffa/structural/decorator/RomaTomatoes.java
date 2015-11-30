package com.braffa.structural.decorator;

public class RomaTomatoes extends AbstractPizzaDecorator {

	private final IPizza pizza;
	private double price = 5.20;

	public RomaTomatoes(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Roma Tomatoes (5.20)";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
