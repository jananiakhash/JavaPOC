package com.n2s.lab_exercise;

import java.util.Arrays;
import java.util.Collections;

public class ArrangeNubers_AscendingOrder {

	public static void main(String[] args) {

		String[] arr = { "janani", "akhash", "diya" };
		Arrays.sort(arr);
		Arrays.sort(arr, Collections.reverseOrder());

		for (String s : arr) {
			System.out.println(s);
		}

	}

}
