package com.sample;

import java.util.Arrays;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		for (Integer integer : list) {
			System.out.println(integer);
		}

		System.out.println("Hello");
		System.out.println("First case scenario");
	}
}
