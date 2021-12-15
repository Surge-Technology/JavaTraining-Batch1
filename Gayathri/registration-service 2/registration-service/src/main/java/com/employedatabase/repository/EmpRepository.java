package com.employedatabase.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employedatabase.entity.Emp;
@Repository
public interface EmpRepository extends CrudRepository<Emp,Serializable> {
	public Emp findByEmpId(int empId);
	//public Book deleteByBookId(int bookId);

}