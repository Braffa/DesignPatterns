package com.braffa.structural.decorator;

public class Chicken extends AbstractPizzaDecorator{

	private final IPizza pizza;
	
	public Chicken(IPizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Chicken (12.75)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+12.75;
	}

}