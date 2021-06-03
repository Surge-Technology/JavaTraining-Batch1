public class PrimeNumber {

	public static void main(String[] args)
	{
		
		int flag = 0 ;
		for(int i=1; i<=100; i++)
		{
			
		     int j = 2;
		     while(j<9)
		     {
				if(i%j==0)
				{
					System.out.println(i+"is not a prime number");
					flag=1;
				}
				
				if(flag==0)
				{
					System.out.println(i+"is prime");
				}
			
				j++;
			}
					
		}
	}
}
