package com.javaconcepts.methodssession;

public class MyTest1 {
	
	public void addition() {
		
		int a=2000;
		int b=4000;
		int c=a+b;
		System.out.println("Addition of two numbers is ::"+c);
	}
		public void subtraction() {
			
			int a=5000;
			int b=6000;
			int c=a-b;
			System.out.println("Subtraction of two numbers is ::"+c);
		
		}
	// Above two methods of instance methods
		
		public static void main(String[] args) {    
			
			MyTest1 test1=new MyTest1();
			
		    test1.addition();
		    test1.subtraction();
		    
			
		}
		
		
	}

