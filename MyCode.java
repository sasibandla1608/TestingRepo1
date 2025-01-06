package com.javaconcepts.methodssession;

public class MyCode {
	
	public static String studentName(String name) {
		
		return name;
		
	} // return type concept
	
	public void studentName1(String name1) {
		
		System.out.println("addition of two numbers"+name1);
		
	} // method perameters type
	
	public void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	} // Normal Method
	
	public static void addition(int a, int b) {
		int c=a+b;
		System.out.println("Addition of two numbers"+c);
		
	} //method perameters concepts
	
	public static void main(String[] args) {
		
		String finalStudentName=studentName("Sai");
		
		System.out.println(finalStudentName);
		
		addition(200,300);
		
		MyCode code1=new MyCode();
	
		code1.studentName1("Sasi");
	}
}
