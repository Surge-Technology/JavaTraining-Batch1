package com.camundabatch1.delegate;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class EmailApproveDelegator implements JavaDelegate
{
	public void execute(DelegateExecution execution) throws Exception
	{
		System.out.println("2nd workflow started");
		
		  String inputname = (String) execution.getVariable("inputname");
		  
		  //System.out.println("Name is : " +inputname);
		 
			/*
			 * 
			 * 
			 *
			 * 
			 * System.out.println("Company Name is : " +empname);
			 */
		//String empname = "naveenraj";
		
		 execution.setVariable("empname", inputname);
		 System.out.println("Name is : " +inputname);
		 
	String empcompany = "schwalltech";
	
	execution.setVariable("empcompany", empcompany);
	System.out.println("Name is : " +empcompany);
	
	//System.out.println("Company Name is : " +empcompany);
	
	
	
	}
	
}

