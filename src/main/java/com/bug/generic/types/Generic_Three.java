package com.bug.generic.types;

import com.bug.generic.methods.GenericMethod;
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
	}

}
