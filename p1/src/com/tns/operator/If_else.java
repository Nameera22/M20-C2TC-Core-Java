package com.tns.operator;

public class If_else {
	public static void main(String[] args) {
		int x = 4;

		
		 if (x == 5) 
		  { 
		  if (x >= 5) 
		  {
		  	System.out.println("X is greater than 5"); 
		   }
		  else 
		  {
		  System.out.println("X is smaller than 5"); 
		  } 
		 }
		
		if(x == 5)
		{
			System.out.println("X equals to 5");
		}
		else if(x > 5)
		{
			System.out.println("X is greater to 5");		
		}
		else 
		{
			System.out.println("X is smaller than 5");
		}
		
	}


}
