package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Sample2 {

	public static void main(String[] args) {

		Set<Integer> set = Set.of(1, 22, 33, 55, 44);
		System.out.println(set);
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);

		list.forEach(System.out::println);

		list.forEach(System.out::println);

	}
}
