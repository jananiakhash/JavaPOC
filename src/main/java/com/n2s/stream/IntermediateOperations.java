package com.n2s.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++)
			list.add(i);

		Stream<Integer> seq = list.stream();
		Stream<Integer> num = seq.filter(p -> p > 90);

		num.forEach(e -> System.out.println(e));

		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println(names.map(s -> {
			return s.toUpperCase();
		}).collect(Collectors.toList()));

	}
}
