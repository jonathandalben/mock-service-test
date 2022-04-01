package com.gatewayhotel.module.gh_customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GH_Customer_Service {
	
	@Autowired
	private GH_Customer_Dao customerServiceDao;
	
	public List<GH_Customer_Dto> getAllCustomers(){
		List<GH_Customer_Dto> customerList = new ArrayList<GH_Customer_Dto>();
		try {
			for(GH_Customer gc:customerServiceDao.getAllCustomers()) {
				System.out.println("checkpoint "+gc);
				customerList.add(new GH_Customer_Dto(gc));
			}
			return customerList;
		}catch(Exception e) {
			e.printStackTrace();
			return customerList;
		}
	} 
	
	public Boolean insertNewRoom(){
		return customerServiceDao.insertNewCustomer();
	}
	
	public Boolean updateRoom(){
		return customerServiceDao.updateCustomer();
	}
	
	public List<GH_Customer_Dto> searchRooms(String customerSearchField){
		List<GH_Customer_Dto> customerList = new ArrayList<GH_Customer_Dto>();
		try {
			for(GH_Customer gc:customerServiceDao.searchCustomer(customerSearchField)) {
				System.out.println("checkpoint "+gc);
				customerList.add(new GH_Customer_Dto(gc));
			}
			return customerList;
		}catch(Exception e) {
			e.printStackTrace();
			return customerList;
		}
	}

}
