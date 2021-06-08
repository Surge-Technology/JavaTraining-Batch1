

public class Student1 {
	 int id;
	 String name;
	 int age;
	
	
	
	
	Student1()
	{
		
	}
	
	Student1(int id,String name, String dob) {
		this.id = id;
		this.name = name;
		this.age = age;
		
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

	public int getDob() {
		return age;
	}

	public void setDob(int age) {
		this.age = age;
	}

	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}


