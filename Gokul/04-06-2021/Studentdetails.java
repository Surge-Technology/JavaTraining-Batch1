package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
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
		Student student = new Student();
		System.out.println("Enter Student Id");
		student.setId(sc.nextInt());

		System.out.println("Enter Student name");
		student.setName(sc.next());

		System.out.println("Enter Student DOB");
		student.setDob(sc.next());

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
		Student student = new Student();
		
		System.out.println("Enter Student Id");
		student.setId(sc.nextInt());

		System.out.println("Enter Student name");
		student.setName(sc.next());

		System.out.println("Enter Student DOB");
		student.setDob(sc.next());
		list.add(student);	
		break;
		
	case 2:
		System.out.println("\n Enter ID to search: ");
		int id=sc.nextInt();
		boolean isdetailsFound=false;
		if (list.size() != 0) {
//			for (Student obj : list) {
			Iterator<Student> itr = list.iterator();
			while(itr.hasNext()) {
				Student str= itr.next();
				if (str.id == id) {
					System.out.println("ID : "+str.id+" Name : "+str.name+" Mob No : "+str.dob);
					isdetailsFound = true;
				}
			}
			
		} else {
			System.out.println("List is empty");
		}
	

	  break;
		
	case 3:
		
		System.out.println("\n Enter ID to delete: ");
		int id1=sc.nextInt();
		
		boolean isremoved=false;
		int i=0;
		if (list.size() != 0) {
			Iterator <Student> itr = list.iterator();
			while(itr.hasNext()) {
				Student str= itr.next();
				if (str.id == id1) {
					isremoved = true;
					break;
				}
				i++;
			}
		} else {
			System.out.println("List is empty");
		}
		if (isremoved) {
			list.remove(i);
			System.out.println("Removed");
		}else
			System.out.println("Student ID not found");
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
 



