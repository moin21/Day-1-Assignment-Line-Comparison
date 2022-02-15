package com.linecomparisonprogram;

import java.util.*;

public class LineComparisonProgram {

	public static double length;

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Program!!");

		// Taking coordinates for first line
		System.out.println("Enter Values for 1st line");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1");
		int x1 = scanner.nextInt();
		System.out.println("Enter x2");
		int x2 = scanner.nextInt();
		System.out.println("Enter y1");
		int y1 = scanner.nextInt();
		System.out.println("Enter y2");
		int y2 = scanner.nextInt();

		// Taking coordinates for second line
		System.out.println("Enter Values for 2nd line");
		System.out.println("Enter x1");
		int i1 = scanner.nextInt();
		System.out.println("Enter x2");
		int i2 = scanner.nextInt();
		System.out.println("Enter y1");
		int j1 = scanner.nextInt();
		System.out.println("Enter y2");
		int j2 = scanner.nextInt();
		scanner.close();
		/*
		 * Calling lineLength function to calculate length where i=x1, j=x2, k=y1 and
		 * l=y2
		 */
		String length1 = String.valueOf(lineLength(x1, x2, y1, y2));
		String length2 = String.valueOf(lineLength(i1, i2, j1, j2));
		// Length Comparison between two lines
		switch (length1.compareTo(length2)) {
		case 0:
			System.out.println("Lines are equal.");
			break;
		default:
			System.out.println("Lines are not equal.");
		}
	}

	// Method to Calculate length of Lines
	public static double lineLength(int i, int j, int k, int l) {
		length = Math.sqrt((j - i) * (j - i) + (l - k) * (l - k));
		return length;
	}

}