package com.example.workflow.controller;







import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.RestController;


import com.example.workflow.entity.EmpTable;


import com.example.workflow.serviceimpl.TableServiceImpl;






@RestController

public class VendorCompanyController {


	@Autowired
	private TableServiceImpl tableService;
	 
	@Autowired private RuntimeService runtimeService; 
	 @Autowired
	  private ProcessEngine camunda; 
	 @Autowired
	  private EmpTable emptable; 
	
	 
	@PostMapping
	    public  ResponseEntity<EmpTable> addList(@RequestBody EmpTable empdetail)
	    {
		 EmpTable updated = tableService.addList(empdetail);
				 //runtimeService.startProcessInstanceByKey("camundaflow");
			  
		 //String PONewStatus = "InProgress";
		// List<EmpTable> EmpTable = start.getAllVendorCompanyByStatuspo("NEW");
		 
			//ProcessInstanceDto processInstanceDto = camundaProcessInstanceService
			//.startProcessDefinitionsPO("camundaflow", purchaseOrder.getId());
		
		// List<EmpTable> EmpTable = addList("NEW");
		      // runtimeService.startProcessInstanceByKey("camundaflow");
			
	        return new ResponseEntity<EmpTable>(updated, new HttpHeaders(), HttpStatus.CREATED);
	        
	        
	    }
	 
	}
