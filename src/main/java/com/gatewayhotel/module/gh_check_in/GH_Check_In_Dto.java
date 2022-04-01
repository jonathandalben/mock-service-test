package com.gatewayhotel.module.gh_check_in;

public class GH_Check_In_Dto {

	private Integer id;
	private java.sql.Timestamp checkIn;
	private Integer room;
	private Integer customer;
	private Integer customerGroup;
	 
	public GH_Check_In_Dto() {}
	public GH_Check_In_Dto(GH_Check_In ci) {
		this.id = ci.getId();
		this.checkIn = ci.getCheckIn();
		this.room = ci.getRoom();
		this.customer = ci.getCustomer();
		this.customerGroup = ci.getCustomerGroup();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public java.sql.Timestamp getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(java.sql.Timestamp checkIn) {
		this.checkIn = checkIn;
	}
	public Integer getRoom() {
		return room;
	}
	public void setRoom(Integer room) {
		this.room = room;
	}
	public Integer getCustomer() {
		return customer;
	}
	public void setCustomer(Integer customer) {
		this.customer = customer;
	}
	public Integer getCustomerGroup() {
		return customerGroup;
	}
	public void setCustomerGroup(Integer customerGroup) {
		this.customerGroup = customerGroup;
	}
}
