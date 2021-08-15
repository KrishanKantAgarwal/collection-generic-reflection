package com.bug.type.inference;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExample {

	public static <T> List<T> add(List<T> list, T t1, T t2){
		list.add(t1);
		list.add(t2);
		return list;
	}
	
	//Performing type inference.
	//The java will know that the add method Generic type will be String 
	//because we are performing operation on String
	public static void main(String[] args) {
		List<String> list_string = add(new ArrayList<>(), "I am", "Type Inference");
		System.out.println(list_string);
		
		/**
		 * The below code will give compile time error because, we are adding String value to Integer list
		 */
		//List<Integer> list_integer = add(new ArrayList<>(), "I am", "Type Inference");
		
		//This will work!!
		List<Integer> list_integer = add(new ArrayList<>(), 30, 78);
		System.out.println(list_integer);
		
	}

}
