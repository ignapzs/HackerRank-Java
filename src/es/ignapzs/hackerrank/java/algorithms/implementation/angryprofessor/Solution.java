package es.ignapzs.hackerrank.java.algorithms.implementation.angryprofessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (byte T = Byte.parseByte(br.readLine()); T > 0; --T) {

			String[] line = br.readLine().split(" ");
			short K = Short.parseShort(line[1]);
			short N = (short) (Short.parseShort(line[0]) - K + 1);

			line = br.readLine().split(" ");

			boolean isClassCancelled = true;
			for (short i = 0; i < N; ++i) {

				if (Byte.parseByte(line[i]) < 1) {
					++N;

					if (--K < 1) {
						isClassCancelled = false;
						break;
					}
				}
			}

			System.out.println((isClassCancelled) ? "YES" : "NO");
		}
	}
}