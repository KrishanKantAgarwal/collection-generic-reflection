package com.bug.generic.model;

public class Hashtable<K,V> {

	private K key;
	private V value;
	
	public Hashtable(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Hashtable [key=" + key + ", value=" + value + "]";
	}
	
	
}
