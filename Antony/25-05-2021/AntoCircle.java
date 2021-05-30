package package1;

public class AntoCircle {
public static double Pi = 3.14; 
	public static void main(String[] args) {
		AntoCircle cir = new AntoCircle();
		System.out.println("area: "+cir.area(5));
		System.out.println("circumference: "+cir.circumference(6));
		// TODO Auto-generated method stub

	}
public double area(int radius)
{
	double result = Pi*radius*radius;
	return result;
}
public double circumference(int radius)
{
	double result = 2*Pi*radius;
	return result;
}
}

