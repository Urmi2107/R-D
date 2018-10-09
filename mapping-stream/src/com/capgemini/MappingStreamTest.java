package com.capgemini;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MappingStreamTest {
	public static void main(String[] args) {
		List<String> studentList=new ArrayList<>();
		studentList.add("tony");
		studentList.add("mark");
		studentList.add("sky");
		studentList.add("natasha");
		studentList.add("steve");
		Stream<String> map= studentList.stream().map(x->x.toUpperCase());
		map.forEach(System.out::println);
		
	}

}
