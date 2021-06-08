






import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;



public class Student1details {
	
	int id;
	String name;
	int age;
    HashMap<Integer,Student1> list = new HashMap<Integer,Student1>();
	Scanner sc = new Scanner(System.in);
	
	 void operations() {
		
		while (true) {
			Scanner input = new Scanner(System.in);
			displayMenu();
			
			int choice = input.nextInt();

			if (choice == 1) {

				Student1 s1 = new Student1();

				System.out.println("Enter Student1 Id");
				id = input.nextInt();

				System.out.println("Enter Student1 name");
				s1.name = input.next();

				System.out.println("Enter Student1 mobNo");
				s1.age = input.nextInt();

				list.put(id,s1);

				
			} else if (choice == 2) {
				System.out.println("Enter the Id to Remove");
				System.out.println();
				int elementToRemove = input.nextInt();

				boolean isremoved=false;
				int i=0;
				if (list.size() != 0) {
				
					for(Map.Entry<Integer,Student1> eachvalue : list.entrySet())
					{
						Student1 str= eachvalue.getValue();
						if (str.id == elementToRemove) {
							list.remove(list.get(str));
							System.out.println("Removed");
							isremoved = true;
							break;
						}
						
					}
				} else {
					System.out.println("List is empty");
				}
				if (isremoved) {
					list.remove(i);
					System.out.println("Removed");
				}else
					System.out.println("Student1 ID not found");

			} else if (choice == 3) {
				System.out.println("Search Student1-->");
				System.out.println("Enter Student1 id");
				int id = input.nextInt();

				boolean isdetailsFound=false;
				if (list.size() != 0) {
					
					for(Map.Entry<Integer,Student1> eachvalue : list.entrySet())
					{
					
						Student1 str= eachvalue.getValue();
						if (str.id == id) {
							System.out.println(eachvalue.getKey()+""+"ID : "+str.id+" Name : "+str.name+"  Age : "+str.age);
							isdetailsFound = true;
						}
					
						} 
				} else {
					System.out.println("List is empty");
				}
				
				if (isdetailsFound)
					System.out.println("Details Retrieved");
				else
					System.out.println("Student1 ID not found");
			}else if(choice ==4) {
			

				for(Map.Entry<Integer,Student1> eachvalue : list.entrySet())
				{
					Student1 std= eachvalue.getValue();
					System.out.println(eachvalue.getKey()+""+std.id+""+std.name+""+std.age);
				
				}
				//break;
			}
			else if (choice == 5) {
				System.out.println("Good bye");
				break;
			}
		}
	}

	public static void displayMenu() {
		System.out.println();
		System.out.println("1. Add");
		System.out.println("2. Remove");
		System.out.println("3. Search");
		System.out.println("4. Display");
		System.out.println("5. Exit");
		System.out.println();
		System.out.println("Your Choise");
	}
	
	


}
 




