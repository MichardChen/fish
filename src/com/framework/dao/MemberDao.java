package com.framework.dao;

import java.util.List;
import java.util.Map;

import com.framework.entity.Member;

/**
 * 用户表
 * @author R & D
 * @email 908350381@qq.com
 * @date 2016年9月18日 上午9:34:11
 */
public interface MemberDao extends BaseDao<Member> {
	
	List<String> queryAllPerms(Long memberId);

	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> queryAllMenuId(Long memberId);

	/**
	 * 根据用户名，查询用户
	 */
	Member queryByMemberName(String membername);

	/**
	 * 修改密码
	 */
	int updatePassword(Map<String, Object> map);
	
	
}
