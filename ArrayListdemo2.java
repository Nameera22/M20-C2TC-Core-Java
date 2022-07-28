// Using Java Generics converts run time exceptions into 
// compile time exception.
package com.tns.core;

import java.util.ArrayList;

public class ArrayListdemo2<T> {

	public static void main(String[] args) {
	ArrayList<String> s=new ArrayList<String>();
	s.add("Nameera");
	s.add("Simran");
	s.add(45); // Now Compiler doesn't allow this

	String employee=(String)s.get(0);
	String employee1=(String)s.get(1);
	


	}

}
Footer
© 2022 GitHub, Inc.