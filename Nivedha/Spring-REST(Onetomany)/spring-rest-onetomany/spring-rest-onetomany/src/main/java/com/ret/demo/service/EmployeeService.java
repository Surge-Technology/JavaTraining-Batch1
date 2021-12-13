package com.ret.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ret.demo.model.Address;
import com.ret.demo.model.Employee;
import com.ret.demo.repo.AddressRepo;
import com.ret.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo emp_repo;
	
	@Autowired
	private AddressRepo add_repo;
	
	public String insertData(Employee emp)
	{
		emp_repo.save(emp);
		return "Inserted Successfully";
	}
	
	public String insertData1(Address emp1)
	{
		add_repo.save(emp1);
		return "Inserted Successfully";
	}

	public List<Employee> getAllData() {
	
		return emp_repo.findAll();
	}

}
