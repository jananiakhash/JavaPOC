package com.n2s.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
		Optional<Integer> op = numbers.reduce((i, j) -> {
			return i * j;
		});

		if (op.isPresent())
			System.out.println(op.get());
		Stream<Integer> numbers1 = Stream.of(1, 2, 3, 4, 5);

		System.out.println(numbers1.count());

	}

}
