package com.example.workflow.serviceimpl;





import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workflow.entity.EmpTable;

import com.example.workflow.repository.EmpTableRepository;





@Service
public class TableServiceImpl  {
	@Autowired private RuntimeService runtimeService;
	 @Autowired
		private EmpTableRepository emptablerepo;

	public EmpTable addList(EmpTable newCompany) {
		 
		EmpTable empdetails = emptablerepo.save(newCompany);
		runtimeService.startProcessInstanceByKey("camundaflow");
	return empdetails;
	}




}


