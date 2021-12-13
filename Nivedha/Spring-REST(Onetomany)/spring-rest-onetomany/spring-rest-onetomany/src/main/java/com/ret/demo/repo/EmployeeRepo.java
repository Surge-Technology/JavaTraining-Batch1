package com.ret.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ret.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
