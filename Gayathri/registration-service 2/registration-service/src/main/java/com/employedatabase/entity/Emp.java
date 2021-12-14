package com.employedatabase.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Emp {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;

	@Column(name = "emp_name")
	private String empName;
	@Column(name = "emp_mail")
	private String empMail;
	

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "emp")
	@JsonManagedReference
	private Address address;


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpMail() {
		return empMail;
	}


	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	



	

}