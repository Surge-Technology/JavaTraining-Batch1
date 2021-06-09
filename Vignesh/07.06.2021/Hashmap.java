import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Hashmap{
	static Scanner input  = new Scanner(System.in);

public class Student {

	 int id;
	 String name;
	 int age;
public Student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
}
	public static void main(String[] args) {
			HashMap<Integer,StudentHashmap>Map = new HashMap<Integer,StudentHashmap>();

		ArrayList<Student> stdList = new ArrayList<Student>();
		
		while(true) {
			System.out.println();
			System.out.println("Insert student - 1");
			System.out.println("Search student - 2");
			System.out.println("Delete student - 3");
			System.out.println("Print all - 4");
			System.out.println("Exit - 5");
			System.out.println();
			System.out.println("Please select any one");			
			
			int operation = input.nextInt();
			
			Hashmap obj = new Hashmap();
			switch(operation) {
			case 1:
				stdList = obj.insertStudent(stdList);
				break;
				
			case 2:
				obj.searchStudent(stdList);
				break;
				
			case 3:
				stdList = obj.deleteStudent(stdList);
				break;
				
			case 4:
				obj.printAll(stdList);
				break;
				
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println("Please choose the correct opertion to perform...!!!");
				break;
			
			}
		}		
}

	private void printAll(ArrayList<Student> stdList) {
		for(Student eachStd: stdList) {
				System.out.println("Student id:"+" "+eachStd.id);
				System.out.println("Student name:"+" "+eachStd.name);
				System.out.println("Student age:"+" "+eachStd.age);
		}
	}

	private ArrayList<Student> deleteStudent(ArrayList<Student> stdList) {
		System.out.println("PLease enter student id you want to delete");
		int stdId = input.nextInt();
		for(Student eachStd: stdList) {
			if(eachStd.id == stdId) {
				stdList.remove(eachStd);
				
				System.out.println("Student id:"+" "+eachStd.id);
				System.out.println("Student name:"+" "+eachStd.name);
				System.out.println("Student age:"+" "+eachStd.age);		
				}
		}
		return stdList;
	}

	private void searchStudent(ArrayList<Student> stdList) {
		System.out.println("Please enter student id you want to search");
		int stdId = input.nextInt();
		
		
		
		for(Student eachStd: stdList) {
			if(eachStd.id == stdId) {
				System.out.println("Student id:"+" "+eachStd.id);
				System.out.println("Student name:"+" "+eachStd.name);
				System.out.println("Student age:"+" "+eachStd.age);	
				}
		}
	}

	private ArrayList<Student> insertStudent(ArrayList<Student> stdList) {
		System.out.println("How much student you want to enroll");
		int noStd = input.nextInt();
		
		for(int index=0; index<noStd;index++) {
			System.out.println("please enter Student"+" "+(index+1)+" "+ "id");
			int id = input.nextInt();
			System.out.println("please enter Student" +" "+(index+1)+" "+ "name");
			String name = input.next();
			System.out.println("please enter Student"+" "+(index+1)+" "+ "age");
			int age = input.nextInt();
			stdList.add(new Student(id, name, age));
		}
		System.out.println();
		System.out.println(noStd + " " + "Student enrolled");

		
		return stdList;
	}

}
