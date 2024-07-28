package com.leetcode.apr2022;

public class MultidimensionalArrays {

	public static void main(String[] args) {

		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		printMatrix(matrix);

		// matrix transpose
		for (int row = 0; row < matrix.length; row++) {
			for (int col = row+1; col < matrix[0].length; col++) {
				int temp = matrix[row][col];
				matrix[row][col] = matrix[col][row];
				matrix[col][row] = temp;
			}

		}
		
		printMatrix(matrix);

	}

	private static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}

	}


}
