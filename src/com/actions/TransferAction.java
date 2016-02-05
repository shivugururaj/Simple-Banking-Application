package com.actions;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.classes.Account;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionSupport;

public class TransferAction extends ActionSupport {

	
	private String transactionId;
    private String toAccountNo;
    private double amount;
    private String paymentMode;
    private String transactionDate;
    private String fromAccount;
    
    
    
  
	
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





	public String getTransactionDate() {
		return transactionDate;
	}





	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}





	public String getFromAccount() {
		return fromAccount;
	}





	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}





	public String execute() throws Exception
	{
		System.out.println(transactionDate);

		IFacade ifobj=new Facade();
	if(ifobj.transaction(toAccountNo, amount, paymentMode, transactionDate, fromAccount)==true)
	{
		
		return "success";
	}
	else
	{
		return "failed";
	}
	
	

		


	}


}