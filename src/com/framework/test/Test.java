package com.framework.test;

import java.math.BigDecimal;

import com.alibaba.fastjson.JSONObject;
import com.framework.constants.Constants;
import com.framework.utils.ReturnData;
import com.framework.utils.StringUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	ReturnData data = new ReturnData();
		String d = "{\"code\":5600,\"message\":\"????\",\"data\":{\"imgUrl\":\"http://192.168.2.164:82/document/509463fa-61ba-42b7-a43c-e43a0bdef4f1.png\",\"imgName\":\"509463fa-61ba-42b7-a43c-e43a0bdef4f1.png\"}}";
		JSONObject dd = JSONObject.parseObject(d);
		JSONObject ddt = (JSONObject)dd.get("data");*/
		BigDecimal data = new BigDecimal("1155.008");
		System.out.println(StringUtil.formatCarPrice(data,0));
	}

}
