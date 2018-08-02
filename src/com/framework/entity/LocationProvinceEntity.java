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
public class LocationProvinceEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String provinceid;
	//
	private String name;
	//
	private String provinceupid;
	//
	private Integer pid;
	//
	private String provincepath;
	//
	private String provincetype;
	//
	private Integer provincetypenum;
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
	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}
	/**
	 * 获取：
	 */
	public String getProvinceid() {
		return provinceid;
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
	public void setProvinceupid(String provinceupid) {
		this.provinceupid = provinceupid;
	}
	/**
	 * 获取：
	 */
	public String getProvinceupid() {
		return provinceupid;
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
	public void setProvincepath(String provincepath) {
		this.provincepath = provincepath;
	}
	/**
	 * 获取：
	 */
	public String getProvincepath() {
		return provincepath;
	}
	/**
	 * 设置：
	 */
	public void setProvincetype(String provincetype) {
		this.provincetype = provincetype;
	}
	/**
	 * 获取：
	 */
	public String getProvincetype() {
		return provincetype;
	}
	/**
	 * 设置：
	 */
	public void setProvincetypenum(Integer provincetypenum) {
		this.provincetypenum = provincetypenum;
	}
	/**
	 * 获取：
	 */
	public Integer getProvincetypenum() {
		return provincetypenum;
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
