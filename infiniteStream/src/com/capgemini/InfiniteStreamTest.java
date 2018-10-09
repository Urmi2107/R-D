package com.capgemini;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamTest {

	public static void main(String[] args) {
		
		Stream<Integer>numbers=Stream.iterate(0, i->i+2);
		numbers.limit(20).forEach(System.out::println);
		
	}

}
