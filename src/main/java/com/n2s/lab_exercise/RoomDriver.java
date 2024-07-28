package com.n2s.lab_exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RoomDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Room> list = new ArrayList<Room>();
		Room kitchen = new Room();
		kitchen.setRoom_type("Kitchen");
		kitchen.setRoom_No(1);
		kitchen.setRoom_Area("100 sqft");
		kitchen.setAc_Machine(false);
		list.add(kitchen);
		Room livingroom = new Room();
		livingroom.setRoom_type("Living Room");
		livingroom.setRoom_No(2);
		livingroom.setRoom_Area("400 sqft");
		livingroom.setAc_Machine(true);
		list.add(livingroom);
		/*
		 * for (Room r : list) { System.out.println(r.getRoom_type());
		 * System.out.println(r.getRoom_No()); System.out.println(r.getRoom_Area());
		 * System.out.println(r.isAc_Machine()); }
		 */

		Iterator<Room> it = list.iterator();
		while (it.hasNext()) {

			Room r = it.next();
			System.out.println(r.getRoom_type());
			System.out.println(r.getRoom_No());
			System.out.println(r.getRoom_Area());
			System.out.println(r.isAc_Machine());
			System.out.println("-------------");

			/*
			 * System.out.println(it.next().toString());
			 * System.out.println("-------------");
			 */
		}

	}
}
