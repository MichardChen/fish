package com.framework.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.framework.dao.SysUserDao;
import com.framework.entity.SysUserEntity;
import com.framework.entity.TBrandSeriesEntity;
import com.framework.model.BrandSeriesListModel;
import com.framework.model.TBrandSeriesModel;
import com.framework.service.TBrandSeriesService;
import com.framework.utils.DateUtil;
import com.framework.utils.PageUtils;
import com.framework.utils.R;
import com.framework.utils.ShiroUtils;
import com.framework.utils.StringUtil;


/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-23 13:43:22
 */
@Controller
@RequestMapping("tbrandseries")
public class TBrandSeriesController {
	@Autowired
	private TBrandSeriesService tBrandSeriesService;
	@Autowired
	private SysUserDao userDao;
	
	@RequestMapping("/tbrandseries.html")
	public String list(){
		return "tbrandseries/tbrandseries.html";
	}
	
	@RequestMapping("/tbrandseries_add.html")
	public String add(){
		return "tbrandseries/tbrandseries_add.html";
	}
	
	/**
	 * 列表
	 */
	@ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("tbrandseries:list")
	public R list(Integer page, Integer limit,@RequestParam("queryBrand")Integer queryBrand){
		Map<String, Object> map = new HashMap<>();
		map.put("offset", (page - 1) * limit);
		map.put("limit", limit);
		map.put("queryBrand", queryBrand);
		
		//查询列表数据
		List<TBrandSeriesEntity> tBrandSeriesList = tBrandSeriesService.queryList(map);
		int total = tBrandSeriesService.queryTotal(map);
		List<BrandSeriesListModel> models = new ArrayList<>();
		BrandSeriesListModel m = null;
		for(TBrandSeriesEntity entity : tBrandSeriesList){
			m = new BrandSeriesListModel();
			m.setId(entity.getId());
			m.setCarSerial(entity.getCarSerial());
			m.setCreateTime(StringUtil.toString(entity.getCreateTime()));
			m.setUpdateTime(StringUtil.toString(entity.getUpdateTime()));
			SysUserEntity admin = userDao.queryObject(entity.getCreateBy());
			if(admin != null){
				m.setCreateBy(admin.getUsername());
			}else{
				m.setCreateBy(StringUtil.STRING_BLANK);
			}
			
			if(entity.getFlg() == 0){
				m.setFlg("无法识别提示消息");
			}
			
			SysUserEntity update = userDao.queryObject(entity.getUpdateBy());
			if(update != null){
				m.setUpdateBy(update.getUsername());
			}else{
				m.setUpdateBy(StringUtil.STRING_BLANK);
			}
			
			models.add(m);
		}
		
		PageUtils pageUtil = new PageUtils(models, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{id}")
	@RequiresPermissions("tbrandseries:info")
	public R info(@PathVariable("id") Integer id){
		TBrandSeriesEntity tBrandSeries = tBrandSeriesService.queryObject(id);
		TBrandSeriesModel model = new TBrandSeriesModel();
		if(tBrandSeries != null){
			model.setCarSerial(tBrandSeries.getCarSerial());
			model.setId(tBrandSeries.getId());
			model.setFlg(tBrandSeries.getFlg());
		}
		return R.ok().put("tBrandSeries", model);
	}
	
	
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("tbrandseries:update")
	public R update(@RequestParam("tBrandSeries") String tBrandSeries) throws Exception{
		
		TBrandSeriesEntity bs = new TBrandSeriesEntity();
		int userid = ShiroUtils.getUserId().intValue();
		JSONObject viewModel = JSONObject.parseObject(tBrandSeries);
		
		TBrandSeriesEntity brandSeriesEntity = tBrandSeriesService.queryObject(viewModel.getInteger("id"));
		if(brandSeriesEntity == null){
			return R.error("此数据不存在");
		}
		
		bs.setId(viewModel.getInteger("id"));
		bs.setCarSerial(viewModel.getString("carSerial"));
		bs.setUpdateBy(userid);
		bs.setFlg(viewModel.getInteger("flg"));
		bs.setUpdateTime(DateUtil.getNowTimestamp());
		tBrandSeriesService.update(bs);
		
		return R.ok();
	}
	
	
	
}
