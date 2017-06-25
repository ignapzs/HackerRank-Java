package es.ignapzs.hackerrank.java.algorithms.implementation.viraladvertising;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int people = 2;
		int count = 2;
		for (int i = 2; i <= n; i++) {
			people = (people * 3) / 2;
			count += people;
		}
		System.out.println(count);
		scan.close();
	}

}
