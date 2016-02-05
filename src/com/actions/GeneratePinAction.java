package com.actions;

import java.util.Map;

import com.classes.UserAccount;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;

public class GeneratePinAction {
	private Map session;

	private String gen=null;
	


	public String getGen() {
		return gen;
	}


	public void setGen(String gen) {
		this.gen = gen;
	}


	public Map getSession() {
		return session;
	}


	public void setSession(Map session) {
		this.session = session;
	}





	public String execute()
	{
		String ret=null;
		IFacade ifobj=new Facade();
		ActionContext cte=ActionContext.getContext();
		session=cte.getSession();
		System.out.println("session"+session.get("ua"));
		UserAccount userAccount=(UserAccount) session.get("ua");
		
		 gen=ifobj.generateInternetBankingPin(userAccount);
		 System.out.println("Action"+gen);
		if (gen!=null) {
			ret="success";
		}
		else {
			ret="error";
		}


		return ret;
	}

}
