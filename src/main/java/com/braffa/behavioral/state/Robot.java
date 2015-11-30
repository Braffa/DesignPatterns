package com.braffa.behavioral.state;

public class Robot implements IRoboticState{

	private IRoboticState roboticOn;
	private IRoboticState roboticCook;
	private IRoboticState roboticOff;
	private IRoboticState roboticStandby;
	
	private IRoboticState state;
	
	public Robot(){
		this.roboticOn = new RoboticOn(this);
		this.roboticCook = new RoboticCook(this);
		this.roboticOff = new RoboticOff(this);
		this.roboticStandby = new RoboticStandby(this);
		
		this.state = roboticOn;
	}
	
	public void setRoboticState(IRoboticState state){
		this.state = state;
	}
	
	@Override
	public void walk() {
		state.walk();
		setState(getRoboticStandby());
	}

	@Override
	public void cook() {
		state.cook();
		setState(getRoboticStandby());
	}

	@Override
	public void off() {
		state.off();
	}

	public IRoboticState getRoboticOn() {
		return roboticOn;
	}

	public void setRoboticOn(IRoboticState roboticOn) {
		this.roboticOn = roboticOn;
	}

	public IRoboticState getRoboticCook() {
		return roboticCook;
	}

	public void setRoboticCook(IRoboticState roboticCook) {
		this.roboticCook = roboticCook;
	}

	public IRoboticState getRoboticOff() {
		return roboticOff;
	}

	public void setRoboticOff(IRoboticState roboticOff) {
		this.roboticOff = roboticOff;
	}

	public IRoboticState getState() {
		return state;
	}

	public void setState(IRoboticState state) {
		this.state = state;
	}

	public IRoboticState getRoboticStandby() {
		return roboticStandby;
	}

	public void setRoboticStandby(IRoboticState roboticStandby) {
		this.roboticStandby = roboticStandby;
	}
	
}
