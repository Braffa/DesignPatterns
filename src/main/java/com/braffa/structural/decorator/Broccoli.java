package com.braffa.structural.decorator;

public class Broccoli extends AbstractPizzaDecorator{

	private final IPizza pizza;
	
	public Broccoli(IPizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Broccoli (9.25)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+9.25;
	}

}