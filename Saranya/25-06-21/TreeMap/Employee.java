package Collection;

public class Employee {

	int id;
	String name;
	Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	

	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	}