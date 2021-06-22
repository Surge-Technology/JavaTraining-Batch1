package collection;

import java.util.ArrayList;

public class Length {

	public static void main(String[] args) {
		String[] obj1= {"vni","selva","vinothi","okokoko","saranya","pavinth","preethi"};
		
		longeststring(obj1);
		
	}
	private static String longeststring(String[] obj1) {
		
		String longeststring=obj1[3];
		for(int i =0;i<obj1.length;i++)
		{
			if(obj1[i].length()>=longeststring.length())
			{
				longeststring=obj1[i];
				
				System.out.println("logest string:  "+longeststring);
				
			}
			
		}
		
  	return longeststring;
		
		
		
	}
		
	}

	

