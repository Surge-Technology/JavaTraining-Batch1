import java.util.Set;
import java.util.TreeSet;
 
 
class Employee implements Comparable<Employee>{
    String name;

    public Employee(String name) {
        this.name = name;
      
    }
   
    @Override
    public int compareTo(Employee Employee1) {
       return this.name.compareTo(Employee1.name);
    }
 
    @Override
    public String toString() {
        return ("Emp:" + "name:" + name);
    }
}
public class TreeString {
 
    
	public static void main(String[] args){
 
        Employee emp1=new Employee("raja");
        Employee emp2=new Employee("anu");
        Employee emp3=new Employee("meera");
        Employee emp4=new Employee("vijay");
        Employee emp5=new Employee("anu");
 
        Set<Employee> treeSet = new TreeSet<Employee>();
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        treeSet.add(emp5);
 
        System.out.println("treeSet_ascendingorder : "+treeSet);
 
       
    }
}