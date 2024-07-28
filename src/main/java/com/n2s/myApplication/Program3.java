package com.n2s.myApplication;

public class Program3 {

	public static void main(String[] args) {
		VehicleDetail v = new VehicleDetail("M2015", "REG2015");
		TwoWheeler tw = new TwoWheeler("M2563", "REG2563", 2);
		ThreeWheeler thw = new ThreeWheeler("M1519", "REG1519", 3);
		v.display();
		tw.display();
		thw.display();

	}

}

class VehicleDetail {
	String modelno;
	String regno;

	VehicleDetail(String m, String r) {
		modelno = m;
		regno = r;
	}

	void display() {
		System.out.println("Model No. : " + modelno);
		System.out.println("Registration No. : " + regno);
	}

}

class TwoWheeler extends VehicleDetail {
	int noofwheels;

	TwoWheeler(String m, String r, int n) {
		super(m, r);
		noofwheels = n;
	}

	void display() {
		System.out.println("Model No. : " + modelno);
		System.out.println("Registration No. : " + regno);
		System.out.println("No. of wheels : " + noofwheels);
	}

}

class ThreeWheeler extends VehicleDetail {
	int noofwheels;

	ThreeWheeler(String m, String r, int n) {
		super(m, r);
		noofwheels = n;
	}

	void display() {
		System.out.println("Model No. : " + modelno);
		System.out.println("Registration No. : " + regno);
		System.out.println("No. of wheels : " + noofwheels);
	}
}
