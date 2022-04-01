package com.gatewayhotel.module.gh_customer_group;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GH_Customer_Group_Service {
	
	@Autowired
	private GH_Customer_Group_Dao customerGroupServiceDao;
	
	public List<GH_Customer_Group_Dto> getAllCustomerGroups(){
		List<GH_Customer_Group_Dto> customerGroupList = new ArrayList<GH_Customer_Group_Dto>();
		try {
			for(GH_Customer_Group gcg:customerGroupServiceDao.getAllCustomerGroups()) {
				System.out.println("checkpoint "+gcg);
				customerGroupList.add(new GH_Customer_Group_Dto(gcg));
			}
			return customerGroupList;
		}catch(Exception e) {
			e.printStackTrace();
			return customerGroupList;
		}
	} 
	
	public Boolean insertNewCustomerGroup(){
		return customerGroupServiceDao.insertNewCustomerGroup();
	}
	
	public Boolean updateCustomerGroup(){
		return customerGroupServiceDao.updateCustomerGroup();
	}
	
	public List<GH_Customer_Group_Dto> searchCustomerGroups(String customerGroupsSearchField){
		List<GH_Customer_Group_Dto> customerGroupList = new ArrayList<GH_Customer_Group_Dto>();
		try {
			for(GH_Customer_Group gcg:customerGroupServiceDao.searchCustomerGroups(customerGroupsSearchField)) {
				System.out.println("checkpoint "+gcg);
				customerGroupList.add(new GH_Customer_Group_Dto(gcg));
			}
			return customerGroupList;
		}catch(Exception e) {
			e.printStackTrace();
			return customerGroupList;
		}
	}

}
