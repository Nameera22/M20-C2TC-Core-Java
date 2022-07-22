//Demo is on Synchronized

package com.tns.core;

class Counter
{
	int count;
	
	public synchronized void inc()   
	{
		count++;
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		
		//Thread1
		Thread t1=new Thread(new Runnable()     //creating Thread using Runnable interface
				{
			public void run() {
				for (int i=1;i<=10000;i++) 
				{
					c.inc();
					
				}
			}
			
				});
	
		//Second Thread
		Thread t2 =new Thread(new Runnable()     //creating Thread using Runnable interface
				{
			public void run() {
				for (int i=1;i<=10000;i++) 
				{
					c.inc();
					
				}
			}
			
				});
		
		t1.start();
		t2.start();
		t1.join();               //join() method
		t2.join();
		
		
		System.out.println(c.count);
		

	}

}