package com.framework.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.framework.constants.Constants;
import com.framework.entity.SysUserEntity;
import com.framework.service.FileService;
import com.framework.service.SysUserRoleService;
import com.framework.service.SysUserService;
import com.framework.utils.DateUtil;
import com.framework.utils.PageUtils;
import com.framework.utils.R;
import com.framework.utils.ShiroUtils;
import com.framework.utils.StringUtil;

/**
 * 系统用户
 * @author R & D
 * @email 908350381@qq.com
 * @date 2016年10月31日 上午10:40:10
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController extends AbstractController {
	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SysUserRoleService sysUserRoleService;

	/**
	 * 所有用户列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:user:list")
	public R list(Integer page, Integer limit,@RequestParam("queryName")String queryName) {
		Map<String, Object> map = new HashMap<>();
		map.put("offset", (page - 1) * limit);
		map.put("limit", limit);
		map.put("queryName", queryName);

		// 查询列表数据
		List<SysUserEntity> userList = sysUserService.queryList(map);
		int total = sysUserService.queryTotal(map);

		PageUtils pageUtil = new PageUtils(userList, total, limit, page);

		return R.ok().put("page", pageUtil);
	}

	/**
	 * 获取登录的用户信息
	 */
	@RequestMapping("/info")
	public R info() {
		return R.ok().put("user", getUser());
	}

	/**
	 * 修改登录用户密码
	 */
	@RequestMapping("/password")
	public R password(String password, String newPassword) {
		if (StringUtils.isBlank(newPassword)) {
			return R.error("新密码不为能空");
		}

		// sha256加密
		password = new Sha256Hash(password).toHex();
		// sha256加密
		newPassword = new Sha256Hash(newPassword).toHex();

		// 更新密码
		int count = sysUserService.updatePassword(getUserId(), password, newPassword);
		if (count == 0) {
			return R.error("原密码不正确");
		}

		// 退出
		ShiroUtils.logout();

		return R.ok();
	}

	/**
	 * 用户信息
	 */
	@RequestMapping("/info/{userId}")
	@RequiresPermissions("sys:user:info")
	public R info(@PathVariable("userId") Long userId) {
		SysUserEntity user = sysUserService.queryObject(userId);

		// 获取用户所属的角色列表
		List<Long> roleIdList = sysUserRoleService.queryRoleIdList(userId);
		user.setRoleIdList(roleIdList);

		return R.ok().put("user", user);
	}

	/**
	 * 保存用户
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:user:save")
	public R save(@RequestParam("user")String user,@RequestParam(value="uFile",required=false)MultipartFile uploadFile) throws Exception{
		

		SysUserEntity entity = new SysUserEntity();
		JSONObject viewModel = JSONObject.parseObject(user);
		
		if (StringUtils.isBlank(viewModel.getString("username"))) {
			return R.error("用户名不能为空");
		}
		if (StringUtils.isBlank(viewModel.getString("password"))) {
			return R.error("密码不能为空");
		}
		entity.setExpertFlg(viewModel.getIntValue("expertFlg"));
		entity.setIntroduce(viewModel.getString("introduce"));
		entity.setRealName(viewModel.getString("realName"));
		entity.setSkill(viewModel.getString("skill"));
		entity.setPassword(viewModel.getString("password"));
		entity.setMobile(viewModel.getString("mobile"));
		entity.setCreateTime(DateUtil.getNowTimestamp());
		entity.setUsername(viewModel.getString("username"));
		entity.setEmail(viewModel.getString("email"));
		entity.setStatus(viewModel.getInteger("status"));
		JSONArray roleList = viewModel.getJSONArray("roleIdList");
		List<Long> roleIdList = new ArrayList<>();
		for(int i=0;i<roleList.size();i++){
			roleIdList.add(((Integer)roleList.get(i)).longValue());
		}
		
		entity.setRoleIdList(roleIdList);
		//生成html
		FileService fs=new FileService();
		String uuid = UUID.randomUUID().toString();
		//上传图片
		String logo = fs.upload(uploadFile, Constants.FILE_HOST.IMG, Constants.HOST.IMG);
		if(StringUtil.isNoneBlank(logo)){
			entity.setIcon(logo);
		}
		sysUserService.save(entity);

		return R.ok();
	}

	/**
	 * 修改用户
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:user:update")
	public R update(@RequestParam("user")String user,@RequestParam(value="uFile",required=false)MultipartFile uploadFile) throws Exception{
		SysUserEntity entity = new SysUserEntity();
		JSONObject viewModel = JSONObject.parseObject(user);
		
		entity.setExpertFlg(viewModel.getIntValue("expertFlg"));
		entity.setIntroduce(viewModel.getString("introduce"));
		entity.setRealName(viewModel.getString("realName"));
		entity.setSkill(viewModel.getString("skill"));
		entity.setPassword(viewModel.getString("password"));
		entity.setMobile(viewModel.getString("mobile"));
		entity.setCreateTime(DateUtil.getNowTimestamp());
		entity.setUsername(viewModel.getString("username"));
		entity.setEmail(viewModel.getString("email"));
		entity.setStatus(viewModel.getInteger("status"));
		JSONArray roleList = viewModel.getJSONArray("roleIdList");
		List<Long> roleIdList = new ArrayList<>();
		for(int i=0;i<roleList.size();i++){
			roleIdList.add(((Integer)roleList.get(i)).longValue());
		}
		
		entity.setRoleIdList(roleIdList);
		entity.setUserId(viewModel.getLong("userId"));
		//生成html
		FileService fs=new FileService();
		//上传图片
		String logo = fs.upload(uploadFile, Constants.FILE_HOST.IMG, Constants.HOST.IMG);
		if(StringUtil.isNoneBlank(logo)){
			entity.setIcon(logo);
		}
		sysUserService.update(entity);

		return R.ok();
	}

	/**
	 * 删除用户
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:user:delete")
	public R delete(@RequestBody Long[] userIds) {
		if (ArrayUtils.contains(userIds, 1L)) {
			return R.error("系统管理员不能删除");
		}

		if (ArrayUtils.contains(userIds, getUserId())) {
			return R.error("当前用户不能删除");
		}

		sysUserService.deleteBatch(userIds);

		return R.ok();
	}
}
