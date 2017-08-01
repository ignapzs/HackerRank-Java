package es.ignapzs.hackerrank.java.algorithms.implementation.kangaroo;

import java.util.Scanner;

public class Solution {
	public static void main(String[] arsg) {
		Scanner in = new Scanner(System.in);

		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		System.out.println((v1 > v2 && (x2 - x1) % (v1 - v2) == 0) ? "YES" : "NO");

		in.close();
	}
}
