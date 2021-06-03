class Square
{
            int side1;
}
class Vignesh_Square
{
            public static void main (String args[])
            {
                        int area;
						int perimeter;
                        Square square = new Square();
                        square.side1=5;
						
						//Area of Square = side*side 
                        area=square.side1*square.side1;
                        System.out.println("Area of Square is : "+ area);
						
						// perimeter of square = 4*Sides;
						perimeter= 4 * square.side1;
						System.out.println("Perimeter of Square is : "+ perimeter);
            }
}