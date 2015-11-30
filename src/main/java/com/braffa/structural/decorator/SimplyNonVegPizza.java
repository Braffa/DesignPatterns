package com.braffa.structural.decorator;

public class SimplyNonVegPizza implements IPizza{
	
	@Override
	public String getDesc() {
		return "SimplyNonVegPizza (350)";
	}

	@Override
	public double getPrice() {
		return 350;
	}

}
