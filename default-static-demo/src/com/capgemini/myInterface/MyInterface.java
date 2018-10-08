package com.capgemini.myInterface;

import java.util.Collections;
import java.util.List;

import com.capgemini.model.Student;

public interface MyInterface {
	default List<Student> sortStudents(List<Student> studentList)
	{
		Collections.sort(studentList);
		return studentList;
	}
	public static void greet(String name)
	{
		System.out.print("Welcome:"+name);
	}
	public abstract Integer getMaximum(List<Integer>numberList);
}
