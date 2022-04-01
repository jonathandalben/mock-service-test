package com.gatewayhotel.module.gh_customer_group;

public class GH_Customer_Group_Dto {
	
	
	private Integer id;
	 
	public GH_Customer_Group_Dto() {}
	public GH_Customer_Group_Dto(GH_Customer_Group cg) {
		this.id = cg.getId();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
