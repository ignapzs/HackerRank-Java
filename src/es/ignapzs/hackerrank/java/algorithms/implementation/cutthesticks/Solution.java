package es.ignapzs.hackerrank.java.algorithms.implementation.cutthesticks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		List<Integer> sticks = readSticksFromStdin();
		Collections.sort(sticks);

		int position = 0;
		int remaining = sticks.size();
		while (0 < remaining) {
			System.out.println(remaining);
			int count = countEqualFrom(sticks, position);
			position += count;
			remaining -= count;
		}
	}

	private static int countEqualFrom(List<Integer> sticks, int from) {
		int value = sticks.get(from);
		for (int i = 1; from + i < sticks.size(); ++i) {
			if (value != sticks.get(from + i)) {
				return i;
			}
		}
		return sticks.size() - from;
	}

	private static List<Integer> readSticksFromStdin() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> sticks = new ArrayList<>(num);
		for (int i = 0; i < num; ++i) {
			sticks.add(sc.nextInt());
		}
		sc.close();
		return sticks;
	}
}
