package package1;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Hashtable1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int input;
		
		Hashtable<Integer, Studet> hash = new Hashtable<Integer, Studet>();
		while(true) {
			System.out.println("Please select anyone operation \n 1.Insert Student deatils \n 2.Search Student \n 3.Update a Student \n 4.Print all Student details \n 5. Exit");
			input = sc.nextInt();
			Hashtable1 obj =new Hashtable1();
			switch (input) {
			case 1:
				hash = obj.insert(hash);
				System.out.println("Record inserted sucessfully");
				break;
			case 2:
				obj.search(hash);
				break;
			case 3:
				hash = obj.update(hash);
				break;
				
			}
		}
		
		
	}

	
		
	

	private Hashtable<Integer, Studet> update(Hashtable<Integer, Studet> hash) {
		System.out.println("Enter ID to update student details");
		int up = sc.nextInt();
		Studet addr = new Studet();
		for(Entry<Integer, Studet> key : hash.entrySet()) {
			if(key.getKey() == up) {
				addr = key.getValue();
				System.out.println("Enter name to update ");
				String na = sc.next();
				System.out.println("Enter address to update");
				String ad = sc.next();
				addr.setId(up);
				addr.setName(na);
				addr.setAddr(ad);
				hash.replace(up, addr);
			}
		}
		return hash;
	}





	private void search(Hashtable<Integer, Studet> hash) {
		System.out.println("Enter ID to search ");
		int se = sc.nextInt();
		if(hash.containsKey(se)) {
			System.out.println("name :"+hash.get(se).getName()+"   "+"addr :"+hash.get(se).getAddr());
		} else {
			System.out.println("ID not found");
		}
		
	}





	private Hashtable<Integer, Studet> insert(Hashtable<Integer, Studet> hash) {
		System.out.println("Enter no of students");
		int in = sc.nextInt();
		for(int i=0;i<in;i++) {
			Studet ins = new Studet();
			System.out.println("Enter ID");
			ins.setId(sc.nextInt());
			System.out.println("Enter name");
			ins.setName(sc.next());
			System.out.println("Eter address");
			ins.setAddr(sc.next());
			hash.put(ins.getid(), ins);
		}
		return hash;
	}

}
class Studet {
	int id;
	String name, addr;
	
	public int getid() {
		return id;
	}

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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
