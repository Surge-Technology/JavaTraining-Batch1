package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentdetails {
	
	
	Scanner sc = new Scanner(System.in);
	
 void add()
	{
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
		System.out.println("Thank you");
		System.exit(0);
		break;
	default :
		System.out.println("You have entered invalid number");
	}
	
	}

}
 
}

