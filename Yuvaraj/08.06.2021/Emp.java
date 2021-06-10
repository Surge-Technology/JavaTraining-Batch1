import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Emp {
	int id;
	String name;
	
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
}
class story{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Hashtable <Integer,Emp> obj=new Hashtable<Integer,Emp>();
		
		while(true) {
			System.out.println("1.Insert \\n 2.remove  \\n 3.search  \\n 4.update \\n 5.print \\n 6. Exit\"");
			int input=sc.nextInt();
			story n=new story();
			
		switch(input){
		case 1:
		   obj=n.insert(obj);
		   System.out.println("enter num");
		   break;
		case 2:
		  n.remove(obj);
		  System.out.println("removed");
		  break;
		case 3:
			n.search(obj);
			System.out.println("The Details");
			break;
		case 4:
			n.update(obj);
			System.out.println("Updated");
		case 5:
			n.print(obj);
			System.out.println("Total Details");
			break;
		case 6:
			System.exit(0);
			break;
			
		}
		}
		
		

	}

	private void print(Hashtable<Integer, Emp> obj) {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer , Emp>key : obj.entrySet()) {
			Emp emp = key.getValue();
			 System.out.println("id :"+emp.getId()+"name :"+emp.getName());
		}
		
	}

	private void remove(Hashtable<Integer, Emp> obj) {
System.out.println("Enter emp Id To Remove");
  int h=sc.nextInt();
if(obj.containsKey(h));{
	obj.remove(h);
}
		
	}

	private void update(Hashtable<Integer, Emp> obj) {

		System.out.println("\n Enter  key to update: ");
		int key1=sc.nextInt();
		
		
		
		if (obj.size() != 0) {
			for(Map.Entry<Integer,Emp> eachvalue : obj.entrySet())
			{
				Emp str= eachvalue.getValue();
				if (eachvalue.getKey() == key1) {
					Emp em = new Emp();
					System.out.println("Enter KEY:");
					int key2=sc.nextInt();
					
					System.out.println("Enter Student Id");
					em.setId(sc.nextInt());

					System.out.println("Enter Student name");
					em.setName(sc.next());

					obj.replace(key1,em);	
				}
				
			}
		}
		}
		

		
	

	private void search(Hashtable<Integer, Emp> obj) {
		System.out.println("enter id to search");
		int y = sc.nextInt();
			if(obj.containsKey(y)) {
				System.out.println("name :"+obj.get(y).getName());
			} else {
				System.out.println("Employee id not found");
			}
	}

	

	private Hashtable<Integer, Emp> insert(Hashtable<Integer, Emp> obj) {

		System.out.println("enter no of Student");
		int l = sc.nextInt();

		for(int i = 0;i<l;i++) {
			Emp a = new Emp();

			System.out.println("enter id");
			a.setId(sc.nextInt());
			System.out.println("enter name");
			a.setName(sc.next());
			
			obj.put(a.getId(), a);

		}
		
		return obj;
	}

}
