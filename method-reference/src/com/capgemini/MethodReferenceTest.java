package com.capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class MethodReferenceTest {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(3,56,89,21);
		List<Double> squareRoots=MethodReferenceTest.findSqaureRoots(numbers,Integer::new);
		squareRoots.forEach(System.out::println);
		/*  static method reference
		  ExecutorService executorService=Executors.newSingleThreadExecutor();
		Runnable command=MethodReferenceTest::myRun;
		executorService.execute(command);*/
		

	}
	/*private static void myRun()
	{
		System.out.println("thread is running...");
	}*/
	private static List<Double> findSqaureRoots(List<Integer>numbers,Function<Integer, Integer> f)
	{
		List<Double> resultSqaureRoots= new ArrayList<Double>();
		numbers.forEach(x->resultSqaureRoots.add(Math.sqrt(f.apply(x))));
		return resultSqaureRoots;
	}

}
