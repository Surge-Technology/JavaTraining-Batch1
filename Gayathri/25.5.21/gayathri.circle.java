package circlee;

public class circle {
	int r=10;
	static double pi=3.14;

	public static void main(String[] args) {
		circle obj =new circle();
		System.out.println("area:"+obj.area(6));
		System.out.println("circumference:"+obj.circumference(8));
	  }
	public double area(int r)
	{
		double result=pi*r*r;
		return result;
	}
	public double circumference(int r)
	{
		double result=2*pi*r;
		return result;
	}
	}