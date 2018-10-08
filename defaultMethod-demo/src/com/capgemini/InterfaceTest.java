package com.capgemini;

public class InterfaceTest implements MyInterface1,MyInterface2 {
	@Override
	public void display()
	{
		MyInterface1.super.display();
		MyInterface2.super.display();
		
	}
	public static void main(String[] args)
	{
		InterfaceTest test=new InterfaceTest();
		test.display();
	}
	
}
