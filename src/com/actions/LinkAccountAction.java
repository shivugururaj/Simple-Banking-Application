package com.actions;

import java.util.Map;

import com.classes.UserAccount;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;

public class LinkAccountAction {
	private Map session;
	private double balance;
	private String type;
	private String accountNo;
	private String custId;
	
	public String getCustId() {
		return custId;
	}


	public void setCustId(String custId) {
		this.custId = custId;
	}


	public Map getSession() {
		return session;
	}


	public void setSession(Map session) {
		this.session = session;
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


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String execute()
	{
		String ret=null;
		IFacade ifobj=new Facade();
		ActionContext cte=ActionContext.getContext();
		session=cte.getSession();
		UserAccount userAccount=(UserAccount) session.get("ua");

		if (ifobj.linkAccount(custId, accountNo, type, balance)) {
			ret="success";
		}
		else {
			ret="error";
		}

/*		
		if (ifobj.linkAccount(userAccount.getPrimaryCustId().getCustId(), accountNo, type, balance)) {
			ret="success";
		}
		else {
			ret="error";
		}
	*/
		return ret;
	}

}
