package com.janani.data_abstractiom;

public class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("Hoof Hoof....");

	}

	@Override
	public void eating() {
		System.out.println("Dog : I eat rice");

	}

	@Override
	public int animalAge(int age) {
		// TODO Auto-generated method stub
		return super.age;
	}

}
