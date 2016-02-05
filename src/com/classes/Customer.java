package com.classes;

public class Customer {
	private String custId;
	private String firstName;
	private String secondName;
	private String surName;
	private String email;
	private long landline;
	private long mobile;
	private String panno;
	private Address addressId;
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public Address getAddressId() {
		return addressId;
	}
	public void setAddressId(Address addressId) {
		this.addressId = addressId;
	}
	public Customer(String custId, String firstName, String secondName,
			String surName, String email, long landline, long mobile,
			String panno, Address addressId) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.secondName = secondName;
		this.surName = surName;
		this.email = email;
		this.landline = landline;
		this.mobile = mobile;
		this.panno = panno;
		this.addressId = addressId;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName
				+ ", secondName=" + secondName + ", surName=" + surName
				+ ", email=" + email + ", landline=" + landline + ", mobile="
				+ mobile + ", panno=" + panno + ", addressId=" + addressId
				+ "]";
	}
	
	
}
