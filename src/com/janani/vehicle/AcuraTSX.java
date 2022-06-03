package com.janani.vehicle;

public class AcuraTSX extends Vehicle {

	public AcuraTSX(int mileage, String color, int year) {
		// default acura tsx values
		this.vehicleMake = "Acura";
		this.vehicleModel = "TSX";
		this.seatingCapacity = 4;
		this.noOfDoors = 4;

		// car specific values
		this.color = color;
		this.mileage = mileage;
		this.year = year;
	}

	@Override
	public String getCarType() {
		return "Sedan";
	}

}
