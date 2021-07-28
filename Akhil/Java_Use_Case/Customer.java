package com.telecom.billing;

public class Customer {

	public Customer(double amount, int units, int outgoingSeconds) {
		super();
		this.amount = amount;
		this.units = units;
		this.outgoingSeconds = outgoingSeconds;

	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public int getOutgoingSeconds() {
		return outgoingSeconds;
	}

	public void setOutgoingSeconds(int outgoingSeconds) {
		this.outgoingSeconds = outgoingSeconds;
	}

	private double amount;
	private int units;
	private int outgoingSeconds;

}
