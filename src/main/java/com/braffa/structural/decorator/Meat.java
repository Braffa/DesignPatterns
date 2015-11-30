package com.braffa.structural.decorator;

public class Meat extends AbstractPizzaDecorator {

	private final IPizza pizza;

	public Meat(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Meat (14.25)";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 14.25;
	}

}