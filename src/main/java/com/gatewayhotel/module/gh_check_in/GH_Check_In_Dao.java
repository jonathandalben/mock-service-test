package com.gatewayhotel.module.gh_check_in;

import java.util.List;

public interface GH_Check_In_Dao {
	public List<GH_Check_In> getAllCheckIns();
	public Boolean insertNewCheckIn();
	public Boolean updateCheckIn();
	public List<GH_Check_In> searchCheckIns(String checkInSearchField);
}
 