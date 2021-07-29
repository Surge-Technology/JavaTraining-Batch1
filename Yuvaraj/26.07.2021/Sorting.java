package com.phonebill;


import java.util.Comparator;

public class Sorting implements Comparator<PhoneNumber>{

	@Override
	public int compare(PhoneNumber obj, PhoneNumber obj1) {
		// TODO Auto-generated method stub
		
		
		return obj1.getFlag().compareTo(obj.getFlag());
	}

	

}
