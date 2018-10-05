package com.capgemini.parking_lot;

public class Customer {
	private String ownerName;
	private String phoneNo;
	private String time;
	public Customer() {
		super();
	}
	public Customer(String ownerName, String phoneNo, String time) {
		super();
		this.ownerName = ownerName;
		this.phoneNo = phoneNo;
		this.time = time;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Customer [ownerName=" + ownerName + ", phoneNo=" + phoneNo
				+ ", time=" + time + "]";
	}
	

}
