package com.janani.myinheritance;

public class Driver {
	public static void main(String[] args) {

		Car c = new Car();

		c.start();
		c.stop();
		c.turn();
		System.out.println("Speed of car" + "  " + c.getSpeed());
		c.setSpeed(40);
		c.increaseSpeed(10);
		c.decreaseSpeed(0);
		c.OpenTrunk();
		c.closeTrunk();
		Truck t = new Truck();
		t.openTailgate();
		t.closeTailgate();
	}

}
