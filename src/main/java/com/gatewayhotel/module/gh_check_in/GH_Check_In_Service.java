package com.gatewayhotel.module.gh_check_in;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GH_Check_In_Service {
	
	@Autowired
	private GH_Check_In_Dao checkInServiceDao;
	 
	public List<GH_Check_In_Dto> getAllCheckIns(){
		List<GH_Check_In_Dto> checkInList = new ArrayList<GH_Check_In_Dto>();
		try {
			for(GH_Check_In gci:checkInServiceDao.getAllCheckIns()) {
				System.out.println("checkpoint "+gci);
				checkInList.add(new GH_Check_In_Dto(gci));
			}
			return checkInList;
		}catch(Exception e) {
			e.printStackTrace();
			return checkInList;
		}
	}
	
	public Boolean insertNewCheckIn(){
		return checkInServiceDao.insertNewCheckIn();
	}
	
	public Boolean updateCheckIn(){
		return checkInServiceDao.updateCheckIn();
	}
	
	public List<GH_Check_In_Dto> searchCheckIns(String checkInSearchField){
		List<GH_Check_In_Dto> checkInList = new ArrayList<GH_Check_In_Dto>();
		try {
			for(GH_Check_In gci:checkInServiceDao.searchCheckIns(checkInSearchField)) {
				System.out.println("checkpoint "+gci);
				checkInList.add(new GH_Check_In_Dto(gci));
			}
			return checkInList;
		}catch(Exception e) {
			e.printStackTrace();
			return checkInList;
		}
	}

}
