package es.ignapzs.hackerrank.java.algorithms.strings.alternatingchars;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int count = 0; count < t; count++) {
			char[] characters = sc.next().toCharArray();
			int altCounter = 0;
			for (int i = 0; i < characters.length - 1; i++) {
				if (characters[i] == characters[i + 1]) {
					altCounter++;
				}
			}
			System.out.println(altCounter);
		}
		sc.close();
	}
}
