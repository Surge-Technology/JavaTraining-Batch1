package package1;

public class AntoRectangle {

	public static void main(String[] args) {
		AntoRectangle rec = new AntoRectangle();
		System.out.println("area of rectangle: " +rec.area(5, 5));
		System.out.println("circumference of rectangle: "+rec.circumnference(9, 8));
	}
public double area(int length, int breadth)
{
	double result = length*breadth;
	return result;
}
public double circumnference (int length, int breadth)
{
	double result = 2*(length + breadth);
	return result;
    
}
}
