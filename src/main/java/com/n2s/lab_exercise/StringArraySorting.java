package com.n2s.lab_exercise;

import java.util.Arrays;

public class StringArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "janani", "Diya", "Akhash" };
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
		printArray(arr);

	}

	private static void printArray(String[] ar) {

		for (String s : ar) {
			System.out.println(s);
		}
	}

}
