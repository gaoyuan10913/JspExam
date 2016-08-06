package com.hand.entity;

import java.util.Date;

public class City {
	private int cityID;
	private String city;
	private int countryID;
	private Date lastUpdate;

	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCountryID() {
		return countryID;
	}

	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
