package com.framework.service;

import com.framework.entity.TCodemstEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-27 14:45:48
 */
public interface TCodemstService {
	
	TCodemstEntity queryObject(Integer id);
	
	List<TCodemstEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(TCodemstEntity tCodemst);
	
	void update(TCodemstEntity tCodemst);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
