package com.n2s.methodref;

public class StaticMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p = StaticMethodRef::crediPay;
		p.pay();

	}

	public static void crediPay() {
		System.out.println("paying through credit card");
	}

}

interface Payment {
	void pay();

}
