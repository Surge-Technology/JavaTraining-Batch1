package polymorphism;



public class Polymorphism 
{
	public static void main(String[] args)
	{
                                   MyBehaviour mybehaviour = new MyBehaviour(); 
                                   mybehaviour.behaviour();

		Student student = new Student();
		student.setStuname("aravind");
		student.setTech("java");
		System.out.println(student);
		
	}

}

class MyParent
{ 
	
	//String name = "aravind";
	
	public void behaviour()
	{
		System.out.println("parent behaviour");
	}
}


class MyBehaviour extends MyParent
{
	//String name = "vicky";
	
    @Override
	public void behaviour(){

		System.out.println("child behaviour");
	}
	
}

public class Student
{
	
	private String stuname;
	private String tech;
	
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString()
	{
		return "name";	
    }
	

}

