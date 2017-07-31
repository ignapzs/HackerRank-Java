package es.ignapzs.hackerrank.java.algorithms.implementation.climbingtheleadoerboard;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] scores = new int[n];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		int[] ranks = buildTheRanks(scores);

		int m = in.nextInt();
		for (int i = 0; i < m; i++) {
			int alice = in.nextInt();
			System.out.println(solve(scores, ranks, alice));
		}

		in.close();
	}

	static int[] buildTheRanks(int[] scores) {
		int[] ranks = new int[scores.length];
		int rank = 1;
		for (int i = 0; i < ranks.length; i++) {
			if (i > 0 && scores[i] != scores[i - 1]) {
				rank++;
			}
			ranks[i] = rank;
		}
		return ranks;
	}

	static int solve(int[] scores, int[] ranks, int alice) {
		int lower = 0;
		int upper = scores.length - 1;
		int aliceRank = 1;
		while (lower <= upper) {
			int middle = (lower + upper) / 2;
			if (alice == scores[middle]) {
				aliceRank = ranks[middle];
				break;
			} else if (alice < scores[middle]) {
				aliceRank = ranks[middle] + 1;
				lower = middle + 1;
			} else {
				upper = middle - 1;
			}
		}
		return aliceRank;
	}
}
