package task;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {

		ArrayList obj=new ArrayList();
		obj.add("hello1");
		obj.add("karthi");
		obj.add("yuva");
		obj.add("Prem");
		obj.add("Yudhistra");
		obj.add("suriya");
		
		
		Iterator itr=obj.iterator();
		while(itr.hasNext()) {
			
			Object str=itr.next();

			if(((String) str).length()==6)
			System.out.println(str);
			}
		}
	}


