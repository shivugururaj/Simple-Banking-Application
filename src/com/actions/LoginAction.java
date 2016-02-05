package com.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.classes.Account;
import com.classes.Customer;
import com.classes.UserAccount;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	private List<Account> list_acc;
	private Map session;
	public List<Account> getList_acc() {
		return list_acc;
	}

	public void setList_acc(List<Account> list_acc) {
		this.list_acc = list_acc;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	private ArrayList<String> accNos=new ArrayList<String>();
	
	

	

	public String execute()
	{
		try {
			String ret=null;
			IFacade ifobj=new Facade();
			//Login
			//System.out.println(ifobj.login("admin", "123"));

			String role=null;
			role=ifobj.login(username,password);
			if (role!=null) {
				UserAccount useraccount=ifobj.details(username,password);
				ActionContext cte=ActionContext.getContext();
				
				session=cte.getSession();
				session.put("ua", useraccount);
				
				list_acc=ifobj.getAccountDetails(useraccount);
				session.put("accounts", list_acc);
				
				for(Account a:list_acc)
				{
					accNos.add(a.getAccountNo());
				}
				
				session.put("accNos",accNos);
				System.out.println(list_acc);
				if (role.equals("1")) {
					ret="success_admin";
				}
				else if (role.equals("2")) {
					ret="success_cust";
				}
				else {
					ret="error";
				}
			}
			else {
				ret="error";
			}
			return ret;
		} catch (Exception e) {
			return "error";
		}
		

	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
