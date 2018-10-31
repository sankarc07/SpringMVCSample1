package com.spring.domain;

import java.util.Date;

public class DineInForm {

	private String restaurantName; // combo
	private String restaurantType; // combo
//	@DateTimeFormat(pattern = "MM/dd/yyyy") // This is for bind Date with @ModelAttribute
	private Date reserveOn; // date
	private String reserveTime; // radio
	private String guestName; // string
	private String noOfGuest; // number

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantType() {
		return restaurantType;
	}

	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}

	public Date getReserveOn() {
		return reserveOn;
	}

	public void setReserveOn(Date reserveOn) {
		this.reserveOn = reserveOn;
	}

	public String getReserveTime() {
		return reserveTime;
	}

	public void setReserveTime(String reserveTime) {
		this.reserveTime = reserveTime;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getNoOfGuest() {
		return noOfGuest;
	}

	public void setNoOfGuest(String noOfGuest) {
		this.noOfGuest = noOfGuest;
	}

}
