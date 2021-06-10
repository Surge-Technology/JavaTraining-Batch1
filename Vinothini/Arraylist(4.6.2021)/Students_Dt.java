import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Students_Dt {
	
	int id;
	String Name;
	String Address;
	String location;
	int option;
	
	 ArrayList<Students_Dt> list= new ArrayList<Students_Dt>();
		Iterator<Students_Dt> itr =list.iterator();
			

	public static void main(String[] args) {
		
		Students_Dt s1=new Students_Dt();
		s1.StudentDetails();
		
	}
	public void StudentDetails() {
		list =new ArrayList<Students_Dt>();
		
		while(true)
		{
			//Students_Dt s2 =new Students_Dt();
			Scanner scan= new Scanner(System.in);
			/*System.out.println("enter the student id");
			scan.nextInt();
			System.out.println("Enter the Student name");
			scan.next();
			System.out.println("entr the student address");
			scan.next();
			System.out.println("entr the student location");
			scan.next();
			
			list.add(s2);*/
			
			System.out.println("Choices Area");
			System.out.println("1.Adding_St_Dt ");
			System.out.println("2.Remove_st_id");
			System.out.println("3.Display_st_details");
			System.out.println("Enter your Choice");
			option=scan.nextInt();
			
			switch(option)
			{
			
			case 1:
				Students_Dt s2 =new Students_Dt();
				
				System.out.println("enter the student id");
			     s2.id=scan.nextInt();
				System.out.println("Enter the Student name");
			      s2.Name=scan.next();
				System.out.println("entr the student address");
				s2.Address=scan.next();
				System.out.println("entr the student location");
				s2.location=scan.next();
				
				list.add(s2);
				System.out.println(list.add(s2));
				
				System.out.println("Adding Student Details");
				break;
				
			case 2:
				System.out.println("Enter the Id to remove");
				int romove =scan.nextInt();
				 int i=0;
				 boolean isremoved =false;
				
				if(list.size()!=0)
				{
					 Iterator<Students_Dt>itr=list.iterator();
					 while(itr.hasNext())
					 {
						 Students_Dt str =itr.next();
                         if(str.id==romove)
							 
						 {
							  isremoved = true;
						    break;
						 }
						 i++;
						
					 }
				 }
					 else
					 {
						 System.out.println("list is empty");
					 }
				 if(isremoved)
				 {
					 Iterator<Students_Dt>itr=list.iterator();
					 while(itr.hasNext())
					 {
						 itr.next();
						 itr.remove();
				       list.remove(i) ;
					System.out.println("Removed");
					break;
				 }}
				 else
				 {
					 System.out.println("student id not there");
					 break;
				 }
			case 3:
				 
				Iterator<Students_Dt> itr =list.iterator();
				 while(itr.hasNext())
				 {
				Students_Dt s3  = itr.next();
				   System.out.println(s3.id);
				   System.out.println(s3.Name);
				   System.out.println(s3.Address);
				   System.out.println(s3.location);
				 }
				   
				   
				
				}
			
				
			
			}
	}
	
			
		
}
	


