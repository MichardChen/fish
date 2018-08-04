package com.framework.entity;

import java.io.Serializable;
import java.sql.Timestamp;



/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-23 13:43:22
 */
public class TBrandSeriesEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	//
	private String carSerial;
	//
	private Timestamp createTime;
	//
	private Timestamp updateTime;
	//
	private Integer createBy;
	//
	private Integer updateBy;
	
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
	public String getCarSerial() {
		return carSerial;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public Integer getCreateBy() {
		return createBy;
	}
	public Integer getUpdateBy() {
		return updateBy;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setCarSerial(String carSerial) {
		this.carSerial = carSerial;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	
}
