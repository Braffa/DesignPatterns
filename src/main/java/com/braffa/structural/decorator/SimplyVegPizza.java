package com.braffa.structural.decorator;

public class SimplyVegPizza implements IPizza{
	
	private double price = 230.00;

	@Override
	public String getDesc() {
		return "SimplyVegPizza (230)";
	}
	
	@Override
	public double getPrice() {
		return price;
	}


}
