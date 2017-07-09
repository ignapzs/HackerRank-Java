package es.ignapzs.hackerrank.java.algorithms.implementation.jumpingontheclouds;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] c = new int[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}

		int[] minimumSteps = new int[c.length];
		Arrays.fill(minimumSteps, 1, minimumSteps.length, -1);
		for (int i = 0; i < minimumSteps.length; i++) {
			if (c[i] == 1) {
				continue;
			}

			if (i >= 1 && c[i - 1] == 0 && minimumSteps[i - 1] >= 0) {
				minimumSteps[i] = Math.min((minimumSteps[i] < 0) ? Integer.MAX_VALUE : minimumSteps[i],
						minimumSteps[i - 1] + 1);
			}
			if (i >= 2 && c[i - 2] == 0 && minimumSteps[i - 2] >= 0) {
				minimumSteps[i] = Math.min((minimumSteps[i] < 0) ? Integer.MAX_VALUE : minimumSteps[i],
						minimumSteps[i - 2] + 1);
			}
		}
		System.out.println(minimumSteps[minimumSteps.length - 1]);

		sc.close();
	}
}