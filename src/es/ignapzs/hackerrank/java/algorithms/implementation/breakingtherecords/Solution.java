package es.ignapzs.hackerrank.java.algorithms.implementation.breakingtherecords;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] s = new int[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = in.nextInt();
		}
		Result result = solve(s);
		System.out.println(result.maxBreakNum + " " + result.minBreakNum);

		in.close();
	}

	static Result solve(int[] s) {
		int max = s[0];
		int min = s[0];
		int maxBreakNum = 0;
		int minBreakNum = 0;

		for (int i = 1; i < s.length; i++) {
			if (s[i] > max) {
				max = s[i];
				maxBreakNum++;
			} else if (s[i] < min) {
				min = s[i];
				minBreakNum++;
			}
		}

		return new Result(maxBreakNum, minBreakNum);
	}
}

class Result {
	int maxBreakNum;
	int minBreakNum;

	Result(int maxBreakNum, int minBreakNum) {
		this.maxBreakNum = maxBreakNum;
		this.minBreakNum = minBreakNum;
	}
}
