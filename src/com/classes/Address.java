package com.classes;

public class Address {
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", plotNo=" + plotNo
				+ ", street=" + street + ", city=" + city + ", zip=" + zip
				+ ", state=" + state + "]";
	}
	private String addressId ;
	private int plotNo;
	private String street;
	private String city;
	private long zip;
	private String state;
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public int getPlotNo() {
		return plotNo;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addressId, int plotNo, String street, String city,
			long zip, String state) {
		super();
		this.addressId = addressId;
		this.plotNo = plotNo;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
