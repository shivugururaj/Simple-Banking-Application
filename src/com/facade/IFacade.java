package com.facade;

import java.util.List;

import com.classes.Account;
import com.classes.Address;
import com.classes.Cheque;
import com.classes.ChequeBook;
import com.classes.Customer;
import com.classes.UserAccount;

public interface IFacade {
	//Admin
	public String login(String username,String password);
	public UserAccount details(String username,String password);
	public boolean createAccount(Address addr, Customer cust, Account ac,
			UserAccount ua);
	public boolean linkAccount(String custId,String accno,String type,double balance);
	public void status_cheque(String chequeno);
	public void status_chequebook(String chequeid);
	public List<Cheque> getAllCheque();
	public List<ChequeBook> getAllChequeBook();
	
	
	//Customer
	public boolean transaction(String toAccountNo,double amount,String paymentMode,String transactionDate,String fromAccount);	
	public boolean deposit(String toAccountNo,double amount,String paymentMode,java.sql.Date transactionDate,String fromAccount);
	public boolean withdraw(String toAccountNo, double amount,
			String paymentMode, java.sql.Date transactionDate,
			String fromAccount);
	
	
	public double miniStatement(String accountNo);
	public List<com.classes.Transaction> detailStatement(String startingDate,String endingDate,String fromAccount);
	public List<Cheque> chequeStatus(String toAccountNo);	
	public boolean chequeBookRequest(String accountNo,String status);
	public List<Account> getAccountDetails(UserAccount ua);
	
	public List<Account> viewDetails(String custId);
	public boolean updatePassword(String password,String custId);
	
	public String generateInternetBankingPin(UserAccount ua);
}
