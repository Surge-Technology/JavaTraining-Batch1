
public class PolimorphismConcept {

public void display() {
    for (int i = 0; i < 10; i++) {
      System.out.print("*");
    }
  }
public void display(char symbol) {
    for (int i = 0; i < 10; i++) {
      System.out.print(symbol);
    }
  }
}

class ChildClass1 extends PolimorphismConcept {

	public static void main(String[] args) {

		ChildClass1 d1 = new ChildClass1();
				    d1.display();
				    System.out.println("\n");
				    d1.display('y');
			}
}
class ChildClass2 extends PolimorphismConcept{
	 
	public static void main(String[] args) {
		
		ChildClass2 d1 = new ChildClass2();
		    d1.display();
		    System.out.println("\n");	   
		    d1.display('#');
		   
	}	
}
