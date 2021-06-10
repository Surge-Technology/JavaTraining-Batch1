package util.pacakage;

public class StudentSt {
	
		
				 int id;
				 String name;
				 String dob;
				 
				 StudentSt(){}
				
				StudentSt(int id,String name, String dob) {
					this.id = id;
					this.name = name;
					this.dob = dob;
					
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

				public String getDob() {
					return dob;
				}

				public void setDob(String dob) {
					this.dob = dob;
				}

				
				
				@Override
				public String toString() {
					return "Student [id=" + id + ", name=" + name + ", dob=" + dob + "]";
				}

			}
