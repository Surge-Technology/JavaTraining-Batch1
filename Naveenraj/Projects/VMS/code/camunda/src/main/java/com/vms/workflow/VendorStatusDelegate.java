package com.vms.workflow;




import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import com.vms.camunda.integrator.VMSService;
import com.vms.camunda.integrator.VMSServiceImpl;




public class VendorStatusDelegate implements JavaDelegate {
	
	private VMSService vmsService;

	@Override
	public void execute(DelegateExecution execution) throws Exception {

	
		System.out.println("VendorStatusDelegate Progressing....");
		String vendorStatus = (String)execution.getVariable("vendorStatus");
		String pId = execution.getProcessInstanceId();
		System.out.println("VendorStatusDelegate Progressing...."+pId);
		
		vmsService = new VMSServiceImpl();
		
		if(vendorStatus.equalsIgnoreCase("APPROVED")) {
			//vmsService.sendApproveEmail();
			System.out.println("........Approved Email Sent Success.................");
			vmsService.updatePIDStatus(pId, "APPROVED");
		}else if(vendorStatus.equalsIgnoreCase("REJECTED")) {
			//vmsService.sendRejectEmail();
			vmsService.updatePIDStatus(pId, "REJECTED");
			System.out.println("........Reject Email Sent Success.................");
		}
		
		System.out.println("VendorStatusDelegate Completed...."+pId);
		
		
       
		  

	}

}
