package com.bug.interfacee;

public class Aeroplane implements Flyable, FlyableNew{

	@Override
	public void addFuel() {
		Flyable.super.addFuel();
	}

	@Override
	public void flyable() {
		System.out.println("Aeroplane is flying");
	}

}
