package com.classes;

import java.util.Date;

public class Cheque {
	private String chequeNo;
	private String toaccountNo;
	private String fromAccount;
	private String status;
	private double amount;
	private Date dateOfClearence;
	public Cheque(String chequeNo, String toaccountNo, String fromAccount,
			String status, double amount, Date dateOfClearence) {
		super();
		this.chequeNo = chequeNo;
		this.toaccountNo = toaccountNo;
		this.fromAccount = fromAccount;
		this.status = status;
		this.amount = amount;
		this.dateOfClearence = dateOfClearence;
	}

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getToaccountNo() {
		return toaccountNo;
	}

	public void setToaccountNo(String toaccountNo) {
		this.toaccountNo = toaccountNo;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDateOfClearence() {
		return dateOfClearence;
	}

	public void setDateOfClearence(Date dateOfClearence) {
		this.dateOfClearence = dateOfClearence;
	}

	public Cheque() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cheque [chequeNo=" + chequeNo + ", toaccountNo=" + toaccountNo
				+ ", fromAccount=" + fromAccount + ", status=" + status
				+ ", amount=" + amount + ", dateOfClearence=" + dateOfClearence
				+ "]";
		
		
	}

	
	
	

}

