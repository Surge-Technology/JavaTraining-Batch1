package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylength {

	public static void main(String[] args) {
	 ArrayList<String> names = new ArrayList<String>();

	 
	 names.add("Sarnya");
	 names.add("Vinothi");
	 names.add("Pavithe");
	 names.add("Selvi");
	 names.add("selva");
	 names.add("Sankar1");
	 names.add("preethi");
	
	 Iterator<String> fun= names.iterator();
	while(fun.hasNext())
	{
		String fun1 =(String) fun.next();
		if( fun1.length()==7)
		{
			System.out.println("length of array :" +fun1);
		}
	}

	}

}
