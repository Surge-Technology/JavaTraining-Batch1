import java.util.Scanner;

public class Sqaure_Yuvarajan {
static int a;
	double areaOfSquare() {      
  
        return a*a;
}
        double circumferanceOfSquare() {
   	    
   	        return 4*a ;
	
}
  public static void main(String[] args) 
    {
	  Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of a:");
	        a = s.nextInt();
	 
        System.out.println("Area of Square:"+a*a);
        System.out.println("Circumferance of Square:"+4*a);
    }
}
