package com.carcom.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("car")
public class Car {
	
	@Id
	private String id;
	
	private String carName;
	
	private String variant;
	
	private String brandSid;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public String getBrandSid() {
		return brandSid;
	}

	public void setBrandSid(String brandSid) {
		this.brandSid = brandSid;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", carName=" + carName + ", variant=" + variant + "]";
	}
	
}
