package billing;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	import java.util.Iterator;

	public class BizPlan extends DefaultPlan {

	 public BizPlan() {

	}

	 public void process()
	{
	List <PhoneNumber> set = new ArrayList<> ();

	set.add(new PhoneNumber("01116262190","11/30/2005","07:37:53",780,"I",new StdCode("011",10)));
	set.add(new PhoneNumber("01126701499","12/7/2005","07:44:54",139,"I",new StdCode("011",10)));
	set.add(new PhoneNumber("08088023725","12/5/2005","19:02:46",132,"O",new StdCode("080",45)));
	set.add(new PhoneNumber("02288023725","12/16/2005","23:36:32",35,"I",new StdCode("022", 30)));
	set.add(new PhoneNumber("04072445785","12/16/2005","23:20:06",23,"O",new StdCode("040", 40)));
	set.add(new PhoneNumber("02297169232","12/1/2005", "18:25:25",499, "O",new StdCode("022", 30)));
	set.add(new PhoneNumber("08097169232", "12/9/2005", "20:32:28",190, "I",new StdCode("080",45)));

	Collections.sort(set, new Sorting());


	 System.out.println(set);
	Iterator<PhoneNumber> itr = set.iterator();
	{
	while(itr.hasNext())
	{
	PhoneNumber ph=(PhoneNumber) itr.next();
	System.out.println(ph);
	if(ph.getFlag().equalsIgnoreCase("O"))
	{
	if(ph.getDuration()>60)
	{
	double temp = ph.getDuration()-60;
	double unit = temp/60;
	double finalamnt = unit * unitCost;
	System.out.println("Outgoing call cost:"+finalamnt);
	}
	}
	if(ph.std.getStdCode().equalsIgnoreCase("080"))
	{
	double temp = ph.getDuration();
	double unit = temp/60;
	double billamnt = unit * ph.std.getSecperunit();
	System.out.println("Totall bill"+billamnt);
	}
	if(ph.std.getStdCode().equalsIgnoreCase("011"))
	{
	double temp = ph.getDuration();
	double unit = temp/60;
	double billamnt = unit * ph.std.getSecperunit();
	System.out.println("Totall bill"+billamnt);
	}
	if(ph.std.getStdCode().equalsIgnoreCase("022"))
	{
	double temp = ph.getDuration();
	double unit = temp/60;
	double billamnt = unit * ph.std.getSecperunit();
	System.out.println("Totall bill"+billamnt);
	}
	if(ph.std.getStdCode().equalsIgnoreCase("040"))
	{
	double temp = ph.getDuration();
	double unit = temp/60;
	double billamnt = unit * ph.std.getSecperunit();
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


