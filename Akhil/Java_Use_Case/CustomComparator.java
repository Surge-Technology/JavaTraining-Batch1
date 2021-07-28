package com.telecom.billing;

import java.util.Comparator;

public class CustomComparator implements Comparator<PhoneDetails> {

	@Override
	public int compare(PhoneDetails o1, PhoneDetails o2) {
		
		return o2.getFlag().compareTo(o1.getFlag());
				}

}
