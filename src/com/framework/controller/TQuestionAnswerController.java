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

import com.framework.dao.SysUserDao;
import com.framework.dao.TCodemstDao;
import com.framework.entity.SysUserEntity;
import com.framework.entity.TQuestionAnswerEntity;
import com.framework.model.QuestionAnswerListModel;
import com.framework.service.TQuestionAnswerService;
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
 * @date 2018-05-22 14:40:17
 */
@Controller
@RequestMapping("tquestionanswer")
public class TQuestionAnswerController {
	@Autowired
	private TQuestionAnswerService tQuestionAnswerService;
	@Autowired
	private SysUserDao userDao;
	@Autowired
	private TCodemstDao codeMstDao;
	
	@RequestMapping("/tquestionanswer.html")
	public String list(){
		return "tquestionanswer/tquestionanswer.html";
	}
	
	@RequestMapping("/tquestionanswer_add.html")
	public String add(){
		return "tquestionanswer/tquestionanswer_add.html";
	}
	
	/**
	 * 列表
	 */
	@ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("tquestionanswer:list")
	public R list(Integer page, Integer limit,@RequestParam("date")String date){
		Map<String, Object> map = new HashMap<>();
		map.put("offset", (page - 1) * limit);
		map.put("limit", limit);
		map.put("date", date);
		//查询列表数据
		List<TQuestionAnswerEntity> tQuestionAnswerList = tQuestionAnswerService.queryList(map);
		int total = tQuestionAnswerService.queryTotal(map);
		
		List<QuestionAnswerListModel> models = new ArrayList<>();
		QuestionAnswerListModel model = null;
		for(TQuestionAnswerEntity data : tQuestionAnswerList){
			model = new QuestionAnswerListModel();
			model.setUpdateTime(StringUtil.toString(data.getUpdateTime()));
			model.setCreateTime(StringUtil.toString(data.getCreateTime()));
			model.setFlg(data.getFlg()==1?"正常":"删除");
			model.setId(data.getId());
			SysUserEntity admin = userDao.queryObject(data.getCreateBy());
			if(admin != null){
				model.setCreateBy(admin.getUsername());
			}else{
				model.setCreateBy(StringUtil.STRING_BLANK);
			}
			/*TCodemstEntity codemstEntity = codeMstDao.queryByCode(data.getTypeCd());
			if(codemstEntity != null) {
				model.setType(codemstEntity.getName());
			}*/
			
			SysUserEntity update = userDao.queryObject(data.getUpdateBy());
			if(update != null){
				model.setUpdateBy(update.getUsername());
			}else{
				model.setUpdateBy(StringUtil.STRING_BLANK);
			}
			model.setAnswer(data.getAnswer());
			model.setQuestion(data.getQuestion());
			
			models.add(model);
		}
		
		PageUtils pageUtil = new PageUtils(models, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{id}")
	@RequiresPermissions("tquestionanswer:info")
	public R info(@PathVariable("id") Integer id){
		TQuestionAnswerEntity tQuestionAnswer = tQuestionAnswerService.queryObject(id);
		
		return R.ok().put("tQuestionAnswer", tQuestionAnswer);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@RequestMapping("/save")
	@RequiresPermissions("tquestionanswer:save")
	public R save(@RequestBody TQuestionAnswerEntity tQuestionAnswer){
		
		Map<String, Object> map = new HashMap<>();
		map.put("code", tQuestionAnswer.getQuestion());
		int count = tQuestionAnswerService.queryTotalCount(map);
		if(count>0) {
			return R.error("此芯片已经录入");
		}
		int userid = ShiroUtils.getUserId().intValue();
		tQuestionAnswer.setCreateBy(userid);
		tQuestionAnswer.setCreateTime(DateUtil.getNowTimestamp());
		tQuestionAnswer.setUpdateBy(userid);
		tQuestionAnswer.setFlg(1);
		tQuestionAnswer.setUpdateTime(DateUtil.getNowTimestamp());
		tQuestionAnswerService.save(tQuestionAnswer);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("tquestionanswer:update")
	public R update(@RequestBody TQuestionAnswerEntity tQuestionAnswer){
		
		int userid = ShiroUtils.getUserId().intValue();
		tQuestionAnswer.setUpdateBy(userid);
		tQuestionAnswer.setUpdateTime(DateUtil.getNowTimestamp());
		tQuestionAnswerService.update(tQuestionAnswer);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")
	@RequiresPermissions("tquestionanswer:delete")
	public R delete(@RequestBody Integer[] ids){
		tQuestionAnswerService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
