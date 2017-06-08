package es.ignapzs.hackerrank.java.algorithms.implementation.sherlockandsquares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCases = Integer.parseInt(br.readLine());
			for (int i = 0; i < testCases; i++) {
				String testCaseString = br.readLine();
				List<String> testCaseList = Arrays.asList(testCaseString.split(" "));
				List<Integer> testCase = new ArrayList<Integer>();
				for (String str : testCaseList) {
					testCase.add(Integer.parseInt((String) str));
				}
				double count = Math.floor(Math.sqrt(testCase.get(1))) - Math.ceil(Math.sqrt(testCase.get(0))) + 1;
				System.out.printf("%d\n", (int) count);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}