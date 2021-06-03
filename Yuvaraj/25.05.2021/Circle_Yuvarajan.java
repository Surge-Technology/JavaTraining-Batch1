import java.util.Scanner;

public class Circle_Yuvarajan {
	static double r;
	static double pi = 3.14;
	
	double areaOfCircle() {
		
	        return pi * r * r;
	}
    double circumferanceOfCircle() {
	   		 
	   	    return 2*pi * r ;
		
	}
	  public static void main(String[] args) 
	    {
		  Scanner s = new Scanner(System.in);
 	        System.out.print("Enter radius of circle:");
 	       int  r = s.nextInt();
		 
	        System.out.println("Area of circle:"+pi * r * r);
	        System.out.println("circum of circle:"+2*pi * r);
	    }   

}
