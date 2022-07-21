
 //yield()
package com.tns.core;
class ChildThread extends Thread   //Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am Child Thread");
			Thread.yield();  //passes the chance of execution to the main thread
		}
	}
}

      //Thread Scheduler

public class YieldDemo {
	public static void main(String[] args) {
		ChildThread t=new ChildThread();
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("I am Main Thread");
			
		}
 		
	}
}
