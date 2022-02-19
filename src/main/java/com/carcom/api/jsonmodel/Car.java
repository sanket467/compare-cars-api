package com.carcom.api.jsonmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {
	@JsonProperty("brandsid")
	private String brandSid;
	
	@JsonProperty("carName")
	private String carName;
	
	@JsonProperty("variant")
	private String variant;
	
	@JsonProperty("featureId")
	private String featureId;

	public String getBrandSid() {
		return brandSid;
	}

	public void setBrandSid(String brandSid) {
		this.brandSid = brandSid;
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

	public String getFeatureId() {
		return featureId;
	}

	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}

	@Override
	public String toString() {
		return "Car [brandSid=" + brandSid + ", carName=" + carName + ", variant=" + variant + ", featureId="
				+ featureId + "]";
	}
}
