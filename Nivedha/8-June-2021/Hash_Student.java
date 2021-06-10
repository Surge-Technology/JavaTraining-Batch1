import java.util.Scanner;
public class Hash_Student {
	
	import java.util.Iterator;
	import java.util.Scanner;
	import java.util.Hashtable;
	public class Student {
		 Scanner sc  = new Scanner(System.in);
		 	int id;
		String name;
		String city;
		Student(){
			
		}
		
		public Student(int id,String name,String city) {
			this.id=id;
			this.name=name;
			this.city=city;
		}
		public int getId() {
			return id;
		}
		public void setid(int id) {
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
			public String getCity() {
				return city;
			}
			public void setcity(String city) {
				this.city=city;
			
		}

		public static void main(String[] args) {
			Hashtable<Integer, String> list = new Hashtable<>();
			
			
			while(true) {
				System.out.println(" Please Select Anyone Operation:");
				System.out.println(" Insert Student: 1 ");
				System.out.println(" Search Student: 2 ");
				System.out.println(" Delete Student: 3 ");
				System.out.println(" Update Student: 4 ");
				System.out.println(" Print All Student Details: 4 ");
				System.out.println(" Exit : 6 ");
				int ch = input.nextInt();
				
			 private void Details()
	   {
			Hashtable<Integer,Student> ht=new Hashtable<Integer,Student>();
			System.out.println("Enter the no.of students:");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				Student std =new Student();
				System.out.println("enter a key:");
				int k=sc.nextInt();
			
			System.out.println("enter a id:");
	    	std.setid(sc.nextInt());
	    	System.out.println("enter a name:");
	    	std.setName(sc.next());
	    	System.out.println("enter a city:");
	    	std.setcity(sc.next());
	    	map.put(k,std);
		}
			switch(ch) {
				case 1:
					Student std=new Student();
					System.out.println("Enter the no.of students:");
					int n=sc.nextInt();
					for(int i=0;i<n;i++) {
						Student std =new Student();
						System.out.println("enter a key:");
						int k=sc.nextInt();
					System.out.println("enter a id:");
					std.setid(sc.nextInt());
					System.out.println("enter a name:");
					std.setName(sc.next());
					System.out.println("enter a city:");
					std.setcity(sc.next());
					map.put(k,std);
			}
			
		
		}
					
					
				case 2:
					System.out.println("Enter a number to search:");
					int num=sc.nextInt();
					boolean isdata=false;
					if(map.size()!=0) {
						for(Map.Entry<Integer,Student> eachvalue:ht.entryset())
			    {
							Student std =eachvalue.getValue();
							if(std.id==id) {
								System.out.println(eachvalue.getValue()+"Id:");
								System.out.println(eachvalue.getValue()+"Name:");
								System.out.println(eachvalue.getValue()+"City:");
								isdata=true;
			    		}
			    	}
			    }
			    else {
			    	System.out.println("No data");
			    }
			    	break;
					
					
				case 3:
					System.out.println("Enter a number to remove:");
					int std=sc.nextInt();
					for(Student eachStd:stdlist))
		    	{
						Student std=eachvalue.getValue();
					
						if(eachStd==std.id) {
							map.remove(map.get(std));
							System.out.println("Student Details:"+eachStd.id+""+eachStd.name+""+eachStd.age+"");
		    		} 	
			    	
			 }break;
			 
			 
				case 4:
					System.out.println("enter a key:");
					int k=sc.nextInt();
					if(map.size()!=0) {
						for(Map.Entry<Integer,Student>eachvalue:ht.enteryset());{
							Student std =new Student();
							if(eachvalue.getk()==k) {
								int k=sc.nextInt();
							Student st=new Student();
							}
							System.out.println("enter a key:");
							int k1=sc.nextInt();
						
						System.out.println("enter a id:");
				    	st.setid(sc.nextInt());
				    	System.out.println("enter a name:");
				    	st.setName(sc.next());
				    	System.out.println("enter a city:");
				    	st.setcity(sc.next());
				    	map.replace(k,st);
						}
					}
	   }	
				case 5:
					for(Map.Entry<Integer,Student> eachvalue:ht.entryset());{
						Student  s=eachvalue.getValue();
				
				System.out.println(eachvalue.getk()+ s.id);
				System.out.println(eachvalue.getk()+ s.name);
				System.out.println(eachvalue.getk()+ s.city);
				break;
			}
			
			
				
				case 6:
					System.out.println("Exit..");
					System.exit(0);
					
				default:
					System.out.println("Invalid number:");
					break;
				
				}
			}		
		}
	}
}
		
		