package es.ignapzs.hackerrank.java.algorithms.strings.twocharacters;

import java.util.Scanner;

public class Solution {

	public static final int NUM_LETTERS = 26;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		String str = scan.next();
		scan.close();

		if (length <= 1) {
			System.out.println(0);
			return;
		}

		int[][] pair = new int[NUM_LETTERS][NUM_LETTERS];
		int[][] count = new int[NUM_LETTERS][NUM_LETTERS];

		for (int i = 0; i < length; i++) {
			char letter = str.charAt(i);
			int letterNum = letter - 'a';

			for (int col = 0; col < NUM_LETTERS; col++) {
				if (pair[letterNum][col] == letter) {
					count[letterNum][col] = -1;
				}
				if (count[letterNum][col] != -1) {
					pair[letterNum][col] = letter;
					count[letterNum][col]++;
				}
			}

			for (int row = 0; row < NUM_LETTERS; row++) {
				if (pair[row][letterNum] == letter) {
					count[row][letterNum] = -1;
				}
				if (count[row][letterNum] != -1) {
					pair[row][letterNum] = letter;
					count[row][letterNum]++;
				}
			}
		}

		int max = 0;
		for (int row = 0; row < NUM_LETTERS; row++) {
			for (int col = 0; col < NUM_LETTERS; col++) {
				max = Math.max(max, count[row][col]);
			}
		}
		System.out.println(max);
	}
}
