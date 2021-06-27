package cc;


import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
	TreeMap<Employee,Integer>tm=new TreeMap<Employee,Integer>(new Myname());
	tm.put(new Employee("pavi",241), 2);
	tm.put(new Employee("moni",963), 4);
	tm.put(new Employee("swetha",234), 5);
	tm.put(new Employee("sara",381), 7);
	tm.put(new Employee("hari",731), 8);
	
	for(Map.Entry<Employee, Integer>entry:tm.entrySet())
			{
		System.out.println("key is ("+entry.getKey()+ "),value is :"+ entry.getValue());
			}
	 System.out.println("===================================");
	//By using id comparator ( comparison)
	TreeMap<Employee,Integer>tm1=new TreeMap<Employee,Integer>(new Myid());
	tm1.put(new Employee("pavi",241), 2);
	tm1.put(new Employee("moni",963), 4);
	tm1.put(new Employee("swetha",234), 5);
	tm1.put(new Employee("sara",381), 7);
	tm1.put(new Employee("hari",731), 8);
	for(Map.Entry<Employee, Integer>entry:tm1.entrySet())
	{
		System.out.println("key is ("+entry.getKey()+ "),value is :"+ entry.getValue());
	}
	}

	
}

