package com.sample;

import java.util.Arrays;
import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);


		list.forEach(System.out::println);
		
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
