package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.TBrandSeriesDao;
import com.framework.entity.TBrandSeriesEntity;
import com.framework.service.TBrandSeriesService;



@Service("tBrandSeriesService")
public class TBrandSeriesServiceImpl implements TBrandSeriesService {
	@Autowired
	private TBrandSeriesDao tBrandSeriesDao;
	
	@Override
	public TBrandSeriesEntity queryObject(Integer id){
		return tBrandSeriesDao.queryObject(id);
	}
	
	@Override
	public List<TBrandSeriesEntity> queryList(Map<String, Object> map){
		return tBrandSeriesDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return tBrandSeriesDao.queryTotal(map);
	}
	
	@Override
	public void save(TBrandSeriesEntity tBrandSeries){
		tBrandSeriesDao.save(tBrandSeries);
	}
	
	@Override
	public void update(TBrandSeriesEntity tBrandSeries){
		tBrandSeriesDao.update(tBrandSeries);
	}
	
	@Override
	public void delete(Integer id){
		tBrandSeriesDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		tBrandSeriesDao.deleteBatch(ids);
	}
}
