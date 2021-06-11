import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Hash_Map {
	int id;
	String name;
	String Address;
	String Location;
	int choose;
	
	static ArrayList<Hash_Map> list = new ArrayList<Hash_Map>();
	Iterator<Hash_Map> itr =list.iterator();
	
	

	public static void main(String[] args) {
		
		Hash_Map map = new Hash_Map();
		map.Studentdetails();
	}


	private void Studentdetails() {
		list= new ArrayList<Hash_Map>();
	
		while(true)
		{
			//Students_Dt s2 =new Students_Dt();
			Scanner scan= new Scanner(System.in);
		
			
			System.out.println("Choices Area");
			System.out.println("1.Adding_St_Dt ");
			System.out.println("2.Remove_st_id");
			System.out.println("3.Display_st_details");
			System.out.println("Enter your Choice");
			choose=scan.nextInt();
			
			switch(choose)
			{
			
			case 1:
			Hash_Map s2 =new Hash_Map();
				
				System.out.println("enter the student id");
			     s2.id=scan.nextInt();
				System.out.println("Enter the Student name");
			      s2.name=scan.next();
				System.out.println("entr the student address");
				s2.Address=scan.next();
				System.out.println("entr the student location");
				s2.Location=scan.next();
				
				list.add(s2);
				System.out.println(list.add(s2));
				
				System.out.println("Adding Student Details");
				break;
			
			
			case 2:
				
				
				System.out.println("Enter the Id to remove");
				int romove =scan.nextInt();
				 int i=0;
				 boolean isremoved =false;
				 if(isremoved)
				 {
				   HashMap<Integer,String> Map1=new HashMap<Integer,String>();
				   while(Map1.entrySet() != null)
				   {
					   Map1.remove(list);
					   System.out.println("Removed");
						break;
				   }}
				   else
				   {
					   System.out.println("student id not there");
						 break;
					   
				   }
				 
			case 3:
				
				/* HashMap<Integer,String> Map1=new HashMap<Integer,String>();
				for(Entry<Integer, String> entry : Map1.entrySet())
				{
					System.out.println(+entry.getKey());
					System.out.println("Value="+entry.getValue());
				
				}*/
				
				Iterator<Hash_Map> itr =list.iterator();
				 while(itr.hasNext())
				 {
				Hash_Map s3  = itr.next();
				   System.out.println(s3.id);
				   System.out.println(s3.name);
				   System.out.println(s3.Address);
				   System.out.println(s3.Location);
				 }
				   
					 
					
				
			
	}}

}}
