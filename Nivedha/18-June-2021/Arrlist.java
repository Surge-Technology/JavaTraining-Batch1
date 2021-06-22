package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrlist {

	public static void main(String[] args) {
		ArrayList<String> arr_name = new ArrayList<String>();
		arr_name.add("arjun");
		arr_name.add("raja");
		arr_name.add("ramu");
		arr_name.add("riya");
		arr_name.add("madhu");
		arr_name.add(5,"farida");
		
		Iterator<String> it = arr_name.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
				if(str.length()==4) {  
					System.out.println(str);
				}
			}
		}

}

	
	
