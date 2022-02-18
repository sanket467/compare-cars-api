package com.carcom.api.jsonmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brand {
	@JsonProperty("manufacturer")
	private String manufacturer;
	
	@JsonProperty("sid")
	private String sid;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Brand [manufacturer=" + manufacturer + ", sid=" + sid + "]";
	}
}
