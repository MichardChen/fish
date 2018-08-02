package com.framework.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.framework.entity.TCodemstEntity;

/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-27 14:45:48
 */
public interface TCodemstDao extends BaseDao<TCodemstEntity> {

	public TCodemstEntity queryByCode(@Param("code")String code);
	
	public List<TCodemstEntity> queryByCodeList(@Param("pcode")String pcode);
}
