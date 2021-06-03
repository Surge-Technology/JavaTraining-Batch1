import java.util.Scanner;
public class Arrayaverage {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[15];
		
		for(int i=0;i<15;i++)
		{
			
			a[i]=sc.nextInt();
					    
		}
		int b,c,d,e;
		b=(a[0]+a[1]+a[2]+a[3]+a[4])/5;
		
		c=(a[5]+a[6]+a[7]+a[8]+a[9])/5;
		
		d=(a[10]+a[11]+a[12]+a[13]+a[14])/5;
		
	   e=(b+c+d)/3;
	   
	   System.out.println("Average is"+e);
		
	}

}
