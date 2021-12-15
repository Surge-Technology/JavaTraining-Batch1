package com.employedatabase.service;

import org.springframework.stereotype.Component;

import com.employedatabase.entity.Emp;



@Component
public interface EmpService {
	public Emp saveEmp(Emp emp);
	public Emp findByEmpId(int empId);
	//public Book deleteByBookId(int bookId);
	
}