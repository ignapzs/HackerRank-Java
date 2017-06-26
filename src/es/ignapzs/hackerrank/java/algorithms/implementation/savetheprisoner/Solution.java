package es.ignapzs.hackerrank.java.algorithms.implementation.savetheprisoner;

import java.util.Scanner;

public class Solution {
	static int saveThePrisoner(int n, int m, int s) {
		return ((s - 1) + (m - 1)) % n + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int result = saveThePrisoner(n, m, s);
			System.out.println(result);
		}
		sc.close();
	}
}
