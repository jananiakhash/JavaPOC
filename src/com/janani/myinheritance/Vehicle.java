package com.janani.myinheritance;

public abstract class Vehicle {

	protected int speed;

	public void start() {
		System.out.println("Start of Vehicle");
	}

	public void stop() {
		System.out.println("Stopping");
	}

	public void turn() {
		System.out.println("turn the Vehicle");
	}

	public int getSpeed() {
		return speed;
	}

	public abstract void increaseSpeed(int i);

	public abstract void setSpeed(int speed);

	public abstract void decreaseSpeed(int i);

}
