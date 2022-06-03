package com.n2s.lamdaexpression;

public class LamdaWithSingleAndDoubleParam {

	public static void main(String[] args) {

		Sayable s1 = (name) -> {

			return name;

		};
		System.out.println("Single parameter" + " " + s1.say("janani"));

		System.out.println("**********************");

		Addable a1 = (a, b) -> {
			return a + b;

		};
		System.out.println("Double parameter" + " " + a1.add(7, 3));

	}

}

interface Sayable {

	public String say(String name);

}

interface Addable {

	public int add(int a, int b);

}