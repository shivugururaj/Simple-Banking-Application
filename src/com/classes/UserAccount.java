package com.classes;

public class UserAccount {
	private String  username;
	private String password;                                
	private Customer primaryCustId;                           
	private String roleid;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Customer getPrimaryCustId() {
		return primaryCustId;
	}
	public void setPrimaryCustId(Customer primaryCustId) {
		this.primaryCustId = primaryCustId;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public UserAccount(String username, String password, Customer primaryCustId,
			String roleid) {
		super();
		this.username = username;
		this.password = password;
		this.primaryCustId = primaryCustId;
		this.roleid = roleid;
	}
	public UserAccount() {
		super();
		// TODO Auto-generated constructor stub
	}     
	
}
