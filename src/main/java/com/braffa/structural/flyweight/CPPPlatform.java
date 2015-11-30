package com.braffa.structural.flyweight;


public class CPPPlatform implements IPlatform {

	public CPPPlatform() {
		System.out.println("CPPPlatform object created");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Compiling and executing CPP code.");
	}

}
