package com.tns.core;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

	public static void main(String[] args) {
		List<Integer>list1=Arrays.asList(14,15,98,65);
		List<Double>list2=Arrays.asList(2.3,5.6,3.7,9.2);
		printList(list1);
		printList(list2);
		
	}
		public static void printList(List<?> list)
		{
			System.out.println(list);
		}
		
		


	}


