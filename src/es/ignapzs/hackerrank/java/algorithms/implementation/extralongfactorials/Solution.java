package es.ignapzs.hackerrank.java.algorithms.implementation.extralongfactorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final byte N = Byte.parseByte(br.readLine());

		BigInteger factorial = BigInteger.ONE;

		for (byte i = 2; i <= N; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		System.out.print(factorial);
	}
}
