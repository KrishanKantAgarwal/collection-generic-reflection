package com.bug.generic.methods;

public class GenericMethod {

	public <T> void showItem(T item) {
		System.out.println(item.toString());
	}
}
