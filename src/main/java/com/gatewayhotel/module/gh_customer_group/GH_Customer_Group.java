package com.gatewayhotel.module.gh_customer_group;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gh_customer_group")
public class GH_Customer_Group {
	
	@Id
	@Column(name = "id")
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "GH_Customer_Group [id=" + id + "]";
	}

}
