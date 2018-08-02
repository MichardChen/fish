package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.TQuestionAnswerDao;
import com.framework.entity.TQuestionAnswerEntity;
import com.framework.service.TQuestionAnswerService;



@Service("tQuestionAnswerService")
public class TQuestionAnswerServiceImpl implements TQuestionAnswerService {
	@Autowired
	private TQuestionAnswerDao tQuestionAnswerDao;
	
	@Override
	public TQuestionAnswerEntity queryObject(Integer id){
		return tQuestionAnswerDao.queryObject(id);
	}
	
	@Override
	public List<TQuestionAnswerEntity> queryList(Map<String, Object> map){
		return tQuestionAnswerDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return tQuestionAnswerDao.queryTotal(map);
	}
	
	@Override
	public void save(TQuestionAnswerEntity tQuestionAnswer){
		tQuestionAnswerDao.save(tQuestionAnswer);
	}
	
	@Override
	public void update(TQuestionAnswerEntity tQuestionAnswer){
		tQuestionAnswerDao.update(tQuestionAnswer);
	}
	
	@Override
	public void delete(Integer id){
		tQuestionAnswerDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		tQuestionAnswerDao.deleteBatch(ids);
	}

	@Override
	public List<TQuestionAnswerEntity> queryQAList(Map<String, Object> map) {
		return tQuestionAnswerDao.queryQAList(map);
	}

	@Override
	public int queryQATotal(Map<String, Object> map) {
		return tQuestionAnswerDao.queryQATotal(map);
	}

	@Override
	public TQuestionAnswerEntity queryObjectByCode(String question) {
		return tQuestionAnswerDao.queryQuestionByCode(question);
	}

	@Override
	public int queryTotalCount(Map<String, Object> map) {
		return tQuestionAnswerDao.queryQuestionByCodeCount(map);
	}
	
}
