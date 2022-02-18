package com.carcom.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("car_brand")
public class CarBrand {
	@Id
	private String id;
	
	private String manufacturer;
	private String sid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
		return "CarBrand [id=" + id + ", manufacturer=" + manufacturer + ", sid=" + sid + "]";
	}
}
