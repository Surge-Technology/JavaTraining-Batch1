package Collection;

import java.util.*;

public class EmployeeDetails {
	 public static void main(String[] args) {
	TreeSet<Employee> ts=new<Employee>TreeSet(new EmployeeComparator());
	{
		ts.add(new Employee(1,"Saranya"));
		ts.add(new Employee(2,"Suresh"));
		ts.add(new Employee(3,"Pooja"));
		ts.add(new Employee(4,"Renuka"));
		System.out.println(ts);
		
	}

}
}