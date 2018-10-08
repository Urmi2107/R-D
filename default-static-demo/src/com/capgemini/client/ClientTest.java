package com.capgemini.client;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Student;
import com.capgemini.myInterface.MyInterface;
import com.capgemini.myInterfaceImpl.MyClass;

public class ClientTest {

	public static void main(String[] args) {
		MyInterface myInterface=new MyClass();
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student("Urmi",22));
		studentList.add(new Student("Juin", 23));
		studentList.add(new Student("Jhinuk", 19));
		studentList.add(new Student("Manami", 18));
		studentList.add(new Student("Drishti", 21));
		
		List<Student> sortedStudent=myInterface.sortStudents(studentList);
		for(Student student:sortedStudent)
		{
			MyInterface.greet(student.getName()) ;
			System.out.println(" and age is:"+student.getAge());
			
		}
		
		List<Integer> numberList =new ArrayList<Integer>();
		numberList.add(234);
		numberList.add(9879);
		numberList.add(213);
		numberList.add(56);
		numberList.add(90);
		numberList.add(345);
		numberList.add(888);
		System.out.println("Maximum number is:"+myInterface.getMaximum(numberList));
		
	}

}
