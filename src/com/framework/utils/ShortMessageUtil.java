package com.framework.utils;

import java.security.MessageDigest;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.lang.RandomStringUtils;

public class ShortMessageUtil {
	
    public static String MD5(String value) throws Exception  {
        StringBuffer md5StrBuff = new StringBuffer();

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(value.getBytes("UTF-8"));

        byte[] result = md5.digest();

        for (int i = 0; i < result.length; i++)
			if (Integer.toHexString(0xFF & result[i]).length() == 1) {
				md5StrBuff.append("0").append(Integer.toHexString(0xFF & result[i]));
			} else {
				md5StrBuff.append(Integer.toHexString(0xFF & result[i]));
			}

        return md5StrBuff.toString();
    }
    
	public static int sendsms(String mobile,String content) throws Exception {
		HttpClient httpClient = new HttpClient(); 
		PostMethod postMethod = new PostMethod("http://api.1cloudsp.com/api/send");  
		postMethod.getParams().setContentCharset("UTF-8");
		postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
		
		String accesskey = "v51oSGnfHqmtyNqf"; 
		String accessScrect = "yfuQ6W8y6YBxwd86bDjGi3eBb7hFA6Qq"; 
		String random = RandomStringUtils.random(10); 
		String timestamp = ""+System.currentTimeMillis(); 
		String token = MD5(accessScrect+random+timestamp); 
		
		NameValuePair[] data = { 
		        new NameValuePair("token", token),
		        new NameValuePair("accesskey", accesskey),
		        new NameValuePair("timestamp", timestamp),
		        new NameValuePair("random", random),
		        new NameValuePair("mobile", mobile),
				new NameValuePair("content", content),
				new NameValuePair("sign", "【惠搜车超市】")
				
		};
		postMethod.setRequestBody(data);
		return httpClient.executeMethod(postMethod);
	}
}
