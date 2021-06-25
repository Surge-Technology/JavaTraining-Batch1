package collections;

public class EmployeeEx  implements Comparable<EmployeeEx>{
		String name;
		int id;
		public EmployeeEx(String name,int id) {
			this.name=name;
			this.id=id;
		}

		public int compareTo(EmployeeEx o) {
			return this.name.compareTo(o.name);
		}
		public String toString() {
			return "EmployeeEx [name= "+name+"  id="+id+"]";
		}
		public int length() {
			return 0;
		}

	}

