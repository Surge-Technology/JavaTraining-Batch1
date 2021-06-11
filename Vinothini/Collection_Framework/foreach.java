package Collection_Framework;

import java.util.ArrayList;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> obj1 = new ArrayList<String>();
		
		obj1.add("english");
		obj1.add("tamil");
		obj1.add(1,"padma");
		obj1.add("raja");
		obj1.add(3, "rose");
		
	for(String s :obj1)
	{
	System.out.print(s);
	
	
	}

	}

}
