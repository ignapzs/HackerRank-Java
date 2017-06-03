package es.ignapzs.hackerrank.java.mathematics.fundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			int t = Integer.parseInt(s);
			BigInteger inp[] = new BigInteger[t];
			int in[] = new int[t];
			for (int i = 0; i < t; i++) {
				in[i] = Integer.parseInt(br.readLine());
				inp[i] = BigInteger.valueOf(in[i]);
			}
			for (int i = 0; i < t; i++) {
				BigInteger su;
				BigInteger a = BigInteger.valueOf(in[i]).divide(BigInteger.valueOf(2));
				if (in[i] % 2 == 0) {
					su = a.multiply(a);
				} else {
					su = a.multiply(a);
					su = su.add(a);
				}
				System.out.println(su);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
