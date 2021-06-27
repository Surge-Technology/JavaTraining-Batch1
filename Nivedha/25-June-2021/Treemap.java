import java.util.Comparator;
import java.util.TreeMap;
 
class Employee{    
    private String name;
    private int id;
 
    public Employee(int id, String name){
    	this.id = id;
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    public int getId() {
	return id;
    }
    public void setId(int id) {
	this.id = id;
    }
    public String toString(){
        return " Id: " + this.id + " Name: " + this.name;
    }
}
 
class Emp1 implements Comparator<Employee>{	 
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getId() > e2.getId()){
            return 1;
        } if(e1.getId() < e2.getId()){
            return -1;
        } else {
            return 0;
        }
    }
}
class Emp2 implements Comparator<Employee>{	 
    @Override
    public int compare(Employee e1, Employee e2) {
    	return e1.getName().compareTo(e2.getName());
}
}
public class Treemap {
	public static void main(String args[]){
		TreeMap<Employee, Integer> treeMap1 = new TreeMap<Employee, Integer>(new Emp1());
		System.out.println("Sorted by Id");
		treeMap1.put(new Employee(5,"rahul"), 2);
		treeMap1.put(new Employee(4,"vimala"), 3);
		treeMap1.put(new Employee(8,"shalu"), 1);
		treeMap1.put(new Employee(1,"hina"),9);
		System.out.println(treeMap1);
		
		TreeMap<Employee, Integer> treeMap2 = new TreeMap<Employee, Integer>(new Emp2());
		System.out.println("Sorted by Name");
		treeMap2.put(new Employee(1,"raj"), 4);
		treeMap2.put(new Employee(21,"vina"), 7);
		treeMap2.put(new Employee(13,"bala"), 1);
		treeMap2.put(new Employee(4,"anu"),3);
		System.out.println(treeMap2);
	}
}
