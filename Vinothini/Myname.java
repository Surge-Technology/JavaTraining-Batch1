package Treesetdemo;

import java.util.Comparator;

public class Myname implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		Employe nam =(Employe) o1;
		Employe nam2=(Employe) o2;
	int one=	nam.getId();
	int two=nam2.getId();
	
	if(one >two)
	{
		return 1;
	}
	else
	{
		return -1;
	}
//	return(o1.name).compareTo(o2.name);	
}}
 
