package com.classes;

import java.sql.Date;
import java.util.List;


public class Account {
	private String accountNo;
	private Customer primaryCustId;	
	private double balance;
	private String type;
	private Date dateOfAccount;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Customer getPrimaryCustId() {
		return primaryCustId;
	}
	public void setPrimaryCustId(Customer primaryCustId) {
		this.primaryCustId = primaryCustId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateOfAccount() {
		return dateOfAccount;
	}
	public void setDateOfAccount(Date dateOfAccount) {
		this.dateOfAccount = dateOfAccount;
	}
	public Account(String accountNo, Customer primaryCustId, double balance,
			String type, Date dateOfAccount) {
		super();
		this.accountNo = accountNo;
		this.primaryCustId = primaryCustId;
		this.balance = balance;
		this.type = type;
		this.dateOfAccount = dateOfAccount;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", primaryCustId="
				+ primaryCustId + ", balance=" + balance + ", type=" + type
				+ ", dateOfAccount=" + dateOfAccount + "]";
	}
	
}
