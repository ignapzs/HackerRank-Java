package es.ignapzs.hackerrank.java.algorithms.implementation.sockmerchant;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		Arrays.sort(ar);
		int total = 0;
		for (int i = 0; i < n - 1; i++) {
			if (i < n && ar[i] == ar[i + 1]) {
				total++;
				i = i + 1;
			}
		}
		in.close();
		System.out.println(total);
	}
}
