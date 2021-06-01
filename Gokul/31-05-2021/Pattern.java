public class Pattern {
	
	
	
	static void acending()
	{
		int rows=3;
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void descending()
	{
		int rows=3;
		
		for(int i=rows-1; i>=0; i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	 static void triangle()
	  {
		 int rows=3;
		  for(int i=0;i<rows;i++)
		  {
			for(int j=rows-i;j<1;j--)
			{
				System.out.print("");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
	  }
	}
	 
	 public static void main(String[] args)
	 {
		 Pattern.acending();
		 System.out.println("");
		 Pattern.descending();
		 System.out.println("");
		 Pattern.triangle();
		 }
}