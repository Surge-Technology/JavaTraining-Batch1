package Collection_Framework;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
ArrayList<String> obj1 = new ArrayList<String>();
		
		obj1.add("english");
		obj1.add("selva");
		obj1.add(1,"padma");
		obj1.add("raja");
		obj1.add(3, "rose");
		String SearchEle="raja";
		
		for(int i=0;i<obj1.size();i++)
		{
			//System.out.println(obj1.get(i));
			if(SearchEle==obj1.get(i))
			{
				System.out.println("Element is found:"+SearchEle);
				break;
			}
		}

	}

}
