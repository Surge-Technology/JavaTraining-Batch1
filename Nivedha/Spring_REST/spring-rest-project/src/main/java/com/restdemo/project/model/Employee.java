package com.restdemo.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Long id;
	
	private String employee_firstname;
	private String employee_lastname;
	private String employee_email;
	private String employee_mobile;
	private String employee_address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployee_firstname() {
		return employee_firstname;
	}
	public void setEmployee_firstname(String employee_firstname) {
		this.employee_firstname = employee_firstname;
	}
	public String getEmployee_lastname() {
		return employee_lastname;
	}
	public void setEmployee_lastname(String employee_lastname) {
		this.employee_lastname = employee_lastname;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	public String getEmployee_mobile() {
		return employee_mobile;
	}
	public void setEmployee_mobile(String employee_mobile) {
		this.employee_mobile = employee_mobile;
	}
	public String getEmployee_address() {
		return employee_address;
	}
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}
	
	
	

}
