<<<<<<< HEAD
package cc;

import java.util.Comparator;

public class Myid implements Comparator <Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId() >o2.getId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

}

=======
package cc;

import java.util.Comparator;

public class Myid implements Comparator <Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId() >o2.getId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

}

>>>>>>> 0529773a33f94402ae006e6a2c6bcbe551a37bfa
