package TelephoneBillCalculation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;





public class BizPlan extends DefaultPlan{

	public BizPlan(int total_seconds) {
		super(total_seconds);
		
	}

	public static void main(String[] args) {

		List<Phonebill> bill =new ArrayList<>();
			
			bill.add(new Phonebill("01116262190","11/30/2005","07:37:53",780,"I",new StdCode("011",10)));
			bill.add(new Phonebill("01126701499","12/7/2005","07:44:54",139,"I",new StdCode("011",10))); 
			bill.add(new Phonebill("08088023725","12/5/2005","19:02:46",132,"O",new StdCode("080",45)));
			bill.add(new Phonebill("02288023725","12/16/2005","23:36:32",35,"I",new StdCode("022", 30)));
			bill.add(new Phonebill("04072445785","12/16/2005","23:20:06",23,"O",new StdCode("040", 40)));
			bill.add(new Phonebill("02297169232","12/1/2005", "18:25:25",499, "O",new StdCode("022", 30)));
			bill.add(new Phonebill("08097169232", "12/9/2005", "20:32:28",190, "I",new StdCode("080",45)));
			
			 Collections.sort(bill, new SortingOutIn());
			
			 System.out.println(bill);
			 
		Iterator<Phonebill>	 itr= bill.iterator();
		{
			while(itr.hasNext())
			{
				Phonebill billcast =itr.next();
			System.out.println(billcast);
			
			if(billcast.getFlag().equalsIgnoreCase("O"));
			{
				if(billcast.getDuration()>60)
				{
				double temp=	billcast.getDuration()-60;
			   double unit=	temp/60;
			double finalamount=	unit * unitCost;
			
			 System.out.println("Outgoing call cost:"+finalamount);
			 }
				}

			if(billcast.std.getStdCode().equalsIgnoreCase("080"))
			{
				double temp = billcast.getDuration();
			     double unit = temp/60;
			     double billamnt = unit * billcast.std.getSecondsperUnit();
			     System.out.println("Totall bill"+billamnt);     
			}
			
			if(billcast.std.getStdCode().equalsIgnoreCase("011"))
			{
				double temp = billcast.getDuration();
			     double unit = temp/60;
			     double billamnt = unit * billcast.std.getSecondsperUnit();
			     System.out.println("Totall bill"+billamnt);     
			}
			
			if(billcast.std.getStdCode().equalsIgnoreCase("022"))
			{
				double temp = billcast.getDuration();
			     double unit = temp/60;
			     double billamnt = unit * billcast.std.getSecondsperUnit();
			     System.out.println("Totall bill"+billamnt);     
			}
			
			if(billcast.std.getStdCode().equalsIgnoreCase("040"))
			{
				double temp = billcast.getDuration();
			     double unit = temp/60;
			     double billamnt = unit * billcast.std.getSecondsperUnit();
			     System.out.println("Totall bill"+billamnt);     
			}
			
		}
	}
	
}

public void std()
{
	List <StdCode> list = new ArrayList<> ();
	
	list.add(new StdCode("080",45));
	list.add(new StdCode("011",10));
	list.add(new StdCode("022", 30));
	list.add(new StdCode("040", 40));
	
	System.out.println("StdCode List"+list);
    
}
	}
	
	
		   
	




