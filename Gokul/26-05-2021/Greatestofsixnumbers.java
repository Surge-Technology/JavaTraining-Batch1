import java.util.*;

public class Greatestofsixnumbers {

	public static void main(String[] args)
	{
		int a,b,c,d,e,f;
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		System.out.println("Enter a:"+a);
		
        b=sc.nextInt();
        System.out.println("Enter b:"+b);
        
        c=sc.nextInt();
        System.out.println("Enter c:"+c);
        
        d=sc.nextInt();
        System.out.println("Enter d:"+d);
        
        e=sc.nextInt();
        System.out.println("Enter e:"+e);
       
        f=sc.nextInt();
        System.out.println("Enter f1:"+f);
        
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					if(a>e)
					{
						if(a>f)
						{
							System.out.println(a+"A is greater");
						}
						else
						{
							System.out.println(f+"F is greater");
						}
					}
					
					else
					{
						if(e>f)
						{
							System.out.println(e+"E is greater");
						}
					}
				}
				
				else
				{
					if(d>e)
					{
						if(d>f)
						{
							System.out.println(d+"D is greater");
						}
						else
						{
							System.out.println(f+"F is greater");
						}
					}
				}
			}
			
			else
			{
				if(c>d)
				{
					if(c>e)
					{
						if(c>f)
						{
							System.out.println(c+"C is greater");
						}
						else
						{
							System.out.println(f+"f is greater");
						}
					}
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					if(b>e)
					{
						if(b>f)
						{
							System.out.println(b+"B is greater");
						}
						else
						{
							System.out.println(f+"F is greater");
						}
					}
				}
			}
		}
	}
	
	
}