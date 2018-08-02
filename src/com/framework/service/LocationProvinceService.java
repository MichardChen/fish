package com.framework.service;

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
public interface LocationProvinceService {
	
	LocationProvinceEntity queryObject(Integer id);
	
	List<LocationProvinceEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(LocationProvinceEntity locationProvince);
	
	void update(LocationProvinceEntity locationProvince);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
	
	List<LocationProvinceEntity> queryAllList();
}
