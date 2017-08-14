package es.ignapzs.hackerrank.java.algorithms.strings.superreducedstring;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (!stack.isEmpty() && ch == stack.peek()) {
				stack.pop();
			} else {
				stack.push(ch);
			}
		}

		if (stack.isEmpty()) {
			System.out.println("Empty String");
		} else {
			for (char ch : stack) {
				System.out.print(ch);
			}
		}

		sc.close();

	}
}
