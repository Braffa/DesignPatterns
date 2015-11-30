package com.braffa.behavioral.mediator.machine;


public class Heater implements IColleague {

	private IMachineMediator mediator;

	@Override
	public void setMediator(IMachineMediator mediator) {
		this.mediator = mediator;
	}

	public void on(int temp) {
		System.out.println("Heater is on...");
		if (mediator.checkTemperature(temp)) {
			System.out.println("Temperature is set to " + temp);
			mediator.off();
		}
	}

	public void off() {
		System.out.println("Heater is off...");
		mediator.wash();
	}
}
