package com.janani.data_abstractiom;

public class AbstractionMainApplication {
	static int age;

	public static void main(String[] args) {
		Cat c = new Cat();
		c.display();
		c.sound();
		c.eating();
		System.out.println(c.animalAge(age));
		Dog d = new Dog();
		d.sound();
		d.eating();
		System.out.println(d.animalAge(age));

	}

}
