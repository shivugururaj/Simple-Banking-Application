package com.actions;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;



import com.classes.Account;
import com.classes.Address;
import com.classes.Customer;
import com.classes.UserAccount;
import com.facade.Facade;
import com.facade.IFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class CreateAccountAction extends ActionSupport{
	
	private Map session;
	private String city;
	private int plotNo;
	private String state;
	private String street;
	private long zip;
	private String email;
	private String firstName;
	private long landline;
	private long mobile;
	private String panno;
	private String secondName;
	private String accountNo;
	private double balance;
	private String dateOfAccount;
	private String type;
	private String role;
	private String password;
	private String surName; 
	
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getCity() {
		return city;
	}
	public int getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getDateOfAccount() {
		return dateOfAccount;
	}
	public void setDateOfAccount(String dateOfAccount) {
		this.dateOfAccount = dateOfAccount;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public long getLandline() {
		return landline;
	}
	public void setLandline(long landline) {
		this.landline = landline;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String execute()
	{
		
			String ret=null;
			IFacade ifobj=new Facade();
			Address addr=new Address();
			Customer cust=new  Customer();
			Account ac=new  Account();
			UserAccount ua=new UserAccount();
			
			
			addr.setCity(city);
			addr.setPlotNo(plotNo);
			addr.setState(state);
			addr.setStreet(street);
			addr.setZip(zip);
			//System.out.println(addr);
			
			cust.setAddressId(addr);
			cust.setEmail(email);
			cust.setFirstName(firstName);
			cust.setLandline(landline);
			cust.setMobile(mobile);
			cust.setPanno(panno);
			cust.setSecondName(secondName);
			cust.setSurName(surName);
			
			ac.setAccountNo(accountNo);
			ac.setBalance(balance);
			
			SimpleDateFormat sf=new SimpleDateFormat("yy-MM-dd");
			try {
				java.util.Date utilDate=sf.parse(dateOfAccount);
				Date date_of_account=new java.sql.Date(utilDate.getTime());
				ac.setDateOfAccount(date_of_account);
			} catch (Exception e) {
				
				e.printStackTrace();
			}		
			
			ac.setPrimaryCustId(cust);
			ac.setType("SB");
			
			ua.setPassword(password);
			ua.setPrimaryCustId(cust);
			
			ua.setRoleid(role);
			String username=null;
			try {
				username=firstName.substring(0, firstName.length()-1).concat("."+secondName.substring(0, secondName.length()-1)+"inb");
			} catch (Exception e) {
				e.printStackTrace();
			}
			 
			ua.setUsername(username);
			if (ifobj.createAccount(addr, cust, ac, ua)) {
				ret="success";
			}
			else {
				ret="error";
			}
		

	
		return ret;
	}

}
