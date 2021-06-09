import java.util.*;
class Employee {
	int id;
	String name,mobNo;
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
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}


}
public class HashMapEx {
	static Scanner obj = new Scanner(System.in);
	public static void main(String[] args) {
		
		HashMap<Integer, Employee> list = new HashMap<Integer, Employee>();

		while(true) {
			System.out.print("Choose the operation \n 1.Insert \n 2.Search  \n 3.delete  \n 4.print all Employee details \n 5. Exit");
			int a = obj.nextInt(); 
			HashMapEx emp = new HashMapEx();
			switch(a) {

			case 1: 
				list = emp.insert(list);
				System.out.println("insert done ");
				break;
			case 2:
				emp.search(list);
				break;
			case 3: 
				emp.delete(list);
				break;
			case 4:
				emp.print(list);
				break;
			case 5:
				System.exit(0);
				break;


			}
		}


}
	private void print(HashMap<Integer, Employee> list) {
		for(Map.Entry<Integer , Employee>key : list.entrySet()) {
			Employee emp = key.getValue();
			 System.out.println("id :"+emp.getId()+"name :"+emp.getName() + "mobNo :"+emp.getMobNo());
		}

	}
	private void delete(HashMap<Integer, Employee> list) {
		System.out.println("enter id to remove");
		int del = obj.nextInt();
		if(list.containsKey(del)) {
			list.remove(del);
		}


	}
	public 	HashMap<Integer, Employee> insert(HashMap<Integer, Employee> list) {
	System.out.println("enter no of Student");
	int ins = obj.nextInt();

	for(int i = 0;i<ins;i++) {
		Employee a = new Employee();

		System.out.println("enter id");
		a.setId(obj.nextInt());
		System.out.println("enter name");
		a.setName(obj.next());
		System.out.println("enter mobNo");
		a.setMobNo(obj.next());
		list.put(a.getId(), a);

	}
	return list;
	}
	public void search(HashMap<Integer, Employee> list) {
		System.out.println("enter id to search");
		int y = obj.nextInt();
			if(list.containsKey(y)) {
				System.out.println("name :"+list.get(y).getName()+"   "+"mobNo :"+list.get(y).getMobNo());
			} else {
				System.out.println("Employee id not found");
			}

	}
}	

