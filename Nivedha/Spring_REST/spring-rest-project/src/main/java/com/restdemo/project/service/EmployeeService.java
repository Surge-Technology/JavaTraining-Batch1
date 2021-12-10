package com.restdemo.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restdemo.project.model.Employee;
import com.restdemo.project.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public String listOfDataInsert(Employee emp)
	{
		repo.save(emp);
		return "Inserted Succesfully";
	}

}
