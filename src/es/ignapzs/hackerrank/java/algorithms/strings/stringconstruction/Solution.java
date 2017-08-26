package es.ignapzs.hackerrank.java.algorithms.strings.stringconstruction;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String s = in.next();

			Set<Character> uniqueChars = new HashSet<>();
			for (char c : s.toCharArray()) {
				uniqueChars.add(c);
			}
			System.out.println(uniqueChars.size());
		}
		in.close();
	}
}
