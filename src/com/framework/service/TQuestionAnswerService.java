package com.framework.service;

import com.framework.entity.TQuestionAnswerEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-22 14:40:17
 */
public interface TQuestionAnswerService {
	
	TQuestionAnswerEntity queryObject(Integer id);
	
	TQuestionAnswerEntity queryObjectByCode(String question);
	
	List<TQuestionAnswerEntity> queryList(Map<String, Object> map);
	
	List<TQuestionAnswerEntity> queryQAList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	int queryTotalCount(Map<String, Object> map);
	
	int queryQATotal(Map<String, Object> map);
	
	void save(TQuestionAnswerEntity tQuestionAnswer);
	
	void update(TQuestionAnswerEntity tQuestionAnswer);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
