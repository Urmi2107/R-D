package com.capgemini;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		
		System.out.println(" Creating Empty Stream:");
		Stream<String>emptyStream=Stream.empty();
		
		System.out.println("Using stream():");
		String str[]=new String[]{"Urmi","Juin","Pramita"};
		Stream<String>stream1=Arrays.stream(str,1,3);
		stream1.forEach(System.out::println);
		
		System.out.println("Using of():");
		Stream<String>stream2=Stream.of("Urmi","Juin","Prmaita");
		stream2.forEach(System.out::println);
		
		System.out.println("Stream Collection:");
		List<Integer> integers=Arrays.asList(3,9,7,0,10,20);
		Stream<Integer>stream3=integers.stream();
		stream3.forEach(System.out::println);
		
		System.out.println("Using parallel stream:");
		integers.parallelStream().forEach(x->System.out.println(x));
		
		System.out.println("Stream.build():");
		Stream<String> streambuilder=Stream.<String>builder().add("q").add("d").add("j").build();
		streambuilder.forEach(System.out::println);
		
		System.out.println("Stream.generate():");
		Stream<String>limit=Stream.generate(()->"Stream").limit(5);
		limit.forEach(System.out::println);
	}

}
