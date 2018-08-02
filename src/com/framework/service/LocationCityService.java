package com.framework.service;

import com.framework.entity.LocationCityEntity;
import com.framework.entity.LocationProvinceEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-23 17:10:41
 */
public interface LocationCityService {
	
	LocationCityEntity queryObject(Integer id);
	
	List<LocationCityEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(LocationCityEntity locationCity);
	
	void update(LocationCityEntity locationCity);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
	
	List<LocationCityEntity> queryAllList(int provinceId);
}
