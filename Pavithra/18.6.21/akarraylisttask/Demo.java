package akarraylisttask;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		 String str = "pavithra";  
		 String str1 = "Java";
		 String str2 = "saranyaa"; 
		 String str3 = "vino"; 
		 String str4 = "gayuu"; 
		 String str5 = "suba"; 
		 String str6 = "riya"; 
		 String str7 = "nidhi"; 
		 
		 list.add(str);
		 list.add(str1);
		 list.add(str2);
		 list.add(str3);
		 list.add(str4);
		 list.add(str5);
		 list.add(str6);
		 list.add(str7);
		 Iterator<String> itr=list.iterator();
		 while(itr.hasNext())
		 {
	String sam=(String) itr.next();
		 if(sam.length()==4)
		 {
			 System.out.println("length :"+sam);
		 }
		 
		 
}
	}
}
