package com.javaconcepts.stringsession;

public class MyTester {
	
	public static void main(String[] args) {
		
		String stnd1="Sasi";
		String stnd2="Sasi";
		
		String loc="Pavan";
		String loc1="PAVAN";
		
	    boolean studentcompare=stnd1.equals(stnd2);
	    System.out.println(studentcompare);
		
		System.out.println("compare two Names ::"+stnd1.equals(stnd2)); // if both are equal returntrue,elase fale
	
	   String country ="India";
	   String country1 ="INdIa";
	   
	   boolean condition=country.equalsIgnoreCase(country1);
	   
	   System.out.println("In this two countries same or not::"+condition);
	   
	   String ss ="ShoPingMall";
	   System.out.println(ss.toUpperCase());
	   String output=ss.toUpperCase();
	   System.out.println(output);
	   
	   String foutput=output.toLowerCase();
	   System.out.println(foutput);
	   
	   String name="Venkateswarlu";
		// I want to get number of characters in a given string.
		int countofcharacter=name.length();
	   
	   System.out.println(countofcharacter);
	   
	   System.out.println(name.length());
	   
	   
	   
	}

}
