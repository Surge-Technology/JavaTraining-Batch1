public class PrimeNumber {

	public static void main(String[] args)
	{
		
		
		for(int i=1; i<=100; i++)
		{
			boolean flag = true ;
		     
		     if(i>1)
		     {
		    	 for(int j=2; j<i; j++)
		     {
				if(i%j==0)
				{
//					System.out.println(i+"is not a prime number");
					flag=false;
				}
				
			}
		     }
		     else
		     {
		    	 flag=false;
		     }
		     
		     if(flag)
		     {
		    	 System.out.println(i+"is  prime number"); 
		     }
					
		}
	}
}
