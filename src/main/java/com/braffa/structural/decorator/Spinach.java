package com.braffa.structural.decorator;

public class Spinach extends AbstractPizzaDecorator {

	private final IPizza pizza;
	private double price = 7.92;

	public Spinach(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Spinach (7.92)";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
