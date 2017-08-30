package es.ignapzs.hackerrank.java.algorithms.strings.sherlockvalidstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final char[] charArray = br.readLine().toCharArray();

		System.out.print(isValid(charArray) ? "YES" : "NO");
	}

	private static boolean isValid(final char[] S) {

		if (S.length < 2) {
			return true;
		}

		final int[] letters = new int[26];
		for (int i = 0, N = S.length; i < N; ++letters[S[i++] - 'a']) {
		}

		Arrays.sort(letters);

		int i;
		for (i = 0; i < 26 && letters[i] == 0; ++i) {
		}

		if (letters[i] == letters[25]) {
			return true;
		}

		if (letters[25] > letters[24]) {
			return letters[i] == letters[24] && letters[25] - letters[24] == 1;
		}

		return letters[i] < letters[i + 1] && letters[i + 1] == letters[25] && letters[i] == 1;
	}
}