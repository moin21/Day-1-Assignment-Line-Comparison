package com.linecomparisonprogram;

public class LineComparisonProgram {

	public static double length;

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Program!!");
		/*
		 * Calling lineLength function to calculate length where i=x1, j=x2, k=y1 and
		 * l=y2
		 */
		String length1 = String.valueOf(lineLength(0, 3, 0, 5));
		String length2 = String.valueOf(lineLength(0, 3, 0, 5));
		// Length Comparison between two lines
		if (length1.equals(length2)) {
			System.out.println("Length of lines are equal");
		} else
			System.out.println("Length of lines are not equal");
	}

	// Method to Calculate length of Lines
	public static double lineLength(int i, int j, int k, int l) {
		length = Math.sqrt((j - i) * (j - i) + (l - k) * (l - k));
		return length;
	}

}