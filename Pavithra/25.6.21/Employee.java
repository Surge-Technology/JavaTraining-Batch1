package cc;

import java.util.Comparator;

public class Employee  {
	 String name;
     int id;
     
    public Employee(String n, int s){
        this.name = n;
        this.id = s;
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
    public void setId(int Id) {
        this.id = id;
    }
    public String toString(){
        return "Name: "+this.name+"-- id: "+this.id;
    }

	
	
	

	
}

