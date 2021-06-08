import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StudentA {
	

	
		String name;
		int age;
		StudentA(String name,int age){
			this.name=name;
			this.age=age;
		}

		//private static final HashMap<Integer, HStudent> HStudent = null;

		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			HashMap<Integer,StudentA>map=new HashMap<Integer,StudentA>();
			StudentA obj=new StudentA("madhan", 24);
			StudentA obj1=new StudentA("yuvraj", 25);
			StudentA obj2=new StudentA("jagan", 55);
			StudentA obj3=new StudentA("Kumar", 16);
			
			map.put(101, obj);
			map.put(102,obj1);
			map.put(103, obj2);
			map.put(104, obj3);
			
			
			 for(Map.Entry m : map.entrySet()) {
				 StudentA std= m.getValue();
				 System.out.println(m.getKey()+" "+std.name+" "+std.age);
			 }
			 while(true) {
			 System.out.println("1-Insert student");
			 System.out.println("2-Search student");
			 System.out.println("3-Delete student");
			 System.out.println("4-Print all Student details");
			 System.out.println("5-Exit");
			 int n;
			 n=s.nextInt();
			 switch(n) {
			 case 1:
				 System.out.println("Please enter no of student ");
				 int x=s.nextInt();
				 System.out.println("Enter the age & Name to add");
				 for(int i=0;i<x;i++) {
					 int iage=s.nextInt();
					 String iname=s.next();
					 StudentA hi=StudentA(iname,iage);
					 System.out.println("Enter keyvalue");
					 int kkey=s.nextInt();
					 map.put(kkey, hi);
					 for(Map.Entry eachValue : map.entrySet()) {
						 StudentA std= eachValue.getValue();
						 System.out.println(eachValue.getKey()+" "+std.name+" "+std.age);
					 
				 }
				 break;
			 }
			 case 2:
				 System.out.println("Enter the key ");
				 int skey=s.nextInt();
				 System.out.println("HashMap:"+map);
				 Iterator<Map.Entry<Integer,StudentA>> iterator=map.entrySet().iterator();
				 boolean isKeyPresent=false;
				 while(iterator.hasNext()) {
					 Map.Entry<Integer,StudentA>entry=iterator.next();
					 if(skey==entry.getKey()) {
						 isKeyPresent=true;
					 }
				 }
				 System.out.println("Does key"+skey+"exists:"+isKeyPresent);
				 break;
			 case 3:
				 System.out.println("Enter the key to be remove");
				 int remove1=s.nextInt();
				 StudentA rval=(StudentA)map.remove(remove1);
				 System.out.println(map);
				 break;
			 case 4:
				 System.out.println(map);
				 break;
			 case 5:
				 System.exit(0);
			 	 
			 }
			 }
			 
				 
		}

		private static StudentA StudentA(String iname, int iage) {
			// TODO Auto-generated method stub
			return null;
		}

		

	}
