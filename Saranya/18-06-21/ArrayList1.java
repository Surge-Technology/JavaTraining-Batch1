
package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

public static void main(String ar[]) {
	
ArrayList name=new ArrayList();

name.add("saranya");
		
name.add("pooja");
	
name.add("renuka");

name.add("suresh");

name.add("lavanya");

name.add("pavithra");

name.add("lovely");

name.add("ruby");

name.add("sneha");
		

Iterator itr = name.iterator();
{
	
	while(itr.hasNext())
	{
		String str=(String) itr.next();
		
		if(str.length()==6)
			
		{
			System.out.println(str);
		}
	}
}
}
}



