package es.ignapzs.hackerrank.java.algorithms.search.icecreamparlor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int money = input.nextInt();
			int flavors = input.nextInt();
			Map<Integer, Integer> complements = new HashMap<>();

			for (int i = 1; i <= flavors; i++) {
				int cost = input.nextInt();
				if (complements.containsKey(cost))
					System.out.println(complements.get(cost) + " " + i);
				else
					complements.put(money - cost, i);
			}
		}
		input.close();
	}
}