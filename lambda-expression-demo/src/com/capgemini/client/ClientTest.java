package com.capgemini.client;

import com.capgemini.myInterface.MyInterface;

public class ClientTest 
{
	public static void main(String[] args)
	{
		MyInterface myInter=(String name)->System.out.println("Name is:"+name);
		myInter.display("Urmi");
		
		
	}

}
