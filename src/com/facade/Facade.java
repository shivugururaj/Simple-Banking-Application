package com.facade;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import oracle.jdbc.util.Login;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.Managers.AdminManager;
import com.Managers.CustomerManager;
import com.Managers.IAdminManager;
import com.Managers.ICustomerManager;
import com.classes.Account;
import com.classes.Address;
import com.classes.Cheque;
import com.classes.ChequeBook;
import com.classes.Customer;
import com.classes.Transaction;
import com.classes.UserAccount;




public class Facade implements IFacade{
	BeanFactory beanFactory;
	IAdminManager adminManager;
	ICustomerManager customerManager;
	public Facade() {
		// TODO Auto-generated constructor stub
		 beanFactory = new XmlBeanFactory(new ClassPathResource("BeanLocations.xml"));
		
		 adminManager=(AdminManager) beanFactory.getBean("adminManager");
		 customerManager= (CustomerManager) beanFactory.getBean("customerManager");
	}
	@Override
	public String login(String username, String password) {		
		String roleid= adminManager.login(username, password).getRoleid();		
		return roleid;
	}
	@Override
	public boolean createAccount(Address addr, Customer cust, Account ac,
			UserAccount ua) {
	
				return adminManager.createAccount(addr, cust, ac, ua);		
		
	}
	
	@Override
	public boolean linkAccount(String custId,String accno,String type,double balance)  {
		
		return adminManager.linkAccount(custId, accno, type, balance);
	}
	@Override
	public void status_cheque(String chequeno) {
		 adminManager.status_cheque(chequeno);
		
	}
	@Override
	public void status_chequebook(String chequeid) {
		adminManager.status_chequebook(chequeid);
		
	}
	@Override
	public UserAccount details(String username, String password) {
		
		return adminManager.login(username, password);
	}
	@Override
	public List<Cheque> getAllCheque() {
		
		return adminManager.getAllCheque();
	}
	@Override
	public List<ChequeBook> getAllChequeBook() {
		return adminManager.getAllChequeBook();
	}
/*
	public static void main(String[] args) {
		IFacade ifobj=new Facade();
		
		//Login
		//System.out.println(ifobj.login("admin", "123"));
		
		
		/*Create account	
		
		Address addr=new Address();
		Customer cust=new  Customer();
		Account ac=new  Account();
		UserAccount ua=new UserAccount();
		
		//addr.setAddressId("101");
		addr.setCity("mangalore");
		addr.setPlotNo(2212);
		addr.setState("karnataka");
		addr.setStreet("hosur road");
		addr.setZip(5666);
		System.out.println(addr);
		
		cust.setAddressId(addr);
		cust.setEmail("kd@gmail.com");
		cust.setFirstName("kd");
		cust.setLandline(24);
		cust.setMobile(766);
		cust.setPanno("B6YHGT");
		cust.setSecondName("xghn");
		cust.setSurName("gadia");
		
		ac.setAccountNo("1011");
		ac.setBalance(1121.11);
		
		SimpleDateFormat sf=new SimpleDateFormat("yy-MM-dd");
		try {
			java.util.Date utilDate=sf.parse("13-02-02");
			Date date_of_account=new java.sql.Date(utilDate.getTime());
			ac.setDateOfAccount(date_of_account);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}		
		
		ac.setPrimaryCustId(cust);
		ac.setType("SB");
		
		ua.setPassword("123");
		ua.setPrimaryCustId(cust);
		
		ua.setRoleid("2");
		ua.setUsername("admin");
		System.out.println(ifobj.createAccount(addr, cust, ac, ua));
		
			
		
		//Link account
		//System.out.println(ifobj.linkAccount("56", "2201", "Current", 2000));
		
		
		//cheque status
		//ifobj.status_cheque("CKQE12");	
		
		//cheque status
		ifobj.status_chequebook("1");	
		
	}
*/
	@Override
	public boolean transaction(String toAccountNo, double amount,
			String paymentMode, String transactionDate, String fromAccount) {
		return customerManager.transaction(toAccountNo, amount, paymentMode, transactionDate,fromAccount);
	}
	@Override
	
	public boolean deposit(String toAccountNo, double amount,
			String paymentMode, java.sql.Date  transactionDate, String fromAccount) {
		
		
		
	
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
        String strDate = sdf.format(cal.getTime());
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        sdf1.applyPattern("yy/mm/dd");
        java.util.Date date = new java.util.Date();
                    transactionDate= new java.sql.Date(date.getTime());
		
		// TODO Auto-generated method stub
		return customerManager.deposit(toAccountNo, amount, paymentMode,transactionDate,null);
	}
	
	public boolean withdraw(String toAccountNo, double amount,
			String paymentMode, java.sql.Date  transactionDate, String fromAccount) {
		
		
	
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
        String strDate = sdf.format(cal.getTime());
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        sdf1.applyPattern("yy/mm/dd");
        java.util.Date date = new java.util.Date();
                    transactionDate= new java.sql.Date(date.getTime());
		
		// TODO Auto-generated method stub
		return customerManager.withdraw(null, amount, paymentMode,transactionDate, fromAccount);
	}
	@Override	
	public double miniStatement(String accountNo) 
	{

		return customerManager.miniStatement(accountNo);
	}
	@Override
	public List<Transaction> detailStatement(String startingDate,
			String endingDate,String fromAccount) {
		return customerManager.detailStatement(startingDate, endingDate, fromAccount);
	}

	@Override
	public List<Cheque> chequeStatus(String toAccount) {
		return customerManager.chequeStatus(toAccount);
	}
	@Override
	public boolean chequeBookRequest(String accountNo,String status) {
		return customerManager.chequeBookRequest(accountNo,status);
	}
	@Override
	public List<Account> getAccountDetails(UserAccount ua) {
		
		return customerManager.getAccountDetails(ua);
	}
	@Override
	public List<Account> viewDetails(String custId) {
		return customerManager.viewDetails(custId);
	}
	@Override
	public boolean updatePassword(String password, String custId) {
		return customerManager.updatePassword(password, custId);
	}
	@Override
	public String generateInternetBankingPin(UserAccount ua) {
		return customerManager.generateInternetBankingPin(ua);
	}
	

	
}
