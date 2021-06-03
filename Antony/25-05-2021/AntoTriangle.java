package package1;

public class AntoTriangle {

	public static void main(String[] args) {
		System.out.println(AntoTriangle.area(5, 5));
		AntoTriangle tri = new AntoTriangle();
		System.out.println("Perimeter of triangle: "+tri.perimeter(5, 5, 5));
	}
public static float area(int breadth, int height)
{
	float result = (float) (0.5*breadth*height);
	return result;
}
public double perimeter(int a, int b, int c)
{
	double result = a+b+c;
	return result;
}
}
