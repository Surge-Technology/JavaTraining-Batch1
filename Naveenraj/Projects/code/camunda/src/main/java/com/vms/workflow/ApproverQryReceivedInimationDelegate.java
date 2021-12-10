package com.vms.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import com.vms.camunda.integrator.VMSService;
import com.vms.camunda.integrator.VMSServiceImpl;

import org.camunda.bpm.engine.impl.RuntimeServiceImpl;
import org.camunda.bpm.engine.impl.runtime.*;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.RuntimeService;

public class ApproverQryReceivedInimationDelegate implements JavaDelegate {
	
	private VMSService vmsService;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		
		
		
		System.out.println("ApproverQryReceivedInimationDelegate Called....");
		
		
		String vendorReply = (String)execution.getVariable("vendorReply");
		
		System.out.println("vendorReply..:"+vendorReply);
		
		
		
		  

	}

}
