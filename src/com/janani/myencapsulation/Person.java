package com.janani.myencapsulation;

public class Person {
	private String name, address;

	public String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	private void method1() {
		System.out.println(   "This is your private method"    );
	}
	public void method2() {
		System.out.println("This is your public method");
	}
}
