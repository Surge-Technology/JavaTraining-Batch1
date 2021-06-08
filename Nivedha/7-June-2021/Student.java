import java.util.HashMap;
import java.util.Map;

import java.util.*;
public class Student1 {
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	String city;
	Student(){
	}
	
	public Student(int id,String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public int getId() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
		public String getCity() {
			return city;
		}
		public void setcity(String city) {
			this.city=city;
		
	}
class Student_Details{
	

void Details()
{
	HashMap<Integer,Student> map=new HashMap<Integer,Student>();
	System.out.println("Enter the no.of students:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		Student std =new Student();
		System.out.println("enter a key:");
		int k=sc.nextInt();
		
		System.out.println("enter a id:");
    	std.setid(sc.nextInt());
    	System.out.println("enter a name:");
    	std.setName(sc.next());
    	System.out.println("enter a city:");
    	std.setcity(sc.next());
    	map.put(k,std);
	}
	while(true) {
		System.out.println(" Please Select Anyone Operation:");
		System.out.println(" Insert Student: 1 ");
		System.out.println(" Search Student: 2 ");
		System.out.println(" Delete Student: 3 ");
		System.out.println(" Print All Student Details: 4 ");
		System.out.println(" Exit : 5 ");
		int ch=sc.nextInt();
		
	switch(ch) {
	case 1:
		Student std=new Student();
		System.out.println("enter a key:");
		int k=sc.nextInt();
		System.out.println("enter a id:");
    	std.setid(sc.nextInt());
    	System.out.println("enter a name:");
    	std.setName(sc.next());
    	System.out.println("enter a city:");
    	std.setcity(sc.next());
    	map.put(k,std);
    	break;
	case 2:
		 System.out.println("Enter a number to search:");
		 int num=sc.nextInt();
		 boolean isdata=false;
		 if(map.size()!=0) {
		    for(Map.Entry<Integer,Student> eachvalue:map.entryset())
		    {
		    	Student std =eachvalue.getValue();
		    	if(std.id==id) {
		    		System.out.println(eachvalue.getValue()+"Id:");
		    		System.out.println(eachvalue.getValue()+"Name:");
		    		System.out.println(eachvalue.getValue()+"City:");
		    		isdata=true;
		    		}
		    	}
		    }
		    else {
		    	System.out.println("No data");
		    }
		    	break;
		    	
	case 3:
		System.out.println("Enter a number to remove:");
	    int number=sc.nextInt();
	    boolean isdata=false;
	    if(map.size()!=0) {
	    	for(Map.Entry<Integer,Student> eachvalue:map.entryset())
	    	{
	    		Student std=eachvalue.getValue();
	    		if(std.id==number) {
	    			map.remove(map.get(std));
	    			System.out.println("data is removed:");
	    			isdata=true;
	    			break;
	    			
	    		}	
	    	  }
	    		
	    	 }
		    else {
		    	System.out.println("No data");
	    
	    		}
		    if(isdata) {
		    	map.remove(number);
		    	System.out.println("the data is removed:");
		    }
		    else { 
		    	System.out.println("data is not found:");
		    	
		 }break;
	case 4:
		for(Map.Entry<Integer,Student> eachvalue:map.entryset());{
			Student  s=eachvalue.getValue();
			System.out.println(eachvalue.getk()+ s.id);
			System.out.println(eachvalue.getk()+ s.name);
			System.out.println(eachvalue.getk()+ s.city);
		}
		break;
	case 5:
		System.out.println("Exit..");
	    System.exit(0);
	default:
		System.out.println("invalid number:");
		    
		    
	}
		
		
	}
		
		
}


	public static void main(String[] args) {
		Student student = new Student();
		student.Details();
	}
		

	}

}
