
public class PrimeNumb {

	public static void main(String[] args) {
		
		int numb= 0;
		for (int n=1; n<=100; n++)
		{
			for (int i= 2; i<=n-1; i++)
			{
				if (n%i==0)
				{
					numb=numb+1;
				}
				
			}
			if (numb==0)
			{
				System.out.println(n);
			}
			else
			{
				numb=0;
			}
		}
		
		

	}

}
