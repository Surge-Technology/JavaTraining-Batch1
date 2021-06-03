package overload;

public class overload {
	void poly(int i)
	{
		System.out.println("INTEGER IS CALLING");
	}
	void poly(double f)
	{
		System.out.println("DOUBLE IS CALLING");
	}
	void poly(String s)
	{
		System.out.println("STRING IS CALLING");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload ag=new overload();
		ag.poly(4.4);
		ag.poly(4);
		ag.poly("hello");

	}

}
