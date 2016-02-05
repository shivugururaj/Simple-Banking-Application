package com.actions;

import java.util.List;

import com.classes.Cheque;
import com.classes.ChequeBook;
import com.facade.Facade;

public class ChequeBookAction {
	List<ChequeBook> list_chequebook;
	
	

	public List<ChequeBook> getList_chequebook() {
		return list_chequebook;
	}



	public void setList_chequebook(List<ChequeBook> list_chequebook) {
		this.list_chequebook = list_chequebook;
	}



	public String execute()
	{
		Facade ifobj = new Facade();
		list_chequebook = ifobj.getAllChequeBook();
		System.out.println(list_chequebook);
		return "success";
	}
}
