package com.framework.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-27 14:45:48
 */
public class TCodemstEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String code;
	//
	private String name;
	//
	private Integer data1;
	//
	private String data2;
	//
	private String data3;
	//
	private String data4;
	//
	private String data5;
	//
	private String pcode;
	//
	private Date createTime;
	//
	private Date updateTime;
	//1--现存，0--以往
	private String status;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setData1(Integer data1) {
		this.data1 = data1;
	}
	/**
	 * 获取：
	 */
	public Integer getData1() {
		return data1;
	}
	/**
	 * 设置：
	 */
	public void setData2(String data2) {
		this.data2 = data2;
	}
	/**
	 * 获取：
	 */
	public String getData2() {
		return data2;
	}
	/**
	 * 设置：
	 */
	public void setData3(String data3) {
		this.data3 = data3;
	}
	/**
	 * 获取：
	 */
	public String getData3() {
		return data3;
	}
	/**
	 * 设置：
	 */
	public void setData4(String data4) {
		this.data4 = data4;
	}
	/**
	 * 获取：
	 */
	public String getData4() {
		return data4;
	}
	/**
	 * 设置：
	 */
	public void setData5(String data5) {
		this.data5 = data5;
	}
	/**
	 * 获取：
	 */
	public String getData5() {
		return data5;
	}
	/**
	 * 设置：
	 */
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	/**
	 * 获取：
	 */
	public String getPcode() {
		return pcode;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：1--现存，0--以往
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：1--现存，0--以往
	 */
	public String getStatus() {
		return status;
	}
}
