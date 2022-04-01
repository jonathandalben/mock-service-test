package com.gatewayhotel.module.gh_customer;

public class GH_Customer_Dto {
	
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String salutation;
	private String mobile;
	private String phone;
	private Integer room;
	private Integer customerGroup;
	 
	public GH_Customer_Dto() {}
	public GH_Customer_Dto(GH_Customer c) {
		this.id = c.getId();
		this.firstName = c.getFirstName();
		this.lastName = c.getLastName();
		this.middleName = c.getMiddleName();
		this.salutation = c.getSalutation();
		this.mobile = c.getMobile();
		this.phone = c.getPhone();
		this.room = c.getRoom();
		this.customerGroup = c.getCustomerGroup();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getRoom() {
		return room;
	}
	public void setRoom(Integer room) {
		this.room = room;
	}
	public Integer getCustomerGroup() {
		return customerGroup;
	}
	public void setCustomerGroup(Integer customerGroup) {
		this.customerGroup = customerGroup;
	}
}
