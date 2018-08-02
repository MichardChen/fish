package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.TCodemstDao;
import com.framework.entity.TCodemstEntity;
import com.framework.service.TCodemstService;



@Service("tCodemstService")
public class TCodemstServiceImpl implements TCodemstService {
	@Autowired
	private TCodemstDao tCodemstDao;
	
	@Override
	public TCodemstEntity queryObject(Integer id){
		return tCodemstDao.queryObject(id);
	}
	
	@Override
	public List<TCodemstEntity> queryList(Map<String, Object> map){
		return tCodemstDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return tCodemstDao.queryTotal(map);
	}
	
	@Override
	public void save(TCodemstEntity tCodemst){
		tCodemstDao.save(tCodemst);
	}
	
	@Override
	public void update(TCodemstEntity tCodemst){
		tCodemstDao.update(tCodemst);
	}
	
	@Override
	public void delete(Integer id){
		tCodemstDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		tCodemstDao.deleteBatch(ids);
	}
	
}
