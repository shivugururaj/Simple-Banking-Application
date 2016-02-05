package com.actions;

import java.util.List;
import java.util.Map;

import com.classes.Account;
import com.classes.UserAccount;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;

public class ChequeBookRequestAction {

	private String accountNo;
	private String status;
	//private List<Account> list_acc;
	private Map session;
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	
	/*public List<Account> getList_acc() {
		return list_acc;
	}
	public void setList_acc(List<Account> list_acc) {
		this.list_acc = list_acc;
	}*/
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ChequeRequestAction [accountNo=" + accountNo + ", status="
		+ status + "]";
	}
	public ChequeBookRequestAction(String accountNo, String status) {
		super();
		this.accountNo = accountNo;
		this.status = status;
	}
	public ChequeBookRequestAction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String execute(){
		
			    IFacade ifc=new Facade();
			    ActionContext cte=ActionContext.getContext();
				session=cte.getSession();				
				UserAccount userAccount=(UserAccount) session.get("ua");
			  //  list_acc=ifc.getAccountDetails(userAccount);
			    //System.out.println("che bk req"+list_acc);
				System.out.println("ch bk req"+accountNo);
		        boolean lt=ifc.chequeBookRequest(accountNo,"not-issued");	
		        if (lt) {
		        	return "success";
				}
		        else {
					return "error";
				}
				
		       
	}
}
