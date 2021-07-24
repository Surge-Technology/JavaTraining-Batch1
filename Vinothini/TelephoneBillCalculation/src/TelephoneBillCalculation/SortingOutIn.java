package TelephoneBillCalculation;

import java.util.Comparator;

public class SortingOutIn implements Comparator<Phonebill> {



	@Override
	public int compare(Phonebill o1, Phonebill o2) {
		
		return o2.getFlag().compareTo(o1.getFlag());
	}

	

}



