package com.wipro.pack.bean;

public class Account {
	private int id;
	private String type;
	private double balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int id, String type, double balance) {
		super();
		this.id = id;
		this.type = type;
		this.balance = balance;
	}
	
}
