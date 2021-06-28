package Treesetdemo;

public class Employe {
	
	public String name;
	public int id;

	public Employe(String name, int id) {
		this.id=id;
		this.name=name;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", id=" + id + "]";
	}

}
