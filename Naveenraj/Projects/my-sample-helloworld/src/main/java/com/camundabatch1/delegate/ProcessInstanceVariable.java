package com.camundabatch1.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ProcessInstanceVariable implements JavaDelegate
{
	public void execute(DelegateExecution execution) throws Exception
	{
		
	String inputname = (String) execution.getVariable("inputname");
	System.out.println("Name is : " +inputname);
	
    String company = (String) execution.getVariable("company");
	System.out.println("Company is : " +company);
	
    String role = (String) execution.getVariable("role");
	System.out.println("Role is : " +role);
	
	}
	
}

