package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student("tony",30));
		studentList.add(new Student("mark",12));
		studentList.add(new Student("sky",26));
		studentList.add(new Student("natasha",10));
		studentList.add(new Student("steve",25));
		Stream<Student> filterList=studentList.stream().filter(s->s.getAge()>20);
		filterList.forEach(System.out::println);
		System.out.println(studentList.stream().anyMatch(s->s.getName().contains("s")));
	}

}
