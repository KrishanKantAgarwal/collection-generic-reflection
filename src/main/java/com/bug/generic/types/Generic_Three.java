package com.bug.generic.types;

import com.bug.generic.methods.GenericMethod;
import com.bug.generic.model.Hashtable;
import com.bug.generic.model.Store;

public class Generic_Three {

	public static void main(String[] args) {
		
		GenericMethod method = new GenericMethod();
		
		method.showItem("Generic Method");//String
		method.showItem(100); //int
		method.showItem(100.00); //double
		method.showItem('G'); //char
		method.showItem(true); //boolean
		method.showItem(new Store<String>("From Store Class").toString()); //User defined Class
		
		//Returning value from Generic Method
		String returnedItem = method.showItem_ReturnItem("Returning value from Generic Method");
		System.out.println(returnedItem);
		
		//Using two Generic Types
		method.showItem_WithTwoGenericType("I am one, and you are ..", 2);
		
		//Returning value from Generic Method having two types
		Hashtable<String, Integer> table = method.showItem_ReturnWithTwoGenericType("Using HashTable for returning generic types" , 2);
		System.out.println(table);
		
		//Using Array in Generic Method
		method.showItems_UsingArray(new Integer[] {1,2,3,8,4});
		
		//Using Array in Generic Method and finding smaller number
		System.out.println("**************** SORTED ARRAY ******************");
		method.showItems_UsingArrayToPrintSortedArray(new Integer[] {91,5,69,2,14,5,6});
	}

}
