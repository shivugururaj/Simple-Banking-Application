package com.Managers;

import java.util.Date;
import java.util.List;

import com.DAO.ICustomerDAO;
import com.classes.Account;
import com.classes.Cheque;
import com.classes.Transaction;
import com.classes.UserAccount;



public class CustomerManager implements ICustomerManager {
	private ICustomerDAO customerDao;

	public ICustomerDAO getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(ICustomerDAO customerDao) {
		this.customerDao = customerDao;
	}
/*	public String login(String username, String password) {		
		UserAccount ua=new UserAccount();
		ua.setUsername(username);
		ua.setPassword(password);		 
		return customerDao.login(ua);
	}
	*/

	@Override
	public boolean transaction(String toAccountNo, double amount,
			String paymentMode, String transactionDate, String fromAccount) {	
		
		
		return customerDao.transaction(toAccountNo,amount,paymentMode,transactionDate,fromAccount);
	}

	@Override
	public String login(String username, String password) {
		
			UserAccount ua=new UserAccount();
			ua.setUsername(username);
			ua.setPassword(password);		 
			return customerDao.login(ua);
		
	}

	@Override
	public boolean deposit(String toAccountNo, double amount,
			String paymentMode, java.sql.Date transactionDate, String fromAccount) {
		// TODO Auto-generated method stub
		return customerDao.deposit(toAccountNo,amount,paymentMode,transactionDate,fromAccount);
	}

	@Override
	public boolean withdraw(String toAccountNo, double amount, String paymentMode,
			java.sql.Date transactionDate, String fromAccount) {
		// TODO Auto-generated method stub
		return customerDao.withdraw(toAccountNo,amount,paymentMode,transactionDate,fromAccount);
	}

	@Override
	public double miniStatement(String accountNo)
    {
            return customerDao.miniStatement(accountNo);
    }

	@Override
	public List<Transaction> detailStatement(String startingDate,String endingDate,String fromAccount){
		return customerDao.detailStatement(startingDate, endingDate,fromAccount);
	}

	@Override
	public List<Cheque> chequeStatus(String toAccountNo)
	{
		return customerDao.chequeStatus(toAccountNo);
 
	}


	@Override
	public boolean chequeBookRequest(String accountNo,String status)
	{
		return customerDao.chequeBookRequest(accountNo,status);
	}

	@Override
	public List<Account> getAccountDetails(UserAccount ua) {

		return customerDao.getAccountDetails(ua);
	}

	@Override
	public List<Account> viewDetails(String custId) {
		return customerDao.viewDetails(custId);
	}

	@Override
	public boolean updatePassword(String password, String custId) {
		return customerDao.updatePassword(password,custId);
	}

	@Override
	public String generateInternetBankingPin(UserAccount ua) {
		return customerDao.generateInternetBankingPin(ua);
	}
	

	
	
	
	
}
