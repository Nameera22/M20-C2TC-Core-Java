//Create a thread using Thread class-Second technique

package com.tns.core;
class MyThread extends Thread     //Thread
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("I am MyThread");
		}
	}
}
public class DemoThread {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("I am Main Thread");
		}
	}
}
