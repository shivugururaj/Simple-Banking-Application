package com.actions;

import java.sql.Date;

import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionSupport;

public class DepositAction extends ActionSupport{


	private String transactionId;
    private String toAccountNo;
    private double amount;
    private String paymentMode;
    private java.sql.Date transactionDate;
    private String fromAccount;
    
    
    
  









	public DepositAction() {
		super();
		// TODO Auto-generated constructor stub
	}













	public DepositAction(String transactionId, String toAccountNo,
			double amount, String paymentMode, Date transactionDate,
			String fromAccount) {
		super();
		this.transactionId = transactionId;
		this.toAccountNo = toAccountNo;
		this.amount = amount;
		this.paymentMode = paymentMode;
		this.transactionDate = transactionDate;
		this.fromAccount = fromAccount;
	}













	@Override
	public String toString() {
		return "DepositAction [transactionId=" + transactionId
				+ ", toAccountNo=" + toAccountNo + ", amount=" + amount
				+ ", paymentMode=" + paymentMode + ", transactionDate="
				+ transactionDate + ", fromAccount=" + fromAccount + "]";
	}













	public String getTransactionId() {
		return transactionId;
	}













	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}













	public String getToAccountNo() {
		return toAccountNo;
	}













	public void setToAccountNo(String toAccountNo) {
		this.toAccountNo = toAccountNo;
	}













	public double getAmount() {
		return amount;
	}













	public void setAmount(double amount) {
		this.amount = amount;
	}













	public String getPaymentMode() {
		return paymentMode;
	}













	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}













	public Date getTransactionDate() {
		return transactionDate;
	}













	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}













	public String getFromAccount() {
		return fromAccount;
	}













	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}













	public String execute()
	{
		System.out.println(transactionDate);

		IFacade ifobj=new Facade();
	if(ifobj.deposit(toAccountNo, amount, paymentMode, transactionDate,fromAccount )==true)
	{
		
		return "success";
	}
		
		return "failed";
	
}
	
}
