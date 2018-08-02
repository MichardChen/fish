package com.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import com.framework.utils.StringUtil;

public class ParamsDTO implements Serializable {

	private static ParamsDTO dto;
	private int pageSize;
	private int pageNum;
	private String mark;
	private String mobile;
	private String name;
	private int cartId;
	private int employeeId;
	private String question;
	private String code;
	private int brandSeriesId;
	private int financeId;
	private int key;

	private int brandId;
	private BigDecimal fromFirstPayment;
	private BigDecimal toFirstPayment;
	private BigDecimal fromMonthPayment;
	private BigDecimal toMonthPayment;
	private BigDecimal fromCarCost;
	private BigDecimal toCarCost;
	private String carLevelCd;
	private BigDecimal fromAge;
	private BigDecimal toAge;
	private BigDecimal fromKilomiter;
	private BigDecimal toKilomiter;
	private BigDecimal fromPrice;
	private BigDecimal toPrice;
	private String carClassCd;
	private String color;

	private int provinceId;
	private int cityId;
	private String cardNo;
	private int age;
	private int sex;
	
	private String typeCd;
	private String brand;
	private Integer cartFlg;
	
	public static ParamsDTO getInstance(HttpServletRequest request) {

		dto = new ParamsDTO();
		dto.setFinanceId(StringUtil.toInteger(request.getParameter("financeId")));
		dto.setProvinceId(StringUtil.toInteger(request.getParameter("provinceId")));
		dto.setCityId(StringUtil.toInteger(request.getParameter("cityId")));
		dto.setSex(StringUtil.toInteger(request.getParameter("sex")));
		dto.setCardNo(request.getParameter("cardNo"));
		dto.setAge(StringUtil.toInteger(request.getParameter("age")));
		dto.setFromAge(StringUtil.toQueryCarBigDecimal(request.getParameter("fromAge")));
		dto.setToAge(StringUtil.toQueryCarBigDecimal(request.getParameter("toAge")));
		dto.setFromKilomiter(StringUtil.toQueryCarBigDecimal(request.getParameter("fromKilomiter")));
		dto.setToKilomiter(StringUtil.toQueryCarBigDecimal(request.getParameter("toKilomiter")));
		dto.setBrandId(StringUtil.toInteger(request.getParameter("brandId")));
		dto.setFromFirstPayment(StringUtil.toQueryCarBigDecimal(request.getParameter("fromFirstPayment")));
		dto.setToFirstPayment(StringUtil.toQueryCarBigDecimal(request.getParameter("toFirstPayment")));
		dto.setFromMonthPayment(StringUtil.toQueryCarBigDecimal(request.getParameter("fromMonthPayment")));
		dto.setToMonthPayment(StringUtil.toQueryCarBigDecimal(request.getParameter("toMonthPayment")));
		dto.setFromCarCost(StringUtil.toQueryCarBigDecimal(request.getParameter("fromCarCost")));
		dto.setToCarCost(StringUtil.toQueryCarBigDecimal(request.getParameter("toCarCost")));
		dto.setCarLevelCd(request.getParameter("carLevelCd"));

		dto.setPageNum(StringUtil.toInteger(request.getParameter("pageNum")));
		dto.setPageSize(StringUtil.toInteger(request.getParameter("pageSize")));
		dto.setMark(request.getParameter("mark"));
		dto.setMobile(request.getParameter("mobile"));
		dto.setName(request.getParameter("name"));
		dto.setCartId(StringUtil.toInteger(request.getParameter("cartId")));
		dto.setEmployeeId(StringUtil.toInteger(request.getParameter("employeeId")));
		dto.setQuestion(request.getParameter("question"));
		dto.setCode(request.getParameter("code"));
		dto.setColor(request.getParameter("color"));
		dto.setBrandSeriesId(StringUtil.toInteger(request.getParameter("brandSeriesId")));
		dto.setFromPrice(StringUtil.toQueryCarBigDecimal(request.getParameter("fromPrice")));
		dto.setToPrice(StringUtil.toQueryCarBigDecimal(request.getParameter("toPrice")));
		dto.setCarClassCd(request.getParameter("carClassCd"));
		dto.setTypeCd(request.getParameter("typeCd"));
		dto.setBrand(request.getParameter("brand"));
		dto.setCartFlg(StringUtil.toInteger(request.getParameter("cartFlg")));
		dto.setKey(StringUtil.toInteger(request.getParameter("key")));
		return dto;
	}
	
	public int getKey() {
		return key;
	}






	public void setKey(int key) {
		this.key = key;
	}






	public Integer getCartFlg() {
		return cartFlg;
	}






	public void setCartFlg(Integer cartFlg) {
		this.cartFlg = cartFlg;
	}






	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getTypeCd() {
		return typeCd;
	}



	public void setTypeCd(String typeCd) {
		this.typeCd = typeCd;
	}



	public int getProvinceId() {
		return provinceId;
	}

	public int getFinanceId() {
		return financeId;
	}

	public void setFinanceId(int financeId) {
		this.financeId = financeId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}



	public int getCityId() {
		return cityId;
	}



	public void setCityId(int cityId) {
		this.cityId = cityId;
	}



	public String getCardNo() {
		return cardNo;
	}



	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getSex() {
		return sex;
	}



	public void setSex(int sex) {
		this.sex = sex;
	}



	public BigDecimal getFromPrice() {
		return fromPrice;
	}

	public void setFromPrice(BigDecimal fromPrice) {
		this.fromPrice = fromPrice;
	}

	public BigDecimal getToPrice() {
		return toPrice;
	}

	public void setToPrice(BigDecimal toPrice) {
		this.toPrice = toPrice;
	}

	public String getCarClassCd() {
		return carClassCd;
	}

	public void setCarClassCd(String carClassCd) {
		this.carClassCd = carClassCd;
	}

	public BigDecimal getFromAge() {
		return fromAge;
	}

	public void setFromAge(BigDecimal fromAge) {
		this.fromAge = fromAge;
	}

	public BigDecimal getToAge() {
		return toAge;
	}

	public void setToAge(BigDecimal toAge) {
		this.toAge = toAge;
	}

	public BigDecimal getFromKilomiter() {
		return fromKilomiter;
	}

	public void setFromKilomiter(BigDecimal fromKilomiter) {
		this.fromKilomiter = fromKilomiter;
	}

	public BigDecimal getToKilomiter() {
		return toKilomiter;
	}

	public void setToKilomiter(BigDecimal toKilomiter) {
		this.toKilomiter = toKilomiter;
	}

	public int getBrandSeriesId() {
		return brandSeriesId;
	}

	public void setBrandSeriesId(int brandSeriesId) {
		this.brandSeriesId = brandSeriesId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBrandId() {
		return brandId;
	}

	public BigDecimal getFromFirstPayment() {
		return fromFirstPayment;
	}

	public BigDecimal getToFirstPayment() {
		return toFirstPayment;
	}

	public BigDecimal getFromMonthPayment() {
		return fromMonthPayment;
	}

	public BigDecimal getToMonthPayment() {
		return toMonthPayment;
	}

	public BigDecimal getFromCarCost() {
		return fromCarCost;
	}

	public BigDecimal getToCarCost() {
		return toCarCost;
	}

	public String getCarLevelCd() {
		return carLevelCd;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public void setFromFirstPayment(BigDecimal fromFirstPayment) {
		this.fromFirstPayment = fromFirstPayment;
	}

	public void setToFirstPayment(BigDecimal toFirstPayment) {
		this.toFirstPayment = toFirstPayment;
	}

	public void setFromMonthPayment(BigDecimal fromMonthPayment) {
		this.fromMonthPayment = fromMonthPayment;
	}

	public void setToMonthPayment(BigDecimal toMonthPayment) {
		this.toMonthPayment = toMonthPayment;
	}

	public void setFromCarCost(BigDecimal fromCarCost) {
		this.fromCarCost = fromCarCost;
	}

	public void setToCarCost(BigDecimal toCarCost) {
		this.toCarCost = toCarCost;
	}

	public void setCarLevelCd(String carLevelCd) {
		this.carLevelCd = carLevelCd;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getPageSize() {
		return pageSize;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
}
