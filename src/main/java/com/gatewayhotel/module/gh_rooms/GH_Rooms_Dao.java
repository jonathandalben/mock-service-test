package com.gatewayhotel.module.gh_rooms;

import java.util.List;

public interface GH_Rooms_Dao {
	public List<GH_Rooms> getAllAvailableRooms();
	public Boolean insertNewRoom();
	public Boolean updateRoom();
	public List<GH_Rooms> searchRooms(String roomSearchField);
}
 