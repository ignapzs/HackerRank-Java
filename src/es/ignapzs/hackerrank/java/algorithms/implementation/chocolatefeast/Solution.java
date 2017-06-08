package es.ignapzs.hackerrank.java.algorithms.implementation.chocolatefeast;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			int total = sc.nextInt();
			int cost = sc.nextInt();
			int free = sc.nextInt();
			int wrapper = total / cost;
			int eat = 0;
			eat = wrapper;
			while (wrapper >= free) {
				int temp = wrapper / free;
				eat = eat + temp;
				wrapper = wrapper - (temp * free);
				wrapper = wrapper + temp;
			}
			System.out.println(eat);
			sc.close();
		}
	}
}