package es.ignapzs.hackerrank.java.algorithms.search.sherlockandarray;

import java.util.Scanner;

public class Solution {

	static String solve(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		int curr = 0;
		for (int j = 0; j < a.length; j++) {
			// left part equals right part
			if (curr == sum - a[j] - curr) {
				return "YES";
			}
			curr += a[j];
		}
		return "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			String result = solve(a);
			System.out.println(result);
			in.close();
		}
	}
}
