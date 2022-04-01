package com.gatewayhotel.module.gh_customer;

import java.util.List;

public interface GH_Customer_Dao {
	public List<GH_Customer> getAllCustomers();
	public Boolean insertNewCustomer();
	public Boolean updateCustomer();
	public List<GH_Customer> searchCustomer(String customerSearchField);
}
 