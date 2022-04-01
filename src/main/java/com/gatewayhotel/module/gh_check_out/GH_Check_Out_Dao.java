package com.gatewayhotel.module.gh_check_out;

import java.util.List;

public interface GH_Check_Out_Dao {
	public List<GH_Check_Out> getAllCheckOuts();
	public Boolean insertNewCheckOut();
	public Boolean updateCheckOut();
	public List<GH_Check_Out> searchCheckOuts(String checkOutSearchField);
}
 