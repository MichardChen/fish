package com.framework.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.framework.entity.TBrandSeriesEntity;

/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-23 13:43:22
 */
public interface TBrandSeriesDao extends BaseDao<TBrandSeriesEntity> {
	
	TBrandSeriesEntity queryObjectByName(@Param("flg")int flg);
}
