import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
public class Checkkey {
	static Scanner sc=new Scanner(System.in);
	
		 
		public static void main(String[] args) {
			HashMap<Integer,Studentkey>amap= new HashMap<Integer,Studentkey>();
		Checkkey obj=new Checkkey();
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
				
				amap=obj.addStud(amap);
				
				break;
			case 2:
				amap=obj.searchstud(amap);
				break;

			case 3:

				amap=obj.removestud(amap);
				break;

			case 4:
				obj.displayAll(amap);
				break;
			case 5:
				System.out.println("Thank you for your use");
				System.exit(0);
				break;
			default:
				System.out.println("You have entered invalid number");
			}
		}

	}

	private void displayAll(HashMap<Integer, Studentkey> amap) {
		for(Map.Entry<Integer, Studentkey>entry:amap.entrySet())
		{
			Studentkey str=entry.getValue();
			System.out.println(entry.getKey()+" "+ "student id:"+str.id+"name:"+str.name+"address:"+str.address);
		}
		
		
	}

	private HashMap<Integer, Studentkey> removestud(HashMap<Integer, Studentkey> amap) {

	
		
		System.out.println(" enter the key want to remove");
		int mkey=sc.nextInt();
		
		
		
		
		
		for(Map.Entry<Integer, Studentkey>entry:amap.entrySet())
		{
			Studentkey str=entry.getValue();
			
			if(entry.getKey()==mkey)
			{
				amap.remove(entry.getKey());
				System.out.println(entry.getValue()+" "+ "student id:"+str.id+"name:"+str.name+"address:"+str.address+" was deleted successfully");
			}
		}
		
		return amap;
	}

	private HashMap<Integer, Studentkey> searchstud(HashMap<Integer, Studentkey> amap) {

	
		
		System.out.println(" enter the key  to search");
		int skey=sc.nextInt();
		for(Map.Entry<Integer, Studentkey>entry:amap.entrySet())
			{
			Studentkey str=entry.getValue();
			
		
			if(entry.getKey()==skey)
			{
				System.out.println(entry.getValue()+" "+ "student id:"+str.id+"name:"+str.name+"address:"+str.address);
			}
			
		
			}
		
return amap;
	}

	private HashMap<Integer, Studentkey> addStud(HashMap<Integer, Studentkey> amap) {
		System.out.println(" enter the no of students want to enter");
		int num=sc.nextInt();
		Studentkey stud=new Studentkey();
		
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
		      
			amap.put(key,stud);
		
	}
		return amap;


	}

}
