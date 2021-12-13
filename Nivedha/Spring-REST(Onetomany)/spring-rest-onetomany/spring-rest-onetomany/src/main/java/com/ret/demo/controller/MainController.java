package com.ret.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ret.demo.model.Address;
import com.ret.demo.model.Employee;
import com.ret.demo.service.EmployeeService;

@RestController
public class MainController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/insertEmployeeEntity")
	public String insertEmployeeEntity(@RequestBody Employee emp)
	{
		return service.insertData(emp);
	}
	
	@PostMapping("/insertAddressEntity")
	public String insertAddressEntity(@RequestBody Address emppp)
	{
		return service.insertData1(emppp);
	}
	@GetMapping("/findall")
	public List<Employee> finddata()
	{
		return service.getAllData();
	}
	
	@PostMapping("/insert")
	public String insertData(@RequestBody Map<String,String> requestParams)
	{
		
		List<Address> addre=new ArrayList<>();
		
		Address address =new Address();
		
		address.setAddress_id(Long.parseLong(requestParams.get("address_id")));
		address.setAddress_type(requestParams.get("address_type"));
		address.setStreetname(requestParams.get("streetname"));
		address.setDistrictname(requestParams.get("districtname"));
		address.setPincode(requestParams.get("pincode"));
		
		addre.add(address);
		
		Employee emp=new Employee();
		emp.setEmployee_id(Long.parseLong(requestParams.get("employee_id")));
		emp.setEmployee_firstname(requestParams.get("employee_firstname"));
		emp.setEmployee_lastname(requestParams.get("employee_lastname"));
		emp.setEmployee_email(requestParams.get("employee_email"));
		emp.setEmployee_mobile(requestParams.get("employee_mobile"));
		emp.setAddress(addre);
		
		
		return service.insertData(emp);
	}
	

}
