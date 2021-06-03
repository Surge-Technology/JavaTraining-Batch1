import java.util.Scanner;

public class Rectangle_Yuvarajan {
	static double l,w;
	
	double areaOfRectangle() {      
     
        return l*w;
}
        double CircumferanceOfRectangle() {
   		 
   	        return  2 * (l + w) ;
	
}
  public static void main(String[] args) 
    {
	  Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of l:");
	        l = s.nextInt();
	     System.out.print("Enter value of w:");
      w = s.nextInt();
	
	  System.out.println("area of Rectangle:" + l*w);
	  System.out.println("Circumferance of Rectangle:"+ 2 * (l + w));
    }

}
