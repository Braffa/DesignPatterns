package com.braffa.structural.decorator;

public class RedOnions extends AbstractPizzaDecorator {

	private final IPizza pizza;

	public RedOnions(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Red Onions (3.75)";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 3.75;
	}

}
