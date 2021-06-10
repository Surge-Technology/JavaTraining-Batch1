package util.pacakage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
	
	Scanner sc = new Scanner(System.in);
		
	 void add()
		{
		 HashMap<Integer , StudentSt> map = new HashMap<Integer, StudentSt>();
		System.out.println("\n Enter the number of student you have:");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++)
		{ 	
			System.out.println("Enter KEY:");
			int key=sc.nextInt();
			
			StudentSt student = new StudentSt();
			System.out.println("Enter Student Id");
			student.setId(sc.nextInt());

			System.out.println("Enter Student name");
			student.setName(sc.next());

			System.out.println("Enter Student DOB");
			student.setDob(sc.next());

			map.put(key, student);
		}
		
			
		while(true)
		{
			System.out.println("\n1.Insert"+"\n2.Search"+"\n3.Delete"+"\n4. print"+"\n5.Exit");
			System.out.println("\n Please select any one operation:");
			int option=sc.nextInt();
		
		
		
		switch(option)
		{
		case 1:
			
			StudentSt student = new StudentSt();
			System.out.println("Enter KEY:");
			int key=sc.nextInt();
			
			System.out.println("Enter Student Id");
			student.setId(sc.nextInt());

			System.out.println("Enter Student name");
			student.setName(sc.next());

			System.out.println("Enter Student DOB");
			student.setDob(sc.next());
			map.put(key , student);	
			break;
			
		case 2:
			System.out.println("\n Enter ID to search: ");
			int id=sc.nextInt();
			boolean isdetailsFound=false;
			if (map.size() != 0) {
//				for (Student obj : list) {
				for(Map.Entry<Integer,StudentSt> eachvalue : map.entrySet())
				{
				
					StudentSt str= eachvalue.getValue();
					if (str.id == id) {
						System.out.println(eachvalue.getKey()+""+"ID : "+str.id+" Name : "+str.name+" Mob No : "+str.dob);
						isdetailsFound = true;
					}
				
					} 
			}
				
				else {
				System.out.println("List is empty");
			}
		

		  break;
			
		case 3:
			
			System.out.println("\n Enter ID to delete: ");
			int id1=sc.nextInt();
			
			boolean isremoved=false;
			
			if (map.size() != 0) {
				for(Map.Entry<Integer,StudentSt> eachvalue : map.entrySet())
				{
					StudentSt str= eachvalue.getValue();
					if (str.id == id1) {
						map.remove(map.get(str));
						System.out.println("Removed");
						isremoved = true;
						break;
					}
					
				}
			} else {
				System.out.println("List is empty");
			}
			
			break;
	case 4:
		
			for(Map.Entry<Integer,StudentSt> eachvalue : map.entrySet())
			{
				StudentSt std= eachvalue.getValue();
				System.out.println(eachvalue.getKey()+""+std.id+""+std.name+""+std.dob);
			
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
	 




