package com.janani.myinheritance;

public class Car extends Vehicle {

	public void OpenTrunk() {
		System.out.println("open the doors of a car");
	}

	public void closeTrunk() {
		System.out.println("close the doors of a car");
	}

	@Override
	public void increaseSpeed(int i) {

		speed = speed + i;
		if (speed > 75) {
			speed = 75;
			System.out.println("Increased vehicle speed to" + "  " + i + "  " + "mph" + "  " + "SPEED OF THE CAR IS  "
					+ speed + "  " + "mph");
		} else {
			System.out.println("Increased vehicle speed to" + "  " + i + "  " + "mph" + "  " + "SPEED OF THE CAR IS  "
					+ speed + "  " + "mph");
		}
	}

	@Override
	public void decreaseSpeed(int i) {

		speed = speed - i;
		if (speed <= 0) {
			speed = 0;
			System.out.println("Speed of the car is decreased to" + " " + speed);
		} else {
			System.out.println("Speed of the car is decreased to" + " " + i);
			System.out.println("Current speed of the car is" + "  " + speed + " " + "mph");
		}
	}

	@Override
	public void setSpeed(int speed) {
		if (speed > 75) {
			super.speed = 75;
			// this.speed = 75;
			System.out.println("max speed should be 75 miles per hour");

		} else {
			// this.speed = speed;
			super.speed = speed;

		}
	}

}
