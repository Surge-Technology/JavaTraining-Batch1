import java.util.Scanner;

public class Vignesh_Students_Records{
   public static void main(String args[]){
	   
		Scanner sc=new Scanner(System.in);
		int[] rollNo = new int[10];
		String[] studentName =  new String[10];
		long[] mobileNo = new long[10];

		int getStudentDetails;
		
		for (int i = 0; i < 3; i++) {
		
			System.out.println("Enter Student Details");
			//Roll No of Students we get from User
			System.out.println("Enter Roll no"+ (i + 1));
			rollNo[i] = sc.nextInt();
			//Name of Students we get from User
			System.out.println("Enter student name"+(i+1));
			studentName[i] = sc.next();
			//Mobile No of Students we get from User
			System.out.println("Enter Mobile number"+ (i + 1));
			mobileNo[i] = sc.nextLong();						
		}
				
			System.out.println("Enter Roll No of Student to get Details");
			getStudentDetails = sc.nextInt();

    

      for(int i = 0; i<rollNo.length; i++){
         if(getStudentDetails == rollNo[i]){
            System.out.println("Student Details for the Roll No" + rollNo[i]);
            System.out.println(studentName[i]);
            System.out.println(mobileNo[i]);
         }
		 
				 		 
      }
	  
   }
}