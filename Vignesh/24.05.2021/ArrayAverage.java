import java.util.Scanner;
public class ArrayAverage {
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int[] a=new int[15];
			   System.out.println("Enter 15 number to find average");

		for(int i=0;i<15;i++)
		{
			
			a[i]=input.nextInt();
					    
		}
		int b,c,d;
		int totalAverage;
		b=((a[0]+a[1]+a[2]+a[3]+a[4])/5);
			   System.out.println("Average of first five is "+b);

		c=(a[5]+a[6]+a[7]+a[8]+a[9])/5;
					   System.out.println("Average of second five is "+c);

		d=(a[10]+a[11]+a[12]+a[13]+a[14])/5;
					   System.out.println("Average of last five is "+d);

	   totalAverage=(b+c+d)/3;
	   
	   System.out.println("Average of 15 Number is"+totalAverage);
		
	}

}
