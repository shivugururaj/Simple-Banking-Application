package com.actions;

import java.util.List;
import java.util.Map;

import com.classes.Transaction;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;

public class ViewDetailStatementAction {
	private String fromTransactionDate;
	private String toTransactionDate;
	private String fromAccount;
	public List<com.classes.Transaction> lt;
	private Map session;
	private String startingDate;
	private String accountNo;
	

	public String getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}



	@Override
	public String toString() {
		return "ViewDetailStatement1Action [fromTransactionDate="
				+ fromTransactionDate + ", toTransactionDate="
				+ toTransactionDate + ", fromAccount=" + fromAccount + ", lt="
				+ lt + ", session=" + session + ", startingDate="
				+ startingDate + "]";
	}



	public ViewDetailStatementAction(String fromTransactionDate,
			String toTransactionDate, String fromAccount, List<Transaction> lt,
			Map session, String startingDate) {
		super();
		this.fromTransactionDate = fromTransactionDate;
		this.toTransactionDate = toTransactionDate;
		this.fromAccount = fromAccount;
		this.lt = lt;
		this.session = session;
		this.startingDate = startingDate;
	}



	public String getFromTransactionDate() {
		return fromTransactionDate;
	}



	public void setFromTransactionDate(String fromTransactionDate) {
		this.fromTransactionDate = fromTransactionDate;
	}



	public String getToTransactionDate() {
		return toTransactionDate;
	}



	public void setToTransactionDate(String toTransactionDate) {
		this.toTransactionDate = toTransactionDate;
	}



	public String getFromAccount() {
		return fromAccount;
	}



	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}



	public List<com.classes.Transaction> getLt() {
		return lt;
	}



	public void setLt(List<com.classes.Transaction> lt) {
		this.lt = lt;
	}



	public Map getSession() {
		return session;
	}



	public void setSession(Map session) {
		this.session = session;
	}



	public String getStartingDate() {
		return startingDate;
	}



	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}



	public String execute(){

		IFacade ifc=new Facade();
		System.out.println(fromTransactionDate+" "+toTransactionDate);
		lt=ifc.detailStatement(fromTransactionDate,toTransactionDate,accountNo);
		System.out.println(ifc.detailStatement( fromTransactionDate, toTransactionDate, fromAccount));

		ActionContext cte=ActionContext.getContext();
		session=cte.getSession();
		session.put("lt",lt);
		if (lt!=null) {
			return "success";
		}
		else {
			return "error";
		}
		



	}



	public ViewDetailStatementAction() {
		super();
		
	}



}
