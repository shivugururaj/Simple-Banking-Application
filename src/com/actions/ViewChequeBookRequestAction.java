package com.actions;

import java.util.List;
import java.util.Map;

import com.classes.Cheque;
import com.classes.ChequeBook;
import com.classes.UserAccount;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;

public class ViewChequeBookRequestAction {
	private Map session;
	private List<ChequeBook> list_chequebook;
private String bookId;
	




	public ViewChequeBookRequestAction() {
		Facade ifobj=new Facade();
		list_chequebook=ifobj.getAllChequeBook(); 
		System.out.println(list_chequebook);
		System.out.println("cheque book request");
}





public List<ChequeBook> getList_chequebook() {
		return list_chequebook;
	}





	public void setList_chequebook(List<ChequeBook> list_chequebook) {
		this.list_chequebook = list_chequebook;
	}





public String getBookId() {
	return bookId;
}


public void setBookId(String bookId) {
	this.bookId = bookId;
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
		System.out.println(bookId);
		ifobj.status_chequebook(bookId);
		
			
		
		
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
