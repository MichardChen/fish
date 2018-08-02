package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.LocationCityDao;
import com.framework.entity.LocationCityEntity;
import com.framework.service.LocationCityService;



@Service("locationCityService")
public class LocationCityServiceImpl implements LocationCityService {
	@Autowired
	private LocationCityDao locationCityDao;
	
	@Override
	public LocationCityEntity queryObject(Integer id){
		return locationCityDao.queryObject(id);
	}
	
	@Override
	public List<LocationCityEntity> queryList(Map<String, Object> map){
		return locationCityDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return locationCityDao.queryTotal(map);
	}
	
	@Override
	public void save(LocationCityEntity locationCity){
		locationCityDao.save(locationCity);
	}
	
	@Override
	public void update(LocationCityEntity locationCity){
		locationCityDao.update(locationCity);
	}
	
	@Override
	public void delete(Integer id){
		locationCityDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		locationCityDao.deleteBatch(ids);
	}

	@Override
	public List<LocationCityEntity> queryAllList(int provinceId) {
		return locationCityDao.queryAllList(provinceId);
	}
	
}
