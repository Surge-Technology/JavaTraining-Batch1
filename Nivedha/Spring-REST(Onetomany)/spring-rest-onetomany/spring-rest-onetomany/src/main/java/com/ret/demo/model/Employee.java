package com.ret.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	private Long employee_id;
	private String employee_firstname;
	private String employee_lastname;
	private String employee_email;
	private String employee_mobile;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id_fk",referencedColumnName = "employee_id")
	
	private List<Address> address;
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public Long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
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
	
	
	
	

}
