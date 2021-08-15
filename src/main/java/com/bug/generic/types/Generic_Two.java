package com.bug.generic.types;

import com.bug.generic.model.Hashtable;

public class Generic_Two {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> table = new Hashtable<String, Integer>("Two Generic Type", 23);
		System.out.println(table);
	}

}
