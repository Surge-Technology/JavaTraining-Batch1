
package Collection;

import java.util.*;

public class EmployeeMap {
	 public static void main(String[] args) {
	TreeMap<Employee,String> tm=new<Employee,String>TreeMap(new EmployeeComparator());
	{
		tm.put(new Employee(1,"Saranya"),"Saranya");
		tm.put(new Employee(2,"Suresh"),"Suresh");
		tm.put(new Employee(3,"Pooja"),"Pooja");
		tm.put(new Employee(4,"Renuka"),"Renuka");
		System.out.println(tm);
		
	}

}
}
