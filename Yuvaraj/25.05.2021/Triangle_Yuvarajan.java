import java.util.Scanner;

public class Triangle_Yuvarajan {
	double areaOfTriangle() {
		 
	        
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value for p:");
	       
	        double p = s.nextInt();
	        System.out.print("Enter value for h:");
	        double h = s.nextInt();
	        return (p*h)/2;
	}
	        double circumferanceOfTriangle() {
	   		 
	   	      double s1,s2,s3;
	   	        Scanner s = new Scanner(System.in);
	   	        System.out.print("Enter value of s1:");
	   	        s1 = s.nextInt();
	   	     System.out.print("Enter value of s2:");
	   	        s2 = s.nextInt();
	   	     System.out.print("Enter value of s3:");
	   	        s3 = s.nextInt();
	   	        return s1+s2+s3 ;
		
	}
	  public static void main(String[] args) 
	    {
	       
		  Triangle_Yuvarajan ob = new Triangle_Yuvarajan();
		  double areaOfTriangle = ob.areaOfTriangle();
		  double circumferanceOfTriangle = ob.circumferanceOfTriangle();
	        System.out.println("Area of Triangle:"+areaOfTriangle);
	        System.out.println("Circumferance of Triangle:"+circumferanceOfTriangle);
	    }

}
