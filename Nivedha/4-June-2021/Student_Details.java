import java.util.*;
import java.util.ArrayList;
public class Student_Details {
	
	int id;
	String name;
	String city;
	Student_Details(){
	}
	
	public Student_Details(int id,String name,String city) {
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

	ArrayList<Student_Details> list=new ArrayList <Student_Details>();
	
	


	public static void main(String[] args) {
			
		Student_Details ob=new Student_Details();
		ob.insert();
		ob.search();
		ob.display();
		ob.remove();
		ob.exit();
		Scanner sc = new Scanner(System.in);
		ArrayList<Student_Details> list = new ArrayList<Student_Details>();
		System.out.println("Enter the no. of students:");
		int n= sc.nextInt();
		    
		while(true) {
				System.out.println(" Please Select Anyone Operation:");
				System.out.println(" Insert Student: 1 ");
				System.out.println(" Search Student: 2 ");
				System.out.println(" Delete Student: 3 ");
				System.out.println(" Print All Student Details: 4 ");
				System.out.println(" Exit : 5 ");
				int ch=sc.nextInt();
		    
		    
		switch (ch) {

		case 1:
			Student_Details.insert();
			break;

		case 2:
			Student_Details.search();
			break;

		case 3:
			Student_Details.remove();
			break;

		case 4:
			Student_Details.display();
			break;
				          
		case 5:
			System.out.println("Exit...");
			System.exit(0);
			break;
				    
		default:
			System.out.println("Invalid Number...");


		}
				    
		    
		    
	void insert() 
	{
		    
		    for(int i=1;i<n;i++) {
		    	Student_Details std=new Student_Details();
		    	System.out.println("enter a id:");
		    	std.setid(sc.nextInt());
		    	System.out.println("enter a name:");
		    	std.setname(sc.nextInt());
		    	System.out.println("enter a city:");
		    	std.setcity(sc.next());
		    	list.add(std);
		    	}
	}
		   
	void search() {
		    ArrayList <Student_Details> list = new ArrayList<Student_Details>();
		    System.out.println("Enter a number to search:");
		    int num=sc.nextInt();
		    boolean isdata=false;
		    if(list.size()==0) {
		    	Iterator<Student_Details> itt=list.iterator();
		    	while(itt.hasNext()) {
		    		Student_Details sd =itt.next();
		    		if(sd==id) {
		    			System.out.println("Id:"+sd.id);
		    			System.out.println("Name:"+sd.name);
		    			System.out.println("City:"+sd.city);
		    			isdata=true;
		    		}
		    	}
		    }
		    else {
		    	System.out.println("No data in the list");
		    }
		    	
	}
		            
	void remove() {
		    System.out.println("Enter a number to remove:");
		    int number=sc.nextInt();
		    boolean isdata=false;
		    if(list.size()!=0) {
		    	Iterator<Student_Details> itt=list.iterator();
		    	while(itt.hasNext()) {
		    		Student_Details sd =itt.next();
		    		if(sd.id==number) {
		    			isdata=true;
		    			
		    		}
		    		i++;
		    	 }
			    else {
			    	System.out.println("No data in the list");
		    
		    		}
			    if(isremoved) {
			    	list.remove(i);
			    	System.out.println("the data is removed:");
			    }
			    else { 
			    	System.out.println("data is not found:");
			    	
			    }
		    	}
		   
		    }
		   
		     
	void display() {
		    for(Student_Details a:list){
		    System.out.println("list of students details:"+a);
		    		} 
	}
		    	 
	void exit() {
		    System.out.println("Exit..");
		    System.exit(0);
		}
	
	
		
		}
		     
 }

}








