package com.actions;

import java.util.List;
import java.util.Map;

import com.classes.Cheque;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;

public class ChequeStatusAction {
	

	private String accountNo;
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	private Map session;

	private List<com.classes.Cheque> lt;

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	
	public List<com.classes.Cheque> getLt() {
		return lt;
	}

	public void setLt(List<com.classes.Cheque> lt) {
		this.lt = lt;
	}

	
public ChequeStatusAction() {
		super();
		// TODO Auto-generated constructor stub
	}

public ChequeStatusAction(String toAccountNo, List<Cheque> lt) {
		super();
		
		this.lt = lt;
	}

@Override
	public String toString() {
		return "DepositedChequeStatusAction "
				+ ", lt=" + lt + "]";
	}

public String execute(){
       
	
	    IFacade ifc=new Facade();
        lt=ifc.chequeStatus(accountNo);
        System.out.println(ifc.chequeStatus( accountNo));
        ActionContext cte=ActionContext.getContext();
        session=cte.getSession();
        session.put("lt",lt);
         return "success";
}

}

