package Hashtable.Package;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class StudentHashTable1 {
	
	Scanner sc = new Scanner(System.in);
			
		 public void add1()
			{
			 Hashtable<Integer, StudentHashtable> map = new Hashtable<>();
			System.out.println("\n Enter the number of student you have:");
			int n= sc.nextInt();
			
			for(int i=0;i<n;i++)
			{ 	
				System.out.println("Enter KEY:");
				int key=sc.nextInt();
				
				StudentHashtable student = new StudentHashtable();
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
				System.out.println("\n1.Insert"+"\n2.Search"+"\n3.Delete"+"\n4.Update"+"\n5. print"+"\n6.Exit");
				System.out.println("\n Please select any one operation:");
				int option=sc.nextInt();
			
			
			
			switch(option)
			{
			case 1:
				
				StudentHashtable student = new StudentHashtable();
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
//					for (Student obj : list) {
					for(Map.Entry<Integer,StudentHashtable> eachvalue : map.entrySet())
					{
					
						StudentHashtable str= eachvalue.getValue();
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
					for(Map.Entry<Integer,StudentHashtable> eachvalue : map.entrySet())
					{
						StudentHashtable str= eachvalue.getValue();
						if (eachvalue.getKey() == id1) {
							map.remove(eachvalue.getKey());
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
				System.out.println("\n Enter  key to update: ");
				int key1=sc.nextInt();
				
				
				
				if (map.size() != 0) {
					for(Map.Entry<Integer,StudentHashtable> eachvalue : map.entrySet())
					{
						StudentHashtable str= eachvalue.getValue();
						if (eachvalue.getKey() == key1) {
							StudentHashtable student1 = new StudentHashtable();
							System.out.println("Enter KEY:");
							int key2=sc.nextInt();
							
							System.out.println("Enter Student Id");
							student1.setId(sc.nextInt());

							System.out.println("Enter Student name");
							student1.setName(sc.next());

							System.out.println("Enter Student DOB");
							student1.setDob(sc.next());
							map.replace(key1,student1);	
						}
						
					}
				}
				
				break;
				
		case 5:
			
				for(Map.Entry<Integer,StudentHashtable> eachvalue : map.entrySet())
				{
					StudentHashtable std= eachvalue.getValue();
					System.out.println(eachvalue.getKey()+""+std.id+""+std.name+""+std.dob);
				
				}
				break;
				
			case 6:
				System.out.println("Thank you");
				System.exit(0);
				break;
			default :
				System.out.println("You have entered invalid number");

			} 

			  
			}
			
			
			}
			
			


		}
		 


	


