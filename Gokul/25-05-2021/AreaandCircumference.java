public class AreaandCircumference {

	public static void main(String args[])
	{
		Circle c=new Circle();
		c.area();
		c.circumference();
		Rectangle r= new Rectangle();
		r.area();
		r.circumference();
		Triangle t=new Triangle();
		t.area();
		t.circumference();
		Square s1= new Square();
		s1.circumference();
		Square.area();
	}
}

class Circle {
	
int r=3;
double pi=3.14;

void area()
{
	double area= pi*r*r;
	
	System.out.println("area of circle:"+area);
}

void circumference()
{
	double circumference=2*pi*r;
	
	System.out.println("circumference of circle:"+circumference);
}
}

class Rectangle {

	int length=3;
	int width=4;
	
	void area()
	{
		int area = length*width;
		
		System.out.println("area of rectangle:"+area);
	}

	void circumference()
	{
		int circumference=2*(length+width);
		
		System.out.println("circumference of rectangle:"+circumference);
	}
}

class Triangle {
	int b=4,h=5;
	int l1=1,l2=2,l3=3;
	
	void area()
	{
		int area = (b*h)/2;
		
		System.out.println("area of triangle:"+area);
	}

	void circumference()
	{
		int circumference=l1+l2+l3;
		
		System.out.println("circumference of triangle:"+circumference);
	}

}

class Square {
	
	int side=2;

	static void area()
	{
		Square s=new Square(); 
		int area =s.side*s.side;
		
		System.out.println("area of square:"+area);
	}

	void circumference()
	{
		int circumference=4*side;
		
		System.out.println("circumference of square:"+circumference);
	}
}