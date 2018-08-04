package com.framework.service;

import com.framework.entity.TBrandSeriesEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-23 13:43:22
 */
public interface TBrandSeriesService {
	
	TBrandSeriesEntity queryObject(Integer id);
	
	
	List<TBrandSeriesEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(TBrandSeriesEntity tBrandSeries);
	
	void update(TBrandSeriesEntity tBrandSeries);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
	
}
