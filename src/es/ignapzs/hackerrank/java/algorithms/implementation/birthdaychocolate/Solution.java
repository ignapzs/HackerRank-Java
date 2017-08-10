package es.ignapzs.hackerrank.java.algorithms.implementation.birthdaychocolate;

import java.util.Scanner;

public class Solution {

	static int getWays(int[] squares, int d, int m) {
		int ways = 0;
		int sum = 0;

		if (m <= squares.length) {
			for (int i = 0; i < m; i++) {
				sum += squares[i];
			}
		}
		if (sum == d)
			ways++;

		for (int i = 0; i < squares.length - m; i++) {
			sum = sum - squares[i] + squares[i + m];
			if (sum == d) {
				ways++;
			}
		}
		return ways;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result = getWays(s, d, m);
		in.close();
		System.out.println(result);
	}
}
