package com.n2s.lab_exercise;

public class Room {
	private int room_No;
	private boolean ac_Machine;
	private String room_type, room_Area;

	public int getRoom_No() {
		return room_No;
	}

	public void setRoom_No(int room_No) {
		this.room_No = room_No;
	}

	public boolean isAc_Machine() {
		return ac_Machine;
	}

	public void setAc_Machine(boolean ac_Machine) {
		this.ac_Machine = ac_Machine;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public String getRoom_Area() {
		return room_Area;
	}

	public void setRoom_Area(String room_Area) {
		this.room_Area = room_Area;
	}

	@Override
	public String toString() {
		return "Room_type: " + this.room_type + " Room_No:" + this.room_No + "Room_Area:" + this.room_Area
				+ "Ac_Machine:" + this.ac_Machine;
	}

}
