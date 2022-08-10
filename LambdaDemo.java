package com.tns.core;

 interface Anonymous
 	{
	 	void show();
 	}
 
 
public class LambdaDemo {

	public static void main (String[] args) {
		
		Anonymous l=()->           //Lambda Expression
		
		{
			System.out.println("Lambda Demo for Simplification");
		};
		
		l.show();
		
		}
	
}