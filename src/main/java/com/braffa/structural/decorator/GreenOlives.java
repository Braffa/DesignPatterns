package com.braffa.structural.decorator;

public class GreenOlives extends AbstractPizzaDecorator{

	private final IPizza pizza;
	private double price = 5.47;
	
	public GreenOlives(IPizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Green Olives (5.47)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}