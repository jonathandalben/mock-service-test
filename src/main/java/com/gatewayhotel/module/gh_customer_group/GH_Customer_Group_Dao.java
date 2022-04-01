package com.gatewayhotel.module.gh_customer_group;

import java.util.List;

public interface GH_Customer_Group_Dao {
	public List<GH_Customer_Group> getAllCustomerGroups();
	public Boolean insertNewCustomerGroup();
	public Boolean updateCustomerGroup();
	public List<GH_Customer_Group> searchCustomerGroups(String customerGroupSearchField);
}
 