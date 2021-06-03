class Vignesh_Rectangle 
{
   public static void main(String args[]) 
 
    {   
		 float length= 5; 
         float breadth= 10;
    System.out.println("Rectangle length:" + length);     
    System.out.println("Rectangle Breadth:" + breadth);
	
	// area of Rectangle = length * breadth
        float  area=length*breadth;
		System.out.println("Area of Rectangle is: " + area); 

	// perimeter of rectangle = 2*(Length + breadth)
		float perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle is: " + perimeter);		
   
    }
}