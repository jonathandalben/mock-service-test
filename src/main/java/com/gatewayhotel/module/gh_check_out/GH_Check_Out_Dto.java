package com.gatewayhotel.module.gh_check_out;

public class GH_Check_Out_Dto {

	private Integer id;
	private java.sql.Timestamp checkOut;
	private Integer room;
	private Integer customer;
	private Integer customerGroup;
	 
	public GH_Check_Out_Dto() {}
	public GH_Check_Out_Dto(GH_Check_Out co) {
		this.id = co.getId();
		this.checkOut = co.getCheckOut();
		this.room = co.getRoom();
		this.customer = co.getCustomer();
		this.customerGroup = co.getCustomerGroup();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public java.sql.Timestamp getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(java.sql.Timestamp checkOut) {
		this.checkOut = checkOut;
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
