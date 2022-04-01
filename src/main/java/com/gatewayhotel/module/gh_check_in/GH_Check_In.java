package com.gatewayhotel.module.gh_check_in;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gh_check_in")
public class GH_Check_In {
	 
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "ci_checkIn")
	private java.sql.Timestamp checkIn;
	
	@Column(name = "ci_room")
	private Integer room;

	@Column(name = "ci_customer")
	private Integer customer;
	
	@Column(name = "ci_customerGroup")
	private Integer customerGroup;

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

	@Override
	public String toString() {
		return "GH_Check_In [id=" + id + ", checkIn=" + checkIn + ", room=" + room + ", customer=" + customer
				+ ", customerGroup=" + customerGroup + "]";
	}
}
