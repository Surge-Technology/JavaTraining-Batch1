import java.util.Scanner;

public class Fetchingfromarray {
	
	
	public static void main(String[] args)
  
  {
		 Scanner sc = new Scanner(System.in);
		 
//		 int rollnumber[] = new int[5];
//		 String name[] = new String[5];
//		 long phno[] = new long[5];
				 
		 
//	  for(int i=0; i<5; i++)
//	  {
//		  System.out.println("\nEnter  roll number:");
//		  rollnumber[i] = sc.nextInt();
//		  System.out.println("\n Enter  name:");
//		  name[i] = sc.next();
//		  System.out.println("\n Enter  phone number:");
//		  phno[i] = sc.nextLong();
//	  }
	 

		int rollnumber[] = {101,102,103,104,105};
		String name[] = {"Gokul","Balaji","Dharmesh","Arul","Shiva"};
		long phno[] = {7339261262l,9999999999l,777777777777l,1234566777l,173333333333l};
	  
	  

		System.out.println("Enter number ");
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Enter the roll number to search:");
			int a =sc.nextInt();
			
			 for(int i=0;i<5;i++)	  
			  {
				  if(a==rollnumber[i]) {
//					  System.out.println(i);
					  
		   System.out.println("Rollnumber:"+rollnumber[i]+"\n Name:"+name[i]+"\n Phone Number:"+phno[i]);
		   
		   break;
			}
				   
			  }
			break;
		case 2:
			System.out.println("Enter the name to search:");
			String b= sc.next();
			 for(int i=0;i<5;i++)	  
			  {
				  if(b.equalsIgnoreCase(name[i])) {
//					  System.out.println(i);
					  
		   System.out.println("Rollnumber:"+rollnumber[i]+"\n Name:"+name[i]+"\n Phone Number:"+phno[i]);
		   
		   break;
				  }
				   
			  }
			break;
			
		case 3:
			System.out.println("Enter the phone number to search:");
			long ph = sc.nextLong();
			 for(int i=0;i<5;i++)	  
			  {
				  if(ph == phno[i]) {
//					  System.out.println(i);
					  
		   System.out.println("Rollnumber:"+rollnumber[i]+"\n Name:"+name[i]+"\n Phone Number:"+phno[i]);
		   
		   break;
				  }
				   
			  }
			break;
		
			default:
				System.out.println("Invalid number");
		}
	  
	 
  }
	
	
}
