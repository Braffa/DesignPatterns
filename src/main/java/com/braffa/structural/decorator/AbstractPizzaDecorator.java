package com.braffa.structural.decorator;

public abstract class AbstractPizzaDecorator implements IPizza {
	
	@Override
	public String getDesc() {
		return "Toppings";
	}

}
