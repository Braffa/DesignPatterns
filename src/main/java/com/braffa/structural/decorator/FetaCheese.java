package com.braffa.structural.decorator;

public class FetaCheese extends AbstractPizzaDecorator{

	private final IPizza pizza;
	
	public FetaCheese(IPizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Feta Cheese (25.88)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+25.88;
	}

}