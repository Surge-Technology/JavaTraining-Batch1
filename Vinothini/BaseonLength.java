package Treesetdemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class BaseonLength {

	public static void main (String [] args) {
		TreeSet<String> ts = new TreeSet<String> (new Details1());
		ts.add ("rain");
		ts.add ("priya");
		ts.add ("vine");
		ts.add ("rune");
		ts.add ("mypassword");
		ts.add ("selva");
		
		Iterator it = ts.iterator ();
		
		while (it.hasNext ())
		{
			System.out.println (it.next ());
		}
	}
}

class Details1 implements Comparator
{
	@Override
	public int compare (Object o1, Object o2) {
		
		
		String s1 = (String) o1;
		String s2 = (String) o2;
		if(s1.length()>s2.length())
		{
		return +1;
		}
		else 
			if(s1.length() < s2.length())
			{
				return -1;
			}
		
		return 1;
	

	}

}
