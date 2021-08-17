package com.bug.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {

	
	public static double addAll(List<? extends Number> nums) {
		double sum = 0;
		for(Number num : nums) {
			sum += num.doubleValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		List<? extends Number> listValues = new ArrayList<>();
		
		/* 
		 * If we uncomment the below line
		 * Java will give compile time error because we can't add value to list having upper bounded wildcards
		 * Java will not able to identify the subtype of Number. 
		 * The subtype can be Integer, Double, Float.
		 */
		//listValues.add(1); 
		
		//Performing read operations on upper bounded wildcards
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Double> list2 = Arrays.asList(1.0,20.0,37.0,49.0);
		List<Float> list3 = Arrays.asList(10f,20f,39f,40f);
		List<? extends Number> list4 = Arrays.asList(1,2,3,4);
		
		System.out.println(addAll(list1));//Prints 10.0
		System.out.println(addAll(list2));//Prints 107.0
		System.out.println(addAll(list3));//Prints 109.0
		System.out.println(addAll(list4));//Prints 10.0
	}

}
