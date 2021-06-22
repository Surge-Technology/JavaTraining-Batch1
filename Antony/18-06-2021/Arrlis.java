package package1;

import java.util.ArrayList;
import java.util.Iterator;


public class Arrlis {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("anto");
		arr.add("antony");
		arr.add("lydia");
		arr.add("bala");
		
		
		
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			String itr = it.next();
			if(itr.length()<=4) {
				System.out.println(itr);
			}
		}
	}

}