package com.gatewayhotel.module.gh_rooms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gh_rooms")
public class GH_Rooms {
	
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "r_roomNumber")
	private String roomNumber;

	@Column(name = "r_roomCategory")
	private String roomCategory;

	@Column(name = "r_roomRate")
	private String roomRate;

	@Column(name = "r_roomType")
	private String roomType;

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

	@Override
	public String toString() {
		return "GH_Rooms [id=" + id + ", roomNumber=" + roomNumber + ", roomCategory=" + roomCategory + ", roomRate="
				+ roomRate + ", roomType=" + roomType + "]";
	}

}
