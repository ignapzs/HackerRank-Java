package es.ignapzs.hackerrank.java.algorithms.greedy.sherlockandthebeast;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numOfTestCases = input.nextInt();
		while (numOfTestCases != 0) {
			long n = input.nextLong();
			long x = 0;
			long y = 0;
			long solution_lower_bound = n / 3;
			long solution_upper_bound = 2 * n / 5;
			long[] t = new long[(int) (solution_upper_bound - solution_lower_bound + 1)];
			for (int i = 0; i < t.length; i++) {
				t[i] = i + solution_lower_bound;
			}
			for (int i = 0; i < t.length; i++) {

				x = 2 * n - 5 * t[i]; // x = 2n - 5t
				y = -1 * n + 3 * t[i]; // y = -n + 3t
				if (x >= 0 && y >= 0) {
					if (!(x == 0 && y == 0)) {
						break;
					}
				}
			}
			if (x < 0 || y < 0 || (x == 0 && y == 0)) {
				System.out.println(-1);
				numOfTestCases--;
				continue;
			}
			StringBuilder resultSB = new StringBuilder();
			for (int i = 0; i < 3 * x; i++) {
				resultSB.append("5");
			}
			for (int i = 0; i < 5 * y; i++) {
				resultSB.append("3");
			}
			System.out.println(resultSB.toString());
			numOfTestCases--;
		}
		input.close();
	}
}
