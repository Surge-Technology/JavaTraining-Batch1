package student;

import java.util.Scanner;

public class StudentArr {

	public static void main(String[] args) {
			Student st=new Student();
			st.studdetails();		
		}
			}
	class Student{
			 Scanner s=new Scanner(System.in);
			 Scanner sc=new Scanner(System.in);
	void studdetails() {
		int rollno[]=new int[10];
		String name[]=new String[10];
		long mobile[]=new long[10];
		System.out.println("enter the rollno:");
			for(int i=0;i<rollno.length;i++) {
				rollno[i]=s.nextInt();
			}
		System.out.println("enter the names:");
				for(int i=0;i<name.length;i++) {
					name[i]=sc.nextLine();
			}
		System.out.println("enter the mobileno:");
					for(int i=0;i<mobile.length;i++) {
				mobile[i]=s.nextLong();
			}		
		int id;
		System.out.println("enter the rollno:");
		id=s.nextInt();
		for (int i=0;i<10;i++) {
				if(id==rollno[i]) {
					System.out.println("rollno: "+rollno[i] +"\nname: "+ name[i] + " \nmobile: "+ mobile[i]);
				
				}

	}
	}
	}
	
	


