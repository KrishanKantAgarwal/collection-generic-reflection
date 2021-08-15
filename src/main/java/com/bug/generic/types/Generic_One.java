package com.bug.generic.types;

import com.bug.generic.model.Store;

public class Generic_One {

	public static void main(String[] args) {
		
		Store<Double> store = new Store<>();
		store.setItem(100.00);
		Double item = store.getItem();
		System.out.println(item);
	}

}
