package com.gatewayhotel.module.gh_rooms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GH_Rooms_Service {
	
	@Autowired
	private GH_Rooms_Dao roomServiceDao;
	
	public List<GH_Rooms_Dto> getAllAvailableRooms(){
		List<GH_Rooms_Dto> roomList = new ArrayList<GH_Rooms_Dto>();
		try {
			for(GH_Rooms gr:roomServiceDao.getAllAvailableRooms()) {
				System.out.println("checkpoint "+gr);
				roomList.add(new GH_Rooms_Dto(gr));
			}
			return roomList;
		}catch(Exception e) {
			e.printStackTrace();
			return roomList;
		}
	}
	
	public Boolean insertNewRoom(){
		return roomServiceDao.insertNewRoom();
	} 
	
	public Boolean updateRoom(){
		return roomServiceDao.updateRoom();
	}
	
	public List<GH_Rooms_Dto> searchRooms(String roomSearchField){
		List<GH_Rooms_Dto> roomList = new ArrayList<GH_Rooms_Dto>();
		try {
			for(GH_Rooms gr:roomServiceDao.searchRooms(roomSearchField)) {
				System.out.println("checkpoint "+gr);
				roomList.add(new GH_Rooms_Dto(gr));
			}
			return roomList;
		}catch(Exception e) {
			e.printStackTrace();
			return roomList;
		}
	}

}
