package com.janani.data_abstractiom;

public class Cat extends Animal {
	int age = 8;

	@Override
	public void sound() {
		System.out.println("Meow Meow....");

	}

	@Override
	public void eating() {
		System.out.println("Cat : I eat fish");

	}

	@Override
	public int animalAge(int age) {
		// TODO Auto-generated method stub
		return this.age;
	}

}
