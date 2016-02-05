package com.actions;


import java.util.ArrayList;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;

import com.DAO.CustomerDAO;
import com.classes.*;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;


public class UpdateAction extends ActionSupport{
	private UserAccount ua;
	private Account a;
	private String custId;
	private String password;
	Map session;
	
	

	
	public UpdateAction(UserAccount ua, Account a, String custId,
			String password, Map session) {
		super();
		this.ua = ua;
		this.a = a;
		this.custId = custId;
		this.password = password;
		this.session = session;
	}




	public UserAccount getUa() {
		return ua;
	}




	public void setUa(UserAccount ua) {
		this.ua = ua;
	}




	public Account getA() {
		return a;
	}




	public void setA(Account a) {
		this.a = a;
	}




	public String getCustId() {
		return custId;
	}




	public void setCustId(String custId) {
		this.custId = custId;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public Map getSession() {
		return session;
	}




	public void setSession(Map session) {
		this.session = session;
	}




	public String execute()
	{
	IFacade ifobj=new Facade();
	 
	ActionContext cte=ActionContext.getContext();
	session=cte.getSession();
	UserAccount userAccount=(UserAccount) session.get("ua");
    custId=userAccount.getPrimaryCustId().getCustId();
    
    boolean res=ifobj.updatePassword(password,custId);
    
    
    if (res)
        return "success";
  
    
    	return "error";
    
	}	
		
	
	

	
	
	
	
	
	
	
	
	
	
}



	


