package com.capgemini;

public class LambdaParametersTest {

	public static void main(String[] args) {
		MyInterface myInterface=(String name,int age)->System.out.println("Name:"+name+" , Age:"+age);
		myInterface.display("Urmi", 22);

	}

}
