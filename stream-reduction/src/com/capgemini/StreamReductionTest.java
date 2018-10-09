package com.capgemini;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionTest {

	public static void main(String[] args) {
		OptionalInt reducedIntegers=IntStream.range(1, 10).reduce((a,b)->a+b);
		System.out.println(reducedIntegers.getAsInt());
		
		int reducedIntegers2=IntStream.range(1, 10).reduce(10, (a,b)->a+b);
		System.out.println("Including identity:"+reducedIntegers2);
		
		int reducedIntegers3= Arrays.asList(76,90,99,100,3,5).parallelStream().reduce(10, (a,b)->a+b, (a,b)->
		{
			return a+b;
		});
		System.out.println("including identity & combiner:"+reducedIntegers3);
	}

}
