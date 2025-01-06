package com.javaconcepts.stringsession;

public class MyCoding {
	public static void main(String[] args) {
		
		String str="This is Sasi, from Morning 7am batch";
		
		String exp_student="Sasi";
		
		boolean condition=str.contains(exp_student);
		
		System.out.println("Expected avilable ::"+condition);
		
		// Other example
		
		String str1="This is Mallampeta, and this a butifull village";
		
		String exp_village="Mallampeta";
		
		System.out.println("Mallampeta is butifull village ::"+str1.contains(exp_village));
		
		
		
	}

}
