import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentRecord {

	int id;
	String name;
	String address;
    ArrayList<StudentRecord> studentlist = new ArrayList<StudentRecord>();
    Iterator <StudentRecord> itr = studentlist.iterator();

	public static void main(String[] args) {
		
		StudentRecord std =new StudentRecord();
		std.menu();

	}

	private void menu() {
		studentlist = new ArrayList<StudentRecord>();
		while (true) {
			Scanner input = new Scanner(System.in);
			mainMenu();
			
			
			int selectOption;
			selectOption = input.nextInt();
			if (selectOption == 1) {

				StudentRecord s1 = new StudentRecord();
				int length;
				System.out.println("How much student you want to enroll");
				length = input.nextInt();
				for (int i=0; i<length; i++){
				System.out.println("Enter Student" + " " +(i+1) +" "+"roll No");
				s1.id = input.nextInt();

				System.out.println("Enter Student" + " " +(i+1) +" "+"name");
				s1.name = input.next();

				System.out.println("Enter Student" + " " +(i+1) +" "+"address");
				s1.address = input.next();
}
				System.out.println(length + " " + "Student enrolled");

				studentlist.add(s1);

				
			} else if (selectOption == 2) {
				System.out.println("To remove student records");
				System.out.println("Enter Student roll no");
				System.out.println();
				
			} else if (selectOption == 3) {
				System.out.println("To search student records");
				System.out.println("Enter Student roll no");
				System.out.println();
			
			}else if(selectOption ==4) {
				System.out.println("To Display student records");
				System.out.println("Enter Student roll no");
				System.out.println();
			}
			else if (selectOption == 5) {
				System.out.println("Exit done");
				break;

        
			}

		}
		
	}

	public static void mainMenu() {
		System.out.println();
		System.out.println("Insert student - 1");
		System.out.println("Search student - 2");
		System.out.println("Delete student - 3");
		System.out.println("Print all - 4");
		System.out.println("Exit - 5");
		System.out.println();
				System.out.println("Please select any one");

	}
}
