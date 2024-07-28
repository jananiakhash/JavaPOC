package com.janani.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>(3);

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public boolean addVehicle(Vehicle vehicle) {
		if (vehicles.size() > 3) {
			return false;
		} else {
			vehicles.add(vehicle);
			return true;
		}
	}

}
