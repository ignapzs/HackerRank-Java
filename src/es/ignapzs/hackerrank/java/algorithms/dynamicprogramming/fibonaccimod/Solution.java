package es.ignapzs.hackerrank.java.algorithms.dynamicprogramming.fibonaccimod;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scn = new Scanner(System.in);
		int A, B, N;
		A = scn.nextInt();
		B = scn.nextInt();
		N = scn.nextInt();
		BigInteger[] array = new BigInteger[N];
		array[0] = BigInteger.valueOf(A);
		array[1] = BigInteger.valueOf(B);
		for (int i = 2; i < N; i++) {
			array[i] = (array[i - 1].multiply(array[i - 1])).add(array[i - 2]);
		}
		System.out.println(array[N - 1]);
		scn.close();
	}
}