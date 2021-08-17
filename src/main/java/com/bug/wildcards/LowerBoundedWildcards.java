package com.bug.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {

	public static void addAndShowAll(List<? super Integer> nums) {
		nums.add(100);
		nums.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		list.add(92.0);
		list.add(1);
		list.add(2.0);
		list.add(2.10f);
		addAndShowAll(list); //Prints 92.0, 1, 2.0, 2.10, 100
	}

}
