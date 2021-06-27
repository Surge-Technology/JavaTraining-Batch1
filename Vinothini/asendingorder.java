package Treesetdemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class asendingorder {

	public static void main(String[] args) {
		
		
		Map<Employe ,Integer> obj1 = new TreeMap<Employe,Integer>(new Myname());
		obj1.put(new Employe("Padma",101),2 );
		obj1.put(new Employe("thran",109), 5);
		obj1.put(new Employe("Santhuyz",105), 8);
		obj1.put(new Employe("Viralimalai",107), 9);
		obj1.put(new Employe("vinothini5",108), 6);
		obj1.put(new Employe("Trichy",103), 1);
		
	
		
       Iterator<Entry<Employe ,Integer>> itr = obj1.entrySet().iterator();
       while(itr.hasNext())
       {
    	   Entry<Employe ,Integer> name= itr.next();
   	   System.out.println("Keyavlue:  "+name.getKey()+name.getValue());
//    	   System.out.println("print"+name.getKey());
    	  
    	 }
		
//		for(Entry<Employe, Integer> person:obj1.entrySet())
//		{
//			System.out.println("name :  "+obj1.get(person));
//		}
	}

	
	}



