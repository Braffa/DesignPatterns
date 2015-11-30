package com.braffa.structural.decorator;

public class Cheese extends AbstractPizzaDecorator {

	private final IPizza pizza;
	
	public Cheese(IPizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Cheese (20.72)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+20.72;
	}

}