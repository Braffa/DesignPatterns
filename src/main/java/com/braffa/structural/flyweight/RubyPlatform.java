package com.braffa.structural.flyweight;


public class RubyPlatform implements IPlatform {

	public RubyPlatform() {
		System.out.println("RubyPlatform object created");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Compiling and executing Ruby code.");
	}

}
