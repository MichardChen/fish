package com.framework.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.framework.entity.LocationCityEntity;

/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-23 17:10:41
 */
public interface LocationCityDao extends BaseDao<LocationCityEntity> {
	
	List<LocationCityEntity> queryAllList(@Param("provinceId")int provinceId);
}
