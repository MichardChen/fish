package com.framework.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import com.framework.entity.TCodemstEntity;
import com.framework.service.TCodemstService;
import com.framework.utils.PageUtils;
import com.framework.utils.R;


/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-27 14:45:48
 */
@Controller
@RequestMapping("tcodemst")
public class TCodemstController {
	@Autowired
	private TCodemstService tCodemstService;
	
	@RequestMapping("/tcodemst.html")
	public String list(){
		return "tcodemst/tcodemst.html";
	}
	
	@RequestMapping("/tcodemst_add.html")
	public String add(){
		return "tcodemst/tcodemst_add.html";
	}
	
	/**
	 * 列表
	 */
	@ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("tcodemst:list")
	public R list(Integer page, Integer limit){
		Map<String, Object> map = new HashMap<>();
		map.put("offset", (page - 1) * limit);
		map.put("limit", limit);
		
		//查询列表数据
		List<TCodemstEntity> tCodemstList = tCodemstService.queryList(map);
		int total = tCodemstService.queryTotal(map);
		
		PageUtils pageUtil = new PageUtils(tCodemstList, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{id}")
	@RequiresPermissions("tcodemst:info")
	public R info(@PathVariable("id") Integer id){
		TCodemstEntity tCodemst = tCodemstService.queryObject(id);
		
		return R.ok().put("tCodemst", tCodemst);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@RequestMapping("/save")
	@RequiresPermissions("tcodemst:save")
	public R save(@RequestBody TCodemstEntity tCodemst){
		tCodemstService.save(tCodemst);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("tcodemst:update")
	public R update(@RequestBody TCodemstEntity tCodemst){
		tCodemstService.update(tCodemst);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")
	@RequiresPermissions("tcodemst:delete")
	public R delete(@RequestBody Integer[] ids){
		tCodemstService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
