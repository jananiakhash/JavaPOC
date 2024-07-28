package com.janani.vehicle;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		Garage myGarage = new Garage();

		Vehicle a = new AcuraTSX(90000, "Gray", 2010);
		boolean result = myGarage.addVehicle(a);

		Vehicle b = new AcuraTSX(1000, "Red", 2020);
		myGarage.addVehicle(b);

		Vehicle c = new NissanRouge(21000, "Black", 2017);
		myGarage.addVehicle(c);

		// print all vehicles
		for (int i = 0; i < myGarage.getVehicles().size(); i++) {
			System.out.println(myGarage.getVehicles().get(i).getVehicleMake());
			System.out.println(myGarage.getVehicles().get(i).getVehicleModel());
			System.out.println(myGarage.getVehicles().get(i).getYear());
			System.out.println(myGarage.getVehicles().get(i).getColor());
			System.out.println(myGarage.getVehicles().get(i).getMileage());
			System.out.println(myGarage.getVehicles().get(i).getCarType());
		}
	}

}
