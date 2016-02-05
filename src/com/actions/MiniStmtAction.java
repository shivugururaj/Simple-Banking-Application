package com.actions;
import java.util.List;
import java.util.Map;


import com.classes.Account;
import com.classes.Customer;
import com.classes.UserAccount;
import com.facade.Facade;
import com.facade.IFacade;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MiniStmtAction extends ActionSupport {
	private String accountNo;
	private double balance;
	private Map session;

	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "ViewBalanceAction [accountNo=" + accountNo + ", balance="
		+ balance + "]";
	}
	public MiniStmtAction(String accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public MiniStmtAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String execute(){
		try{
			System.out.println("mini stmt");
			IFacade ifobj=new Facade();
			ActionContext cte=ActionContext.getContext();
			session=cte.getSession();
			UserAccount userAccount=(UserAccount) session.get("ua");
			List<Account> account_list=ifobj.getAccountDetails(userAccount);
			System.out.println(account_list);
			//balance=ifobj.miniStatement("65");		
			//System.out.println(balance);
			session.put("list_account",account_list);
			
			
			return "success";
		}
		catch(Exception e)
		{
			return "error";
		}



	}


}





