package com.bug.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExercise {
	

	/**
	 * Method to copy a list to new list
	 * @param <? extends T> source has extends because we want to read the value from source
	 * @param <? super T> destination has super because we want to insert the value from source to destination
	 */
	public <T> void copy(List<? extends T> source, List<? super T> destination) {
		for(int i = 0; i < source.size(); i++) {
			destination.add(source.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		WildcardExercise exercise = new WildcardExercise();
		
		List<String> source = Arrays.asList("Ana", "Kevin", "Adam");
		List<String> destination = new ArrayList<>();
		exercise.copy(source, destination);
		System.out.println(destination);//Prints "Ana", "Kevin", "Adam"
		
		List<Integer> source2 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> destination2 = new ArrayList<>();
		exercise.copy(source2, destination2);
		System.out.println(destination2);//Prints 1,2,3,4,5,6,7
	}

}
