package es.ignapzs.hackerrank.java.algorithms.strings.commonchild;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String a = in.next();
		String b = in.next();
		System.out.println(commonChild(a, b));

		in.close();
	}

	static int commonChild(String s1, String s2) {
		int length1 = s1.length();
		int length2 = s2.length();
		int[][] commonChild = new int[length1 + 1][length2 + 1];
		for (int i = 1; i <= length1; i++) {
			for (int j = 1; j <= length2; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					commonChild[i][j] = commonChild[i - 1][j - 1] + 1;
				} else {
					commonChild[i][j] = Math.max(commonChild[i - 1][j], commonChild[i][j - 1]);
				}
			}
		}
		return commonChild[length1][length2];
	}
}