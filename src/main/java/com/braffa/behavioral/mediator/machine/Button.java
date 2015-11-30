package com.braffa.behavioral.mediator.machine;


public class Button implements IColleague {
	
	private IMachineMediator mediator;
	
	@Override
    public void setMediator(IMachineMediator mediator){
		this.mediator = mediator;
	}
	
	public void press(){
		System.out.println("Button pressed.");
		mediator.start();
	}

}
