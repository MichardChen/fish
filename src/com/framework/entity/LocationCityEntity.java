package com.framework.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-23 17:10:41
 */
public class LocationCityEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String cityid;
	//
	private String name;
	//
	private String cityupid;
	//
	private Integer pid;
	//
	private String citypath;
	//
	private String citytype;
	//
	private Integer citytypenum;
	//
	private String shortname;
	//
	private String spell;
	//
	private String areaid;
	//
	private String postcode;

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
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	/**
	 * 获取：
	 */
	public String getCityid() {
		return cityid;
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
	public void setCityupid(String cityupid) {
		this.cityupid = cityupid;
	}
	/**
	 * 获取：
	 */
	public String getCityupid() {
		return cityupid;
	}
	/**
	 * 设置：
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * 获取：
	 */
	public Integer getPid() {
		return pid;
	}
	/**
	 * 设置：
	 */
	public void setCitypath(String citypath) {
		this.citypath = citypath;
	}
	/**
	 * 获取：
	 */
	public String getCitypath() {
		return citypath;
	}
	/**
	 * 设置：
	 */
	public void setCitytype(String citytype) {
		this.citytype = citytype;
	}
	/**
	 * 获取：
	 */
	public String getCitytype() {
		return citytype;
	}
	/**
	 * 设置：
	 */
	public void setCitytypenum(Integer citytypenum) {
		this.citytypenum = citytypenum;
	}
	/**
	 * 获取：
	 */
	public Integer getCitytypenum() {
		return citytypenum;
	}
	/**
	 * 设置：
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	/**
	 * 获取：
	 */
	public String getShortname() {
		return shortname;
	}
	/**
	 * 设置：
	 */
	public void setSpell(String spell) {
		this.spell = spell;
	}
	/**
	 * 获取：
	 */
	public String getSpell() {
		return spell;
	}
	/**
	 * 设置：
	 */
	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}
	/**
	 * 获取：
	 */
	public String getAreaid() {
		return areaid;
	}
	/**
	 * 设置：
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * 获取：
	 */
	public String getPostcode() {
		return postcode;
	}
}
