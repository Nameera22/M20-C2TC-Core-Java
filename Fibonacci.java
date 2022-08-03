package com.tns.core;

import java.util.Scanner;

public class Fibonacci {

		static int fib(int n)
		{
			if(n==0 || n==1)
				return n;
			
			else 
				return fib(n-1)+fib(n-2);
		}

		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the limit");
			int n=s.nextInt();
			System.out.println(fib(n));  //function call
			s.close();
				

		}

	}
