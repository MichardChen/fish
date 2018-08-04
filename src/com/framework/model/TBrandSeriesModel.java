package com.framework.model;

import java.io.Serializable;

public class TBrandSeriesModel implements Serializable{
	
	private Integer id;
	//
	private Integer brandId;
	//
	private String carSerial;
	
	private int flg;
	
	
	public int getFlg() {
		return flg;
	}
	public void setFlg(int flg) {
		this.flg = flg;
	}
	public Integer getId() {
		return id;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public String getCarSerial() {
		return carSerial;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public void setCarSerial(String carSerial) {
		this.carSerial = carSerial;
	}
	
	

}
