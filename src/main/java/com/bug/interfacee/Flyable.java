package com.bug.interfacee;

public abstract interface Flyable {

	void flyable();
	
	default void addFuel() {
		System.out.println("Fuel is added");
	}
}
