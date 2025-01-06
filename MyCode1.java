package com.javaconcepts.methodssession;

public class MyCode1 {
	
	  public int addition(int a, int b) {
		int c=a+b;
		return c;
		
		  }
	  public void addition1(int a, int b) {
		   int c=a+b;
		   System.out.println("Addition of two numbers"+c);
		   int d=a-b;
		   System.out.println("Subtraction of two numbers"+d);
		   
	  }
	  
	  public static void main(String[] args) {
		  MyCode1 test=new MyCode1();
		  
		  test.addition1(1000,2000);
		int result=test.addition(1000,20000);
		System.out.println(result);
		  
	  }

}
