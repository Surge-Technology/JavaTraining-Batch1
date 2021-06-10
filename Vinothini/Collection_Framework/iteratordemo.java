package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> obj1 = new ArrayList<String>();
		
		obj1.add("vinothini");
		obj1.add("selva");
		obj1.add(1,"padma");
		obj1.add("raja");
		obj1.add(3, "rose");
		Iterator i = obj1.iterator();
		
          while(i.hasNext())
          {
        	 
            System.out.println(i.next());
           
      
             
           
           
        	
          }
          
          System.out.println(obj1);
	}

}
