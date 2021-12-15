package com.restdemo.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restdemo.project.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
