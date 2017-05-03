package es.ignapzs.hackerrank.java.algorithms.strings.lovelettermystery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		StringBuffer sb = new StringBuffer();
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			for (byte t = Byte.parseByte(br.readLine()); t > 0; --t) {

				// Number of operations to 0
				int numOps = 0;
				// Read the string
				char[] str = br.readLine().toCharArray();

				// Doing the checkings depending on the values given
				for (short i = 0, j = (short) (str.length - 1); i < j; ++i, --j) {
					numOps += str[i] < str[j] ? str[j] - str[i] : str[i] - str[j];
				}

				// Append the result to the output
				sb.append(numOps + "\n");
			}

		} catch (IOException ioe) {
			System.out.println(ioe);
		} finally {
			System.out.print(sb);
		}
	}
}
