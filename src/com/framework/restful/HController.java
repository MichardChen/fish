package com.framework.restful;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.framework.constants.Constants;
import com.framework.dao.TBrandSeriesDao;
import com.framework.dto.ParamsDTO;
import com.framework.entity.TBrandSeriesEntity;
import com.framework.entity.TQuestionAnswerEntity;
import com.framework.service.TQuestionAnswerService;
import com.framework.utils.ReturnData;
import com.framework.utils.StringUtil;

@Controller
@RequestMapping("hrest")
public class HController extends RestfulController{
	
	@Autowired
	private TQuestionAnswerService carouselService;
	@Autowired
	private TBrandSeriesDao seriesDao;

	@RequestMapping("/queryMessage")
	public void queryStoreOrNews(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ParamsDTO dto = ParamsDTO.getInstance(request);
		ReturnData data = new ReturnData();
		JSONObject json = new JSONObject();
		String flg = dto.getCode();
		if(StringUtil.isBlank(flg)) {
			data.setMessage("查询失败");
		}else {
			TQuestionAnswerEntity entity = carouselService.queryObjectByCode(flg);
			if(entity == null) {
				TBrandSeriesEntity seriesEntity = seriesDao.queryObjectByName(0);
				if(seriesEntity != null) {
					data.setMessage(seriesEntity.getCarSerial());
				}else {
					data.setMessage("此龙鱼芯片不存在");
				}
			}else {
				data.setMessage(entity.getAnswer());
			}
			
		}
		
		data.setData(json);
		data.setCode(Constants.STATUS_CODE.SUCCESS);
		renderJson1(data, response);
	}
}
