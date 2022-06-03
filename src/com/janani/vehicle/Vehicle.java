package com.janani.vehicle;

import java.util.List;

public abstract class Vehicle {

	protected String vehicleMake;
	protected String vehicleModel;
	protected int year;
	protected int mileage;
	protected String color;
	protected int seatingCapacity;
	protected int noOfDoors;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public abstract String getCarType();

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

}
