package com.capgemini;

public class MaximumDemo {
	public static void main(String[] args) {
		CalculateMaximumInterface maximum=(number1,number2)->{ return (number1>number2)?number1:number2;};
		System.out.println("The maximum number is:"+maximum.getMaximum(879, 5435));
																
			
		}
		
	}


