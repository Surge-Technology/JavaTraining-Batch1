package Hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Studentdetails {
	static Scanner sc=new Scanner(System.in);
	
	 
	public static void main(String[] args) {
		Hashtable<Integer,Student>atable= new Hashtable<Integer,Student>();
		Studentdetails stud=new Studentdetails();
		while (true) {

			System.out.println("1,addstudent");
			System.out.println("2,search student");
			System.out.println("3,delete student");
			System.out.println("4,print all the studentdetails");
			System.out.println("5,exit");
			System.out.println(" Please enter the operation to perform");
			int ch = sc.nextInt();

			switch (ch) {
			
			case 1:
				
				atable=stud.addStud(atable);
				
				break;
			case 2:
				stud.searchstud(atable);
				break;

			case 3:

				atable=stud.removestud(atable);
				break;
			case 4:
				stud.updatestud(atable);
				break;

			case 5:
				stud.displayAll(atable);
				break;
			case 6:
				System.out.println("Thank you for your use");
				System.exit(0);
				break;
			default:
				System.out.println("You have entered invalid number");
			}
		}

	}
	private void updatestud(Hashtable<Integer, Student> atable) {
		System.out.println("\n Enter  key to update: ");
		int key1=sc.nextInt();
		for(Map.Entry<Integer,Student> eachvalue : atable.entrySet())
		{
			Student str= eachvalue.getValue();
			if (eachvalue.getKey() == key1) {
				Student student1 = new Student();
				System.out.println("Enter KEY:");
				int key2=sc.nextInt();
				System.out.println("Enter Student Id");
				int id1 =sc.nextInt();
				System.out.println("Enter Student name");
				String name2=sc.next();

				System.out.println("Enter Student address");
				String hr=sc.next();
				atable.replace(key1,student1);	
		
			}
		}
	}
	private void displayAll(Hashtable<Integer, Student> atable) {
		for (Map.Entry<Integer, Student> entry : atable.entrySet()) {
			Student str = entry.getValue();
			System.out.println(
					entry.getKey() + " " + "student id:" + str.id + "name:" + str.name + "address:" + str.address);
		}

	}
		

	private Hashtable<Integer, Student> removestud(Hashtable<Integer, Student> atable) {
		
		System.out.println(" enter the id want to remove");
		int id1=sc.nextInt();
		for(Map.Entry<Integer, Student>entry:atable.entrySet())
		{
			Student str=entry.getValue();
			if(entry.getKey()==id1)
			{
				atable.remove(entry.getKey());
				System.out.println(entry.getKey()+" "+ "student id:"+str.id+"name:"+str.name+"address:"+str.address+" was deleted successfully");
			}
		}
		
		return atable;
	}
	


	private void searchstud(Hashtable<Integer, Student> atable) {
		System.out.println(" enter the id want  to search");
		int id3=sc.nextInt();
		for(Map.Entry<Integer, Student>entry:atable.entrySet())
			{
			
			Student str=entry.getValue();
			if(str.id==id3)
			{
				System.out.println(entry.getKey()+" "+ "student id:"+str.id+"name:"+str.name+"address:"+str.address);
			}
			
		
			}
		
	}


	private Hashtable<Integer, Student> addStud(Hashtable<Integer, Student> atable) {
		System.out.println(" enter the no of students want to enter");
		int num=sc.nextInt();
		Student stud=new Student();
		
		for(int index=0;index<num;index++)
		{
			System.out.println("Enter KEY:");
		       int key=sc.nextInt();

			System.out.println("please enter"+(index+1)+"student id");
			int id=sc.nextInt();
			System.out.println("please enter"+(index+1)+"student name");
			String name=sc.next();
			
			System.out.println("please enter"+(index+1)+"student address");
			String add=sc.next();
		      
			atable.put(key,stud);
		
	}
		return atable;
	
	}
		
	}
