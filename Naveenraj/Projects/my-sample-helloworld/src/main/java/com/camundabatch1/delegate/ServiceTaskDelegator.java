package com.camundabatch1.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ServiceTaskDelegator implements JavaDelegate
{
	public void execute(DelegateExecution execution) throws Exception
	{
		
	String inputname = (String) execution.getVariable("inputname");
	
	System.out.println("Name is : " +inputname);
	
 String empcompany = (String) execution.getVariable("empcompany");
	
	System.out.println("Employee Company is : " +empcompany);

	
	}
	
}
