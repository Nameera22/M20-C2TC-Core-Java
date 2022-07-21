//Creating thread using Runnable interface- First Technique 

package com.tns.core;
class Thread1 implements Runnable
{
	               //one method is used
	public void run() {
		for (int i=0;i<7;i++)
		{
			System.out.println(i);
		}
	}
	
}
public class ThreadDemo {
	public static void main(String[] args) 
	{
		Thread1 t=new Thread1();
		Thread s=new Thread(t);     //constructor
		s.start();    //start your thread
		

	}
}
