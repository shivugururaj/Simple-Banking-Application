package com.Managers;

import java.util.List;

import com.classes.Account;
import com.classes.Address;
import com.classes.Cheque;
import com.classes.ChequeBook;
import com.classes.Customer;
import com.classes.UserAccount;

public interface IAdminManager {
	public UserAccount login(String username, String password);
	public boolean createAccount(Address addr, Customer cust, Account ac,
			UserAccount ua) ;
	public boolean linkAccount(String custId,String accno,String type,double balance)  ;
	public void status_cheque(String chequeno);
	public void status_chequebook(String chequeid);
	public List<Cheque> getAllCheque();
	public List<ChequeBook> getAllChequeBook();
}
