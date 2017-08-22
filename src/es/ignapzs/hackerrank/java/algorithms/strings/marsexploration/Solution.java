package es.ignapzs.hackerrank.java.algorithms.strings.marsexploration;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();
		System.out.println(alteredLetters(str));
	}

	private static int alteredLetters(String message) {
		String sos = "SOS";
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) != sos.charAt(i % 3)) {
				count++;
			}
		}
		return count;
	}
}
