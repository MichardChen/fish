package com.framework.model;

import java.io.Serializable;
import java.util.Date;

public class BrandSeriesListModel implements Serializable{

	private Integer id;
	//
	private String brandId;
	//
	private String carSerial;
	//
	private String createTime;
	//
	private String updateTime;
	//
	private String createBy;
	//
	private String updateBy;
	
	private String flg;
	
	public String getFlg() {
		return flg;
	}
	public void setFlg(String flg) {
		this.flg = flg;
	}
	public Integer getId() {
		return id;
	}
	public String getBrandId() {
		return brandId;
	}
	public String getCarSerial() {
		return carSerial;
	}
	public String getCreateTime() {
		return createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public String getCreateBy() {
		return createBy;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public void setCarSerial(String carSerial) {
		this.carSerial = carSerial;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	
	
}
