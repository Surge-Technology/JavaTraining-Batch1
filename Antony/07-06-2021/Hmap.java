package package1;
import java.util.*;
public class Hmap {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a= 0,b=0;
		HashMap<Integer, Studdet> map = new HashMap<Integer, Studdet>();
		
		while(true) {
			System.out.print("Please select anyone operation \n 1.Insert Studdet deatils \n 2.Search Studdet \n 3.delete a Studdet \n 4.print all Studdet details \n 5. Exit");
			a = sc.nextInt(); 
			Hmap stu = new Hmap();
			switch(a) {
			
			case 1: 
				map = stu.insert(map);
				System.out.println("insert done ");
				break;
			case 2:
				stu.search(map);
				break;
			case 3: 
				 stu.delete(map);
				break;
			case 4:
				stu.print(map);
				break;
			case 5:
				System.exit(0);
				break;

				
			}
		}
	

}
	private void print(HashMap<Integer, Studdet> map) {
		for(Map.Entry<Integer , Studdet>key : map.entrySet()) {
			 Studdet stud = key.getValue();
			 System.out.println("rno :"+stud.getId()+"name :"+stud.getName() + "addr :"+stud.getAddr());
		}
		
	}
	private void delete(HashMap<Integer, Studdet> map2) {
		System.out.println("enter id to remove");
		int del = sc.nextInt();
		if(map2.containsKey(del)) {
			map2.remove(del);
		}
		
		
	}
	public 	HashMap<Integer, Studdet> insert(HashMap<Integer, Studdet> map) {
	System.out.println("enter no of Studdet");
	int ins = sc.nextInt();
	
	for(int i = 0;i<ins;i++) {
		Studdet as = new Studdet();

		System.out.println("enter rno");
		as.setId(sc.nextInt());
		System.out.println("enter name");
		as.setName(sc.next());
		System.out.println("enter addr");
		as.setAddr(sc.next());
		map.put(as.getId(), as);
		
	}
	return map;
	}
	public void search(HashMap<Integer, Studdet> map1) {
		System.out.println("enter id to search");
		int se = sc.nextInt();
			if(map1.containsKey(se)) {
				System.out.println("name :"+map1.get(se).getName()+"   "+"addr :"+map1.get(se).getAddr());
			} else {
				System.out.println("cant find the id");
			}
		
	}
}	

class Studdet {
	int id;
	String name,addr;
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
