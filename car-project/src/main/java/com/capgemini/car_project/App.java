package com.capgemini.car_project;

import org.junit.Test;

/**
 * Hello world!
 *
 */

public class App 
{
	@Test
    public  void processTest()
    {
        //System.out.println( "Hello World!" );
        CarService car=new CarService();
		car.process("BMW");
        
    }
}
