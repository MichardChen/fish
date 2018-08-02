package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.LocationProvinceDao;
import com.framework.entity.LocationProvinceEntity;
import com.framework.service.LocationProvinceService;



@Service("locationProvinceService")
public class LocationProvinceServiceImpl implements LocationProvinceService {
	@Autowired
	private LocationProvinceDao locationProvinceDao;
	
	@Override
	public LocationProvinceEntity queryObject(Integer id){
		return locationProvinceDao.queryObject(id);
	}
	
	@Override
	public List<LocationProvinceEntity> queryList(Map<String, Object> map){
		return locationProvinceDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return locationProvinceDao.queryTotal(map);
	}
	
	@Override
	public void save(LocationProvinceEntity locationProvince){
		locationProvinceDao.save(locationProvince);
	}
	
	@Override
	public void update(LocationProvinceEntity locationProvince){
		locationProvinceDao.update(locationProvince);
	}
	
	@Override
	public void delete(Integer id){
		locationProvinceDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		locationProvinceDao.deleteBatch(ids);
	}

	@Override
	public List<LocationProvinceEntity> queryAllList() {
		return locationProvinceDao.queryAllList();
	}
}
