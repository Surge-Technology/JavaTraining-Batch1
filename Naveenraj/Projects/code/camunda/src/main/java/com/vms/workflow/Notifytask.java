package com.vms.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Notifytask implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execute) throws Exception {
		System.out.println("Notify mail sent");
		
	}

}
