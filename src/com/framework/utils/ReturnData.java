package com.framework.utils;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class ReturnData implements Serializable{

	private String code;
	private String message;
	private JSONObject data;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public JSONObject getData() {
		return data;
	}
	public void setData(JSONObject data) {
		this.data = data;
	}
	@Override
	public String toString() {
		if(this.data == null) {
			return "{\"code\":"+this.code+",\"message\":\""+this.message+"\",\"data\":"+"null}";
		}
		//json把map等对象转换为json时出现$ref的情况,要使用DisableCircularReferenceDetect来禁止循环引用检测
		return "{\"code\":"+this.code+",\"message\":\""+this.message+"\",\"data\":"+this.data.toJSONString(this.data,SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.WriteMapNullValue)+"}";
	}
	
	
}
