package com.tns.core;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l=List.of(10,20,12,24,35,67,13,26,82);
		System.out.println(l);
		
		//conventional code
		/*List<Integer>evenList=new ArrayList<>();
		for(Integer i:l)//foreach loop
		{
			if(i%2==0)
			{
				evenList.add(i);
			}
		}
		System.out.println(evenList);
*/		
		Stream<Integer>stream=l.stream();
		/* List<Integer> el=stream.filter(i->i%2==0).collect(Collectors.toList()); */
		List<Integer> el=stream.map(i->i+10).collect(Collectors.toList());
		
		System.out.println(el);

	}

}
