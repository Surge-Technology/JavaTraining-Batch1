import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Hashtable_ex {
	
	int id;
	String name;
	String location;
	String Address;
	static int option;
	
	static ArrayList<Hashtable_ex> list = new ArrayList<Hashtable_ex>();
	
	 static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Hashtable_ex table = new Hashtable_ex();
		table.function();
	}
	
	public void function()
	{
		ArrayList<Hashtable_ex> list = new ArrayList<Hashtable_ex>();
		
	
		while(true)
		{
		System.out.println("Choices Area");
		System.out.println("1.Adding_St_Dt ");
		System.out.println("2.Remove_st_id");
		System.out.println("3.Display_st_details");
		System.out.println("Enter your Choice");
		option=scan.nextInt();
		
		Hashtable_ex table = new Hashtable_ex();
		switch(option)
		{
		case 1:
		
			System.out.println("Enter the student id");
		table.id=scan.nextInt();
			System.out.println("enter the Student Address");
		table.Address=	scan.next();
			System.out.println("Enter the student name");
			table.name=scan.next();
			
			list.add(table);
			
			System.out.println(list.add(table));
			System.out.println("Sucessfully adding student details");
			break;
			
		case 2:
		
			Iterator<Hashtable_ex> names=  list.iterator();
			while(names.hasNext())
			{
			Hashtable_ex s2=names.next();
			System.out.println(s2.id);
			System.out.println(s2.name);
			System.out.println(s2.Address);
			break;
			}
			
		case 3:
			
		/*System.out.println("enter the size of array");
		int size=scan.nextInt();
		System.out.println(Arrays(list));*/
			list.add("900");
			System.out.println(list);
			
		
		
		
		
		}
		}
}
		
		
		

	
}
	
	

