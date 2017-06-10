package es.ignapzs.hackerrank.java.algorithms.implementation.servicelane;

import java.util.Scanner;

public class Solution {

	public static int serviceLane(int[] width, int start, int end) {
		int min = 3;
		for (int j = start; j <= end; j++) {
			if (width[j] < min) {
				min = width[j];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int N = 0;
		int T = 0;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		T = sc.nextInt();
		int[] width = new int[N];
		for (int i = 0; i < N; i++) {
			width[i] = sc.nextInt();
		}
		for (int i = 0; i < T; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(serviceLane(width, start, end));
		}
		sc.close();
	}
}
