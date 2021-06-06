import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
public class StudentDetails {
	

	

		int id;
		String name;
		String mobNo;
	    List<StudentDetails> list = new ArrayList<StudentDetails>();

		public static void main(String[] args) {
			
			StudentDetails obj =new StudentDetails();
			obj.details();

		}

		private void details() {
			list = new ArrayList<StudentDetails>();
			while (true) {
				Scanner input = new Scanner(System.in);
				displayMenu();
				
				int choice = input.nextInt();

				if (choice == 1) {

					StudentDetails s1 = new StudentDetails();

					System.out.println("Enter  Id");
					s1.id = input.nextInt();

					System.out.println("Enter  name");
					s1.name = input.next();

					System.out.println("Enter  mobNo");
					s1.mobNo = input.next();

					list.add(s1);

					
				} else if (choice == 2) {
					System.out.println("Enter the Id to Remove");
					System.out.println();
					int elementToRemove = input.nextInt();

					boolean isremoved=false;
					int i=0;
					if (list.size() != 0) {
						
						for (StudentDetails obj : list) {
							if (obj.id == elementToRemove) {
								isremoved = true;
								break;
							}
							i++;
						}
					} else {
						System.out.println("value is empty");
					}
					if (isremoved) {
						list.remove(i);
						System.out.println("Removed");
					}else
						System.out.println(" ID not found");

				} else if (choice == 3) {
					System.out.println("Search Student-->");
					System.out.println("Enter  id");
					int id = input.nextInt();

					boolean isdetailsFound=false;
					if (list.size() != 0) {
						for (StudentDetails obj : list) {
							if (obj.id == id) {
								System.out.println("ID : "+id+" Name : "+obj.name+" Mob No : "+obj.mobNo);
								isdetailsFound = true;
							}
						}
					} else {
						System.out.println("List is empty");
					}
					
					if (isdetailsFound)
						System.out.println("Details Retrieved");
					else
						System.out.println("Student ID not found");
					// System.out.println("Your List:" + list);
				} else if (choice == 4) {
					System.out.println("Exit");
					break;
				}
			}
		}

		public static void displayMenu() {
			System.out.println();
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Search");
			//System.out.println("4. Display");
			System.out.println("4. Exit");
			System.out.println();
			System.out.println("Your Choice");
		}

	}


