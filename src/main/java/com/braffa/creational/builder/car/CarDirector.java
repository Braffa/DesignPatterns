package com.braffa.creational.builder.car;

public class CarDirector {
	
	private ICarBuilder carBuilder;
	
	public CarDirector(ICarBuilder carBuilder){
		this.carBuilder = carBuilder;
	}

	public void build(){
		carBuilder.buildBodyStyle();
		carBuilder.buildPower();
		carBuilder.buildEngine();
		carBuilder.buildBreaks();
		carBuilder.buildSeats();
		carBuilder.buildWindows();
		carBuilder.buildFuelType();
	}
}
