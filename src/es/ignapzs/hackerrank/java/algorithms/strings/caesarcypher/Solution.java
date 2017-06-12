package es.ignapzs.hackerrank.java.algorithms.strings.caesarcypher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final byte N = Byte.parseByte(br.readLine());

		char[] s = br.readLine().toCharArray();

		final byte K = Byte.parseByte(br.readLine());

		for (byte i = 0; i < N; ++i) {
			char c = s[i];

			if (c >= 'a' && c <= 'z') {
				s[i] = (char) (((c - 'a' + K) % 26) + 'a');
			} else if (c >= 'A' && c <= 'Z') {
				s[i] = (char) (((c - 'A' + K) % 26) + 'A');
			}
		}

		System.out.print(s);
	}
}