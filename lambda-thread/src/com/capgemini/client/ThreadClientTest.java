package com.capgemini.client;

public class ThreadClientTest {

	public static void main(String[] args)
	{
        //Runnable r =  threadWithoutLambda();
        Runnable r =  threadWithLambda();
        Thread thread = new Thread(r);
         thread.start();
        
 }

	/*	private static Runnable threadWithoutLambda() {
        return new Runnable() {
               
               @Override
               public void run() {
                     System.out.println("Thread without Lambda");
               }
        };
 
		}*/
		private static Runnable threadWithLambda()
		{
			 Runnable thread1 = ()->System.out.println("Thread Using Lambda");

			 return thread1;
	}

}
