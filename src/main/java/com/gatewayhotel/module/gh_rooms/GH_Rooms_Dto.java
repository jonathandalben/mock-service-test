package com.gatewayhotel.module.gh_rooms;


public class GH_Rooms_Dto {
	
	private Integer id;
	private String roomNumber;
	private String roomCategory;
	private String roomRate;
	private String roomType;
	
	public GH_Rooms_Dto() {}
	public GH_Rooms_Dto(GH_Rooms gr) {
		this.id = gr.getId();
		this.roomNumber = gr.getRoomNumber();
		this.roomCategory = gr.getRoomCategory();
		this.roomRate = gr.getRoomRate();
		this.roomType = gr.getRoomType();
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomCategory() {
		return roomCategory;
	}
	public void setRoomCategory(String roomCategory) {
		this.roomCategory = roomCategory;
	}
	public String getRoomRate() {
		return roomRate;
	}
	public void setRoomRate(String roomRate) {
		this.roomRate = roomRate;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
}
