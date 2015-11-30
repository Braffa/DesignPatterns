package com.braffa.structural.decorator;

public class Ham extends AbstractPizzaDecorator{

	private final IPizza pizza;
	
	public Ham(IPizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Ham (18.12)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+18.12;
	}

}