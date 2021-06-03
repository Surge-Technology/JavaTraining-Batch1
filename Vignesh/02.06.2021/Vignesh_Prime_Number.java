import java.util.Scanner;

public class Vignesh_Prime_Number {

	public static void main(String[] args) {
       int inputNumber, remainder;
	boolean isPrime=true;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number");
	 inputNumber=sc.nextInt();
	for(int i=2;i<=inputNumber/2;i++)
	{
           remainder=inputNumber%i;
	   if(remainder==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   System.out.println(inputNumber + "  Prime Number");
	else
	   System.out.println(inputNumber + " not Prime Number");
   }

}
