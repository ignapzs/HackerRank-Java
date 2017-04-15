package es.ignapzs.hackerrank.java.algorithms.dynamicprogramming.maxsubarray;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

	// Modified version of Jay Kadane's algorithm
	public static int maxSubarrayContiguous(int[] arr, int indexMax) {
		// Starting in the first element
		int maxSoFar = arr[0];
		int currMax = arr[0];

		for (int i = 1; i < indexMax; i++) {
			currMax = Math.max(arr[i], currMax + arr[i]);
			maxSoFar = Math.max(maxSoFar, currMax);
		}
		return maxSoFar;
	}

	public static int maxSubarrayNonContiguous(int[] arr, int indexMax) {
		int sumMax = 0;
		int max = arr[0];
		boolean negArray = true;
		int res = 0;
		for (int i = 0; i < indexMax; i++) {
			// All positive numbers
			if (arr[i] >= 0) {
				sumMax += arr[i];
				negArray = false;
			}
			// Find smallest negative number
			if (arr[i] >= max) {
				max = arr[i];
			}
		}

		if (negArray == false) {
			res = sumMax;
		}
		// If the array is full of negative numbers, return the smallest of all
		// of them
		if (negArray) {
			res = max;
		}

		return res;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// Store continous solutions
		int[] testSolutionsC = new int[10];
		// Store non-continuous solutions
		int[] testSolutionsNC = new int[10];
		int resC;
		int resNC;
		int runs;
		runs = Integer.parseInt(in.nextLine());

		for (int i = 0; i < runs; i++) {
			String inputString;
			int[] arr = new int[100000];
			int indexMax = Integer.parseInt(in.nextLine());

			// Tokenize input values (separated by space)
			inputString = in.nextLine();
			int arrIndex = 0;
			StringTokenizer st = new StringTokenizer(inputString);
			while (st.hasMoreTokens()) {
				arr[arrIndex] = Integer.parseInt(st.nextToken());
				arrIndex++;
			}

			// Continuous solution
			resC = maxSubarrayContiguous(arr, indexMax);
			// Non-Continuous solution
			resNC = maxSubarrayNonContiguous(arr, indexMax);

			// Add all the Continuous solutions to array
			testSolutionsC[i] = resC;
			// Add Non-continuous solutions to array
			testSolutionsNC[i] = resNC;

		}

		// Printing
		for (int i = 0; i < runs; i++) {
			System.out.print(testSolutionsC[i] + " ");
			System.out.print(testSolutionsNC[i]);
			System.out.println();
		}

		in.close();

	}
}