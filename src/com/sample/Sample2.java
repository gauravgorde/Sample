package com.sample;

public class Sample2 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		System.out.print(a + " " + b);
		for (int i = 1; i <= 10; i++) {
			int sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}
	}
}
