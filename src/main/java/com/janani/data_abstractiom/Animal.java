package com.janani.data_abstractiom;

public abstract class Animal {

	protected static int age = 13;

	Animal() {
		System.out.println("Super class constructor");
	}

	public abstract void sound();

	public abstract void eating();

	public abstract int animalAge(int age);

	public void display() {

		System.out.println("this is the display method from abstract class");
	}

}
