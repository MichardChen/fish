package com.framework.utils;

import java.io.Serializable;

public class MapWxData implements Serializable{

	private String appId;
	private String timestamp;
	private String nonceStr;
	private String signature;
	private String address;
	private String emailCode;
	private String phone;
	private String companyName;
	private String customerServiceImg;
	private String ticket;
	
	
	
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getCustomerServiceImg() {
		return customerServiceImg;
	}
	public void setCustomerServiceImg(String customerServiceImg) {
		this.customerServiceImg = customerServiceImg;
	}
	public String getAddress() {
		return address;
	}
	public String getEmailCode() {
		return emailCode;
	}
	public String getPhone() {
		return phone;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAppId() {
		return appId;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public String getNonceStr() {
		return nonceStr;
	}
	public String getSignature() {
		return signature;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
}
