package es.ignapzs.hackerrank.java.algorithms.implementation.appleandorange;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];

		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];

		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}

		int[] fallOns = solve(s, t, a, b, apple, orange);
		System.out.println(fallOns[0]);
		System.out.println(fallOns[1]);

		in.close();
	}

	static int[] solve(int s, int t, int a, int b, int[] apples, int[] oranges) {
		return new int[] { countFallOn(Arrays.stream(apples).map(apple -> a + apple), s, t),
				countFallOn(Arrays.stream(oranges).map(orange -> b + orange), s, t) };
	}

	static int countFallOn(IntStream locations, int s, int t) {
		return (int) locations.filter(location -> location >= s && location <= t).count();
	}
}
