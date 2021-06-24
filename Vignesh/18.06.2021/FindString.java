import java.util.ArrayList;
import java.util.Iterator;

public class FindString {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("Vicky");
		str.add("Arun");
		str.add("Santhosh");
		str.add("Naveen");
		str.add("Kiran");
				
		Iterator input = str.iterator();
		{
			
			while(input.hasNext())
			{
				String s=(String) input.next();
				if(s.length()==5)
				{
					System.out.println(s);
				}
	}
		}
	}
}