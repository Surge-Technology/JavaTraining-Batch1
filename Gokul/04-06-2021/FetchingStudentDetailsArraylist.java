import java.util.ArrayList;
import java.util.Scanner;

public class FetchingStudentDetailsArraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list =  new ArrayList<Student>();
		System.out.println("\n Enter the number of student you have:");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++)
		{ 	
			Student student = new Student(sc.nextInt(),sc.next(),sc.next());
			list.add(student);	
		}
		
		while(true)
		{
			System.out.println("\n1.Insert"+"\n2.Search"+"\n3.Delete"+"\n4. print"+"\n5.Exit");
			System.out.println("\n Please select any one operation:");
			int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			Student student = new Student(sc.nextInt(),sc.next(),sc.next());
			list.add(student);	
			break;
			
		case 2:
			System.out.println("\n Enter index to search: ");
			int index=sc.nextInt();
			
			 for (int i = 0; i < list.size(); i++) {
				  if(i==index)
				  {
		            System.out.print(list.get(i) + " ");
				  }
				  
		        }
		  break;
			
		case 3:
			System.out.println("\n Enter index to delete: ");
			int index1=sc.nextInt();
			for (int i = 0; i < list.size(); i++) {
				  if(i==index1)
				  {

					  list.remove(i);
				  }
				  
		        }
		  break;
		
		case 4:
			
			for(Student st : list)
				{
					System.out.println("list"+st);
				}
			break;
			
		case 5:
			System.exit(0);
			break;
		default :
			System.out.println("You have entered invalid number");
		}
		
		}
		
	}

}


public class Student {

	private int id;
	private String name;
	private String dob;
	
	
	
	
	Student()
	{
		
	}
	
	Student(int id,String name, String dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}

}


