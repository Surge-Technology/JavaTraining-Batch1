package Collection;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		
	
		return e1.getname().compareTo(e2.getname());
	}

}
