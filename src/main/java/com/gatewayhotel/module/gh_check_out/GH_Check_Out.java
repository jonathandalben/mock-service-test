package com.gatewayhotel.module.gh_check_out;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gh_check_out")
public class GH_Check_Out {
	 
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "co_checkOut")
	private java.sql.Timestamp checkOut;
	
	@Column(name = "co_room")
	private Integer room;

	@Column(name = "co_customer")
	private Integer customer;
	
	@Column(name = "co_customerGroup")
	private Integer customerGroup;

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

	@Override
	public String toString() {
		return "GH_Check_Out [id=" + id + ", checkOut=" + checkOut + ", room=" + room + ", customer=" + customer
				+ ", customerGroup=" + customerGroup + "]";
	}

}
