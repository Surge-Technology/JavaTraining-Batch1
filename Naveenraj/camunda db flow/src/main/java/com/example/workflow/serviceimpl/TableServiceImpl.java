package com.example.workflow.serviceimpl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workflow.entity.EmpTable;

import com.example.workflow.repository.EmpTableRepository;



@Service
public class TableServiceImpl {

	
	
	 
	 
	 @Autowired
		private EmpTableRepository emptablerepo;

	public EmpTable addList(EmpTable newCompany) {
		EmpTable empdetails = emptablerepo.save(newCompany);
	return empdetails;
	
	}

	
	
	
}