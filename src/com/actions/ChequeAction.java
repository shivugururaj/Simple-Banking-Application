package com.actions;

import java.util.List;

import com.classes.Cheque;
import com.facade.Facade;

public class ChequeAction {
	List<Cheque> list_cheque;
	
	public List<Cheque> getList_cheque() {
		return list_cheque;
	}

	public void setList_cheque(List<Cheque> list_cheque) {
		this.list_cheque = list_cheque;
	}

	public String execute()
	{
		Facade ifobj = new Facade();
		list_cheque = ifobj.getAllCheque();
		System.out.println(list_cheque);
		return "success";
	}
}
