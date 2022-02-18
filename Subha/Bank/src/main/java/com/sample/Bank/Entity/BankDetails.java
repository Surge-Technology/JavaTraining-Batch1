package com.sample.Bank.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankDetails {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BankDetails() {
	}
	public BankDetails(int id, String name, long accountNum, String accountType) {
		this.id = id;
		this.name = name;
		this.accountNum = accountNum;
		this.accountType = accountType;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Id
	private int id;
	private String name;
	private long accountNum;
	private String accountType;

}
