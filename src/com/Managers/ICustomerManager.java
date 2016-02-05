package com.Managers;

import java.util.Date;
import java.util.List;

import com.classes.Account;
import com.classes.Cheque;
import com.classes.Transaction;
import com.classes.UserAccount;

public interface ICustomerManager {
	
	public String login(String username, String password);
	
	public boolean transaction(String toAccountNo,double amount,String paymentMode,String transactionDate,String fromAccount);
	public boolean deposit(String toAccountNo,double amount,String paymentMode,java.sql.Date transactionDate,String fromAccount);

	public boolean withdraw(String toAccountNo, double amount, String paymentMode,
			java.sql.Date transactionDate, String fromAccount);

	public double miniStatement(String accountNo);
	public List<Transaction> detailStatement(String startingDate,String endingDate,String fromAccount);

	public List<Cheque> chequeStatus(String toAccountNo);	
	public boolean chequeBookRequest(String accountNo,String status);
	public List<Account> getAccountDetails(UserAccount ua);
	
	public List<Account> viewDetails(String custId);
	public boolean updatePassword(String password, String custId);
	public String generateInternetBankingPin(UserAccount ua);
}
