package com.bug.interfacee;

public interface FlyableNew {

	void flyable();
	
	default void addFuel() {
		System.out.println("Fuel is added");
	}
}
