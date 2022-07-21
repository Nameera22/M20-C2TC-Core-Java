
//join() method
package com.tns.core;

class Adarsh extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Adarsh Thread");
			try 
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Adarsh a=new Adarsh();
		a.start();
		a.join();           //1st version     // Amol wants to wait
		//a.join(2000);     // 2nd version
		//a.join(3000,100);   //3rd version
	
		for(int i=0;i<10;i++)
		{
			System.out.println("Amol Thread");
		}
	}
		

	}
