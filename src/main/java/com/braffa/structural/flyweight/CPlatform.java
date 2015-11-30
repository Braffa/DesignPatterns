package com.braffa.structural.flyweight;


public class CPlatform implements IPlatform {
	
	public CPlatform(){
		System.out.println("CPlatform object created");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Compiling and executing C code.");
	}

}
