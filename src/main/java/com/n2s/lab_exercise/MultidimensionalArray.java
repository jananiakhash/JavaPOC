package com.n2s.lab_exercise;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2 }, { 5, 6 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("arr[" + i + "]" + " " + "[" + j + "] =" + arr[i][j]);

			}
		}

	}

}
