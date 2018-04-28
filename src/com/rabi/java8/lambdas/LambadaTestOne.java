package com.rabi.java8.lambdas;

import java.util.Arrays;
import java.util.List;

public class LambadaTestOne {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30);

		MyInterface implWithoutLamba = new MyInterface() {
			@Override
			public int getSize(List<Integer> list) {
				return list.size();
			}
		};
		System.out.println(implWithoutLamba.getSize(list));

		MyInterface implWithLamba = p -> p.size();
		System.out.println(implWithLamba.getSize(list));

		iterateList(list);
	}

	private static void iterateList(List<Integer> list) {
		// List Iteration without Lambda
		for (Integer i : list) {
			System.out.println(i);
		}
		// List Iteration with Lambda
		list.stream().forEach(p -> System.out.println(p));
	}

}
