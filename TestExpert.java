package com.javaconcepts.stringsession;

public class TestExpert {
	
	public static void main(String[] args) {
		
		String ss="  AndhraPradesh  ";
		
		// I want to count no of characters in String
		
		 System.out.println(ss.length());
		 
		 // Note:Hear above length method considaring space before and after string.
		 
		 int charcount=ss.trim().length();
		 
		 System.out.println(charcount);
		 
		 String name=" chanti ";
		 
		 System.out.println(name.length());
		 
		 System.out.println(name.trim().length());
		 
		 
		 
	}          
	
}