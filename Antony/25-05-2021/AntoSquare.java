package package1;

public class AntoSquare {

	public static void main(String[] args) {
		System.out.println("area: "+ AntoSquare.area(4));
		System.out.println("circumference: "+AntoSquare.circumference(5));

	}
public static double area(int a)
{
	double result = a*a;
	return result;
}
public static double circumference(int a)
{
	return 4*a;
}
}
