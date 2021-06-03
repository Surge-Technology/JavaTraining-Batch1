package square;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.out.println("area:"+ square.area(4));
		System.out.println("circumference:"+square.circumference(6));
	}
		public static double area(int side)
		{
			double result=side*side;
			return result;
		}
		public static double circumference(int side)
		{
			double result=4*side;
			return result;
					
					
		}
	}
