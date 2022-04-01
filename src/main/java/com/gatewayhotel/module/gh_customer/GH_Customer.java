package com.gatewayhotel.module.gh_customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gh_customer")
public class GH_Customer {
	
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "c_firstName")
	private String firstName;
	
	@Column(name = "c_lastName")
	private String lastName;
	 
	@Column(name = "c_middleName")
	private String middleName;
	
	@Column(name = "c_salutation")
	private String salutation;
	
	@Column(name = "c_mobile")
	private String mobile;
	
	@Column(name = "c_phone")
	private String phone;
	
	@Column(name = "c_room")
	private Integer room;
	
	@Column(name = "c_customerGroup")
	private Integer customerGroup;

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

	@Override
	public String toString() {
		return "GH_Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", salutation=" + salutation + ", mobile=" + mobile + ", phone=" + phone + ", room="
				+ room + ", customerGroup=" + customerGroup + "]";
	}

}
