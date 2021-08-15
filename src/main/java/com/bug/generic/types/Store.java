package com.bug.generic.types;

public class Store<T> {

	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	public Store() {
		super();
	}

	public Store(T item) {
		super();
		this.item = item;
	}

	@Override
	public String toString() {
		return "Store [item=" + item + "]";
	}
	
	
}
