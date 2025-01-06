package com.javaconcepts.methodssession;

public class MyTest {
	
	String name="sasi"; // Instance Variable
	static boolean condition =true;
	
	//accessmodifer][returntype][methodname](){method body}

	public void addition() {
		int a=10; // local
		int b=30; // local
		int c=a+b;
		System.out.println(c);
		// this is instance method
	}
	public  static void subtraction() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		// This Is Static method
	}

	public static void main(String[] args) {
		System.out.println(condition);
		subtraction(); // this all are static variables and static methods
		
		MyTest test=new MyTest();
		test.addition();
		
		String fname=test.name;
		System.out.println(fname);
		System.out.println(test.name);// This all are instance variables and instance methods
		
	}

}
