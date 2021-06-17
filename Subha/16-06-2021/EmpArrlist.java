package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
class Employee {
    public int id;
    public int salary;
    public Employee(int id, Integer salary) {
        this.id = id;  
        this.salary = salary;
    }
 }
public class EmpArrlist {
	public static void main(String[] args) {
		Emp e=new Emp();
		ArrayList<Employee>empldet=e.empdetails();
		ArrayList<Employee>fillist=e.filteredlist(empldet);

		}
	}
class Emp{
	public ArrayList<Employee>empdetails(){
		ArrayList<Employee> emp = new ArrayList<Employee>();
		 emp.add(new Employee(100,14567));
	     emp.add(new Employee(101,9000));
	     emp.add(new Employee(102,14000));
	     emp.add(new Employee(103,5000));
	     return emp;
	}
	public ArrayList<Employee>filteredlist(ArrayList<Employee> emp ){
		ArrayList<Employee>filtlist=new ArrayList();
		for (Employee item : emp)
		    if (item.salary > 10000) {
		     System.out.println("Id:"+item.id);  
		    }
		return filtlist;
		}
	}
