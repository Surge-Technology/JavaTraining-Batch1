package billing;


	import java.util.Comparator;

	public class Sorting implements Comparator<PhoneNumber>{

	 @Override
	public int compare(PhoneNumber o1, PhoneNumber o2) {
	// TODO Auto-generated method stub

	return o2.getFlag().compareTo(o1.getFlag());
	}


	}


