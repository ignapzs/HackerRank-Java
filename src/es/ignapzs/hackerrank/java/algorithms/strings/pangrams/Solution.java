package es.ignapzs.hackerrank.java.algorithms.strings.pangrams;

import java.util.Scanner;

public class Solution {

	protected static String getOutput(String sentence) {
		return (isPangram(sentence)) ? "pangram" : "not pangram";
	}

	protected static boolean isPangram(String sentence) {
		String lowerCaseSentence = sentence.toLowerCase();
		for (char letter = 'a'; letter <= 'z'; letter++) {
			if (lowerCaseSentence.indexOf(letter) < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println(Solution.getOutput(sc.nextLine()));
		sc.close();
	}
}
