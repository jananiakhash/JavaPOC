package com.n2s.myApplication;

public class IFC_Sample implements IFC1, IFC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// z=20;
		IFC_Sample ifc_Sample = new IFC_Sample();

		System.out.println(ifc_Sample.addition(ifc1_x, ifc2_y));
		ifc_Sample.display1();
		
		IFC1.disply2();
		
	}

	@Override
	public int sub(int x, int y) {

		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public int addition(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

}

