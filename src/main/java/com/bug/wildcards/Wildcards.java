package com.bug.wildcards;

import java.util.Arrays;
import java.util.List;

public class Wildcards {

	/* The Integer and Object has inheritance relationship */
	public static void showItem(Object obj) {
		System.out.println(obj.toString());
	}
	
	/** 
	 * The List<String> or List<Integer> is not a sub-type of List<Object> 
	 * Even though String and Integer both are the sub-type of Object class.
	 * 
	 * To overcome this issue, we have to change the List<Object> to List<?>
	 * 
	 * <br>
	 * 
	 * <b>OLD CODE:</b>
	 * <code>public static void print(List<Object> obj)</code>
	 * 
	 * <pre>This gives compile time error and the error was:
	 * The method print(List<Object>) in the type Wildcards is 
	 * not applicable for the arguments (List<String>)</pre>
	 * 
	 * @param obj is List of String, Integer, User Defined Class or any valid class
	 * */
	public static void print(List<?> obj) {
		for(Object o : obj) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		Integer num = 10;
		showItem(num); //Prints 10
		
		List<String> listOfString = Arrays.asList("I", "am", "using", "wildcard");
		print(listOfString);// Prints I, am, using, wildcards
		
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5);
		print(listOfInteger); //Prints 1,2,3,4,5
	}
	
	
}
