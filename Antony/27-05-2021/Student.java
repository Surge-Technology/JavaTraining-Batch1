package package1;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stud arr[] = new Stud[10];
		System.out.println("Enter 10 Students details");
		for(int i=0;i<2;i++) {
			Stud obj = new Stud(sc.nextInt(), sc.next(), sc.nextLong());
			arr[i] = obj;

		}
		System.out.println("Enter rollno");
		int userrolno = sc.nextInt();
		for(int i =0; i<2; i++) {
			if(arr[i].rollno==userrolno) {
				System.out.println("rollno :"+ arr[i].rollno+"   name :"+arr[i].name+"   mobno:"+ arr[i].mobno);
			} 
		}

	}
	}
 class Stud {
	  int rollno;
	  String name;
	  long mobno;
	
	 Stud(int rollno, String name, long  mobno) {
		 this.rollno = rollno;
		 this.name   = name;
		 this.mobno  = mobno;
	 }
}