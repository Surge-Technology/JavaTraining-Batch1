package arraylist1;

import java.util.*;

public class ArrayListExample {
	
	public static void main(String[] args)
	{
		
		
		ArrayList<String> a1 = new ArrayList();
		a1.add("gokul");
		a1.add("balaji");
		a1.add("ravi");
		a1.add("ragu");
		a1.add("rama");
		a1.add("niki");
		
		Iterator itr = a1.iterator();
		{
			
			while(itr.hasNext())
			{
				String i=(String) itr.next();
				if(i.length()==4)
				{
					System.out.println(i);
				}
			}
		}
	}
}
