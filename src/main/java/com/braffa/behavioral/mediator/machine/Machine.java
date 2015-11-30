package com.braffa.behavioral.mediator.machine;


public class Machine implements IColleague {

	private IMachineMediator mediator;
	
	@Override
	public void setMediator(IMachineMediator mediator){
		this.mediator = mediator;
	}
	
	public void start(){
		mediator.open();
	}
	
	public void wash(){
		mediator.wash();
	}
}
