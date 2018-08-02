package com.framework.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Member implements Serializable{

	private int id;
	
	private String mobile;
	
	private String userPwd;
	
	private String name;
	
	private String nickName;
	
	private String memberGradeCd;
	
	private int points;
	
	private BigDecimal moneys;
	
	private Timestamp createTime;
	
	private Timestamp updateTime;
	
	private String icon;
	
	private int sex;
	
	private String status;
	
	private int familiarity;
	
	private String openAccountFlg;
	
	private String qq;
	
	private String wx;
	
	private String payPwd;
	
	private String idCode;
	
	private int storeId;
	
	private String idCardNo;
	
	private String idCardImg;
	
	private String roleCd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getMemberGradeCd() {
		return memberGradeCd;
	}

	public void setMemberGradeCd(String memberGradeCd) {
		this.memberGradeCd = memberGradeCd;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public BigDecimal getMoneys() {
		return moneys;
	}

	public void setMoneys(BigDecimal moneys) {
		this.moneys = moneys;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getFamiliarity() {
		return familiarity;
	}

	public void setFamiliarity(int familiarity) {
		this.familiarity = familiarity;
	}

	public String getOpenAccountFlg() {
		return openAccountFlg;
	}

	public void setOpenAccountFlg(String openAccountFlg) {
		this.openAccountFlg = openAccountFlg;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWx() {
		return wx;
	}

	public void setWx(String wx) {
		this.wx = wx;
	}

	public String getPayPwd() {
		return payPwd;
	}

	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}

	public String getIdCode() {
		return idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardImg() {
		return idCardImg;
	}

	public void setIdCardImg(String idCardImg) {
		this.idCardImg = idCardImg;
	}

	public String getRoleCd() {
		return roleCd;
	}

	public void setRoleCd(String roleCd) {
		this.roleCd = roleCd;
	}
}
