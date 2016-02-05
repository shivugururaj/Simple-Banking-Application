package com.actions;

import java.util.List;
import java.util.Map;
import com.facade.*;

import com.classes.Account;
import com.classes.UserAccount;
import com.opensymphony.xwork2.ActionContext;

public class RetrieveAction {
	
	private Account a;
	Map session;
	private List<Account> list;
	
	public String execute()
	
	{
		IFacade ifobj=new Facade();
		ActionContext ctx=ActionContext.getContext();
		
		session=ctx.getSession();
		UserAccount userAccount=(UserAccount) session.get("ua");		
		list=ifobj.viewDetails(userAccount.getPrimaryCustId().getCustId());
		session.put("list", list);
		System.out.println(list);
		if(list!=null)
			return "success";
		else 
			return "error";
		
	}
	
	public Account getA() {
		return a;
	}
	public void setA(Account a) {
		this.a = a;
	}
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public List<Account> getList() {
		return list;
	}
	public void setList(List<Account> list) {
		this.list = list;
	}
	
	
	
	

}
