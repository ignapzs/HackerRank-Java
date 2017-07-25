package es.ignapzs.hackerrank.java.algorithms.implementation.sequenceequation;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] p_inverse = new int[n + 1];

		for (int x = 1; x <= n; x++) {
			int px = scanner.nextInt();
			p_inverse[px] = x;
		}

		for (int x = 1; x <= n; x++) {
			int y = p_inverse[p_inverse[x]];
			System.out.println(y);
		}

		scanner.close();
	}
}
