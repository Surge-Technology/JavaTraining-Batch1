package student1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Student {

	int id;
	String name,address;
    ArrayList<Student> list = new ArrayList<Student>();
    Iterator <Student> itr = list.iterator();

	public static void main(String[] args) {
		Student st =new Student();
		st.menu();
	}
        void menu() {
		list = new ArrayList<Student>();
		while (true) {
			display();
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			

			if (n == 1) {
				System.out.println("enter the number of id you want to insert:");
				int d=input.nextInt();

				Student s1 = new Student();
				

				System.out.println("Enter Student Id");
				for(int i=0;i<d;i++) {
				s1.id = input.nextInt();
				}

				System.out.println("Enter Student name");
				for(int i=0;i<d;i++) {
				s1.name = input.next();
				}
				System.out.println("Enter Student address");
				for(int i=0;i<d;i++) {
				s1.address = input.next();
				}

				list.add(s1);

			} 
			else if (n == 2) {
				System.out.println("Enter the Id to Remove");
				int id = input.nextInt();
				boolean isremoved=false;
				int i=0;
				if (list.size() != 0) {
					Iterator <Student> itr = list.iterator();
					while(itr.hasNext()) {
						Student str= itr.next();
						if (str.id == id) {
							isremoved = true;
							break;
						}
						i++;
					}
				} else {
					System.out.println("List is empty");
				}
				if (isremoved) {
					list.remove(i);
					System.out.println("Removed");
				}else
					System.out.println("Student ID not found");

			} else if (n == 3) {
				System.out.println("Enter Student id");
				int id = input.nextInt();

				boolean isdetailsFound=false;
				if (list.size() != 0) {
					Iterator <Student> itr = list.iterator();
					while(itr.hasNext()) {
						Student str= itr.next();
						if (str.id == id) {
							System.out.println("ID : "+id+" Name : "+str.name+" Address : "+str.address);
							isdetailsFound = true;
						}
					}
				} else {
					System.out.println("List is empty");
				}
				
				if (isdetailsFound)
					System.out.println("Student ID found ");
				else
					System.out.println("Student ID not found");
				
			}else if(n ==4) {
				Iterator <Student> itr = list.iterator();
				while(itr.hasNext()) {
					Student str= itr.next();
					System.out.println("ID : "+str.id+" Name : "+str.name+" Mob No : "+str.address);
				}
			}
			else if (n == 5) {
				System.exit(0);
			
			}
		}
	}

	    void display() {
		System.out.println("1.insert\n2.remove \n3.search\n4.display\n5.exit\n");
		System.out.println("Enter Your Choice");
	}

}

	


	


