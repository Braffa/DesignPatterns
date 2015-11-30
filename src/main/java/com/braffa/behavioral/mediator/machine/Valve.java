package com.braffa.behavioral.mediator.machine;


public class Valve implements IColleague {

	private IMachineMediator mediator;
	
	@Override
	public void setMediator(IMachineMediator mediator){
		this.mediator = mediator;
	}
	
	public void open(){
		System.out.println("Valve is opened...");
		System.out.println("Filling water...");
		mediator.closed();
	}
	
	public void closed(){
		System.out.println("Valve is closed...");
		mediator.on();
	}
}
