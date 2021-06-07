package package1;

import java.util.ArrayList;
import java.util.Scanner;

class MyClass {
	public static void main(String args[]) {
		ArrayList<Students> arr= new ArrayList<Students>(); 
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the operation");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			
			System.out.println("no of students");
			int no = sc.nextInt();	
			
			for(int i=0;i<no;i++) {
				Students stud = new Students();
				System.out.println(" enter stud roll no");
				stud.setId(sc.nextInt());
				System.out.println("enter stud name");
				stud.setName(sc.next());
				System.out.println("addr");
				stud.setAddress(sc.next());
				arr.add(stud);
				
			}
			break;
		case 2:
			System.out.println("enter id to search");
			int s = sc.nextInt();
			for(int i=0;i<arr.size();i++) {
				if(arr.get(i).getId()==s) {
					System.out.println("id"+arr.get(i).getId()+"name"+arr.get(i).getName()+"addr"+arr.get(i).getAddress());
				
				}
				
			}
			break;
		case 3: 
			System.out.println("enter id to del");
			int d = sc.nextInt();
			for(int i=0;i<arr.size();i++) {
				if(arr.get(i).getId()==d) {
					arr.remove(i);
				}
			
			}
			break;
		case 4:
			System.out.println("stud details");
			for(int i=0;i<arr.size();i++) {
				
					System.out.println("id"+arr.get(i).getId()+"name"+arr.get(i).getName()+"addr"+arr.get(i).getAddress());
				
				}
			break;
		case 5:
			System.exit(0);
		default :
			System.out.println("Wrong no");	
		}
	} 
}
	
}
class Students {
	private int id;
	private  String name;
	private  String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
   
	
}