import java.util.Scanner;

public class Yuvarajan_StudInfo {

	public static void main(String[] args) {
		int [] RollNo = new int[10];
		String [] Name = new String[10];
		long [] MobNo = new long[10];
		int i,j,k;
	
		 Scanner s = new Scanner(System.in);
			System.out.print("\n\n Enter Roll No.\t:\t");
	        for(i=0;i<10;i++) {
	        	RollNo[i] = s.nextInt();
	        }
	    	System.out.print("\n\n Enter Name.\t:\t");
	        for(j=0;j<10;j++) {
	        	Name[j] = s.next();
		        }
	    	System.out.print("\n\n Enter Mobile No No.\t:\t");
	        for(k=0;k<10;k++) {
	        	MobNo[k] = s.nextLong();
		        }
	        System.out.println("Enter the Number To Find The Details ");
			int n = s.nextInt();

			switch(n)
			{
			case 1:
				System.out.println("Enter Student Roll No:");
				int a =s.nextInt();

				 for(int y=0;y<10;y++)	  
				  {
					  if(a==RollNo[y]) {

			   System.out.println("Roll No:"+RollNo[y]+"\n Name:"+Name[y]+"\n Mobile No:"+MobNo[y]);

			   break;
				}

				  }
				break;
			case 2:
				System.out.println("Enter Student Name:");
				String b= s.next();
				for(int y=0;y<10;y++)	  
				  {
					  if(b.equalsIgnoreCase(Name[y])) {

						   System.out.println("Roll No:"+RollNo[y]+"\n Name:"+Name[y]+"\n Mobile No:"+MobNo[y]);
			  
			   break;
					  }

				  }
				break;

			case 3:
				System.out.println("Enter Student MobNo:");
				long c = s.nextLong();
				for(int y=0;y<10;y++)	  
				  {
					  if(c == MobNo[y]) {

						   System.out.println("Roll No:"+RollNo[y]+"\n Name:"+Name[y]+"\n Mobile No:"+MobNo[y]);

			   break;
					  }

				  }
				break;

				default:
					System.out.println("Invalid no");
			}

	       
	}}
	 

	


