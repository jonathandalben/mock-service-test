package com.gatewayhotel.module.gh_check_out;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GH_Check_Out_Service {
	
	@Autowired
	private GH_Check_Out_Dao checkOutServiceDao;
	 
	public List<GH_Check_Out_Dto> getAllCheckOuts(){
		List<GH_Check_Out_Dto> checkOutList = new ArrayList<GH_Check_Out_Dto>();
		try {
			for(GH_Check_Out gco:checkOutServiceDao.getAllCheckOuts()) {
				System.out.println("checkpoint "+gco);
				checkOutList.add(new GH_Check_Out_Dto(gco));
			}
			return checkOutList;
		}catch(Exception e) {
			e.printStackTrace();
			return checkOutList;
		}
	}
	
	public Boolean insertNewCheckOut(){
		return checkOutServiceDao.insertNewCheckOut();
	}
	
	public Boolean updateCheckOut(){
		return checkOutServiceDao.updateCheckOut();
	}
	
	public List<GH_Check_Out_Dto> searchCheckOuts(String checkOutSearchField){
		List<GH_Check_Out_Dto> checkOutList = new ArrayList<GH_Check_Out_Dto>();
		try {
			for(GH_Check_Out gco:checkOutServiceDao.searchCheckOuts(checkOutSearchField)) {
				System.out.println("checkpoint "+gco);
				checkOutList.add(new GH_Check_Out_Dto(gco));
			}
			return checkOutList;
		}catch(Exception e) {
			e.printStackTrace();
			return checkOutList;
		}
	}

}
