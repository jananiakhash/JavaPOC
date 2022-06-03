package com.n2s.methodref;

public class InstanceMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMethodRef imr = new InstanceMethodRef();
		Payment1 p1 = imr::debitPay;
		p1.pay();
		Payment1 p2 = new InstanceMethodRef()::debitPay;
		p2.pay();

	}

	public void debitPay() {
		System.out.println("paying through debit card");
	}

}

interface Payment1 {
	void pay();
}
