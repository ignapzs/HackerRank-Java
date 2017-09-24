package es.ignapzs.hackerrank.java.algorithms.search.pairs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int numIntegers = sc.nextInt();
		int difference = sc.nextInt();
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for (int i = 0; i < numIntegers; i++) {
			intArrayList.add(sc.nextInt());
		}
		Collections.sort(intArrayList);
		int count = 0;
		int startPos = 0;
		int currentPos = 0;
		while (currentPos < intArrayList.size()) {
			currentPos = startPos + 1;
			while (currentPos < intArrayList.size()) {
				int diff = Math.abs(intArrayList.get(currentPos) - intArrayList.get(startPos));
				if (diff == difference) {
					count++;
				} else if (diff > difference) {
					break;
				}
				currentPos++;

			}
			startPos++;
		}
		System.out.println(count);
		sc.close();
	}
}
