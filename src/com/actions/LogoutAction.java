package com.actions;

import java.util.Map;

import com.classes.Customer;
import com.classes.UserAccount;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;

public class LogoutAction {
	
	private Map session;
	public String execute()
	{
		String ret=null;	
		ActionContext cte=ActionContext.getContext();
		session=cte.getSession();
		session.clear();		
		return "success";

	}

	

}
