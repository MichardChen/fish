package com.framework.restful;

import javax.servlet.http.HttpServletResponse;

import com.framework.controller.AbstractController;
import com.framework.utils.ReturnData;

public class RestfulController extends AbstractController{

	public void renderJson(ReturnData data,HttpServletResponse response) throws Exception{
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print(data.toString());
	}
}
