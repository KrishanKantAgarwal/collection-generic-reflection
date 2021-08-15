package com.bug.generic.bounded.types;

class Person implements Comparable<Person>{

	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public int compareTo(Person otherPerson) {
		return Integer.compare(age, otherPerson.age);
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}

public class GenericBoundType_One {

	//Bounded Type. It helps in using the method declared inside the extended class.
	//Here we are using compareTo() from Comparable interface
	public static <T extends Comparable<T>> T calculateMin(T num1, T num2){
		if(num1.compareTo(num2) < 0)
			return num1;
		
		return num2;
	}
	
	//Bounded Type. It helps in using the method declared inside the extended class.
	//Here we are using doubleValue() from Number abstract class
	public static <T extends Number> double addNumbers(T num1, T num2) {
		return num1.doubleValue() + num2.doubleValue();
	}
	
	public static void main(String[] args) {
		System.out.println(calculateMin(10, 40));
		System.out.println(calculateMin('a', 'b'));
		System.out.println(calculateMin("Krishan", "Kant"));
		
		//Using user defined class which extends comparable interface
		System.out.println(calculateMin(new Person(23, "Roy"), new Person(54, "Harsh")));
		
		//Adding two numbers
		System.out.println(addNumbers(63.00, 37));
	}

}


