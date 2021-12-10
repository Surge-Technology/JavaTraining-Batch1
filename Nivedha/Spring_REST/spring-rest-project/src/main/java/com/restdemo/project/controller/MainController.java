package com.restdemo.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.project.model.Employee;
import com.restdemo.project.service.EmployeeService;

@RestController
public class MainController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/checking")
	public String insertData(@RequestBody Employee empp)
	{
		return service.listOfDataInsert(empp);
	}
	

}
