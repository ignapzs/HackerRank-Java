package es.ignapzs.hackerrank.java.algorithms.implementation.migratorybirds;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

	static int solve(int[] types) {
		int[] counts = new int[6];
		for (int type : types) {
			counts[type]++;
		}

		int maxCount = IntStream.range(1, counts.length).map(i -> counts[i]).max().getAsInt();
		for (int i = 1;; i++) {
			if (counts[i] == maxCount) {
				return i;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] types = new int[n];
		for (int i = 0; i < types.length; i++) {
			types[i] = sc.nextInt();
		}

		sc.close();

		System.out.println(solve(types));
	}

}