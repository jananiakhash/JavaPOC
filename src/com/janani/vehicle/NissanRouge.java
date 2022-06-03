package com.janani.vehicle;

public class NissanRouge extends Vehicle {

	public NissanRouge(int milage, String color, int year) {

		this.vehicleMake = "Nissan";
		this.vehicleModel = "Rouge";
		this.seatingCapacity = 5;
		this.noOfDoors = 5;

		// car specific values
		this.mileage = milage;
		this.color = color;
		this.year = year;

		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCarType() {
		// TODO Auto-generated method stub
		return "SUV";
	}

}
