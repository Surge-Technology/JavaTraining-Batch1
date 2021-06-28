package com.schwall;



import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Madan");
		obj.add("yuvarajan");
		obj.add("pooja");
		obj.add("Madankumar");
		
		
		
		
		Iterator<String> it = obj.iterator();
		while(it.hasNext()) {
			String itr = it.next();
			if(itr.length()<=6) {
				System.out.println(itr);
			}
		}
	}

}