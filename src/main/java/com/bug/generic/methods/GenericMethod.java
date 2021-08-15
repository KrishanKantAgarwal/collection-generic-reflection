package com.bug.generic.methods;

import java.util.Arrays;

import com.bug.generic.model.Hashtable;

public class GenericMethod {

	public <T> void showItem(T item) {
		System.out.println(item.toString());
	}
	
	public <T> T showItem_ReturnItem(T item) {
		return item;
	}
	
	public <T, V> void showItem_WithTwoGenericType(T t, V v) {
		System.out.println(t.toString());
		System.out.println(v.toString());
	}
	
	public <T, V> Hashtable<T, V> showItem_ReturnWithTwoGenericType(T t, V v) {
		Hashtable<T, V> hashtable = new Hashtable<T, V>(t, v);
		return hashtable;
	}
	
	public <T> void showItems_UsingArray(T[] items) {
		for (T t : items) {
			System.out.println(t);
		}
	}

	public <T> void showItems_UsingArrayToPrintSortedArray(T[] items) {
		Arrays.stream(items).sorted().forEach(System.out::println);
	}
}
