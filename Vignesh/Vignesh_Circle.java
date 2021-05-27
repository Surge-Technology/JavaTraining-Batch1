class Vignesh_Circle{
		static	double radius = 3.5, pi = 3.142;

	public static void main (String[] args){
				System.out.println("Area and Perimeter of 3.5cm circle is");

		// area of circle = pi * radius * radius
		// double data type is used for decimal values
		double area = pi * radius * radius;
		System.out.println("Area :" + area);
		
		// circumference of a circle = 2 * pi * radius
		double circumference = 2 * pi * radius;
		System.out.println("Circumference :" + circumference);
	}
}