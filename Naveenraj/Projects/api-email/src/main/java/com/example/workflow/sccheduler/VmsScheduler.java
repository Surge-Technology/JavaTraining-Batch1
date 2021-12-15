package com.example.workflow.sccheduler;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.camunda.bpm.engine.rest.dto.runtime.ProcessInstanceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.workflow.entity.PurchaseOrderItemList;
import com.example.workflow.integerator.CamundaProcessInstanceService;
import com.example.workflow.service.VendorCompanyService;
import com.example.workflow.util.*;


@Component
public class VmsScheduler {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	@Autowired
	private VendorCompanyService vendorCompanyService;
    @Value("${camunda.processname}") 
    private String processName;
	@Autowired
	private CamundaProcessInstanceService camundaProcessInstanceService;



	private String[] hostList = { "http://localhost:8080/rest/engine" };
	
	private boolean camundaAvalability = false;
	
	  
	  
	  private boolean getCamundaAvailability() {
	  
	  camundaAvalability = CamundaIntegrator.getServerStatus(hostList[0]);
	  
	  return camundaAvalability;}
	 
	  
	  
	 

	
	
	
	
	@Scheduled(fixedRate = 10000)
	public void startProcessDefnPOApproval() {

	System.out.println("Regular task performed at " + dateFormat.format(new Date()));
	System.out.println("Current Thread : {}" + Thread.currentThread().getName());
	if (getCamundaAvailability()) {
	System.out.println("Camunda is RUNNING...");

	String PONewStatus = "InProgress";
	List<PurchaseOrderItemList> purchaseorderList = vendorCompanyService.getAllVendorCompanyByStatuspo("NEW");
	if (null != purchaseorderList && purchaseorderList.size() > 0) {

	for (PurchaseOrderItemList purchaseOrder : purchaseorderList) {

	System.out.println("Vendor in NEW Status");

	ProcessInstanceDto processInstanceDto = camundaProcessInstanceService
	.startProcessDefinitionsPO("purchasedemo", purchaseOrder.getId());

	camundaProcessInstanceService.postPODataToWorkflow(processInstanceDto.getId(),purchaseOrder);

	 
	vendorCompanyService.updatePurchaseOrderStatus(purchaseOrder.getId(),PONewStatus );
	
	// mailUtil.sendCheckVendorStatusLink(vendor);

	}

	} else {
	System.out.println("No Vendor in NEW Status");
	}

} 
	  else { System.out.println("Camunda is DOWN..."); } }
	 




}


