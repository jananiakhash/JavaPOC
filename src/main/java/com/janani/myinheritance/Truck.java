package com.janani.myinheritance;

public class Truck extends Vehicle {

	public void openTailgate() {
		System.out.println("open tailgate of a truck");
	}

	public void closeTailgate() {
		System.out.println("close tailgate of a truck");
	}

	@Override
	public void increaseSpeed(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void decreaseSpeed(int i) {
		// TODO Auto-generated method stub

	}

}
