package com.actions;

import java.util.List;
import java.util.Map;

import com.classes.Cheque;
import com.classes.UserAccount;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;

public class ChequeRequestAction {
	private Map session;
	private List<Cheque> list_cheque;
private String chequeNo;
	public String getChequeNo() {
	return chequeNo;
}
public void setChequeNo(String chequeNo) {
	this.chequeNo = chequeNo;
}
	public ChequeRequestAction() {
		Facade ifobj=new Facade();
		list_cheque=ifobj.getAllCheque(); 
		System.out.println(list_cheque);
		System.out.println("cheque request");
	}
	public List<Cheque> getList_cheque() {
		return list_cheque;
	}


	public void setList_cheque(List<Cheque> list_cheque) {
		this.list_cheque = list_cheque;
	}


	public Map getSession() {
		return session;
	}


	public void setSession(Map session) {
		this.session = session;
	}


	

	public String execute()
	{
		System.out.println("chereq");
		String ret=null;
		IFacade ifobj=new Facade();
		ActionContext cte=ActionContext.getContext();
		session=cte.getSession();
		UserAccount userAccount=(UserAccount) session.get("ua");
		System.out.println(chequeNo);
		ifobj.status_cheque(chequeNo);
		
			
		
		
		/*
		if (ifobj.linkAccount(userAccount.getPrimaryCustId().getCustId(), accountNo, type, balance)) {
			ret="success";
		}
		else {
			ret="error";
		}
	*/
		return "success";
	}

}
