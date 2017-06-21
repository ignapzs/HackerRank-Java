package es.ignapzs.hackerrank.java.algorithms.implementation.utopiantree;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		int height = 1;
		int[] finalHeight = new int[T];

		for (int i = 0; i < T; i++) {
			height = 1;
			int N = Integer.parseInt(sc.nextLine());
			if (N > 0) {
				for (int k = 0; k < N; k++) {
					if ((k % 2) == 0) {
						height = height * 2;
					} else {
						height += 1;
					}
				}
			}
			finalHeight[i] = height;
		}

		for (int q = 0; q < T; q++) {
			System.out.println(finalHeight[q]);
		}

		sc.close();

	}
}
