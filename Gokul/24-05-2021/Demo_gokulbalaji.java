public class Demo_gokulbalaji {
	
	public static void main(String args[])
	{
		Arithmatic a1= new Arithmatic(20,10);
		System.out.println(a1.add());
		System.out.println(a1.sub());
		System.out.println(a1.multiply());
		System.out.println(a1.division());
	}

}

class Arithmatic
{
int a,b;

Arithmatic(int a,int b)
{
	this.a = a;
	this.b = b;
}

int add()
{
	int c;
	c=a+b;
	return c;
}

int sub()
{
	int c;
	c=a-b;
	return c;
}

int multiply()
{
	int c;
	c=a*b;
	return c;
}

int division()
{
	int c;
	c=a/b;
	return c;
}

}