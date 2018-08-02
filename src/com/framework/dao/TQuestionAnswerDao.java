package com.framework.dao;

import java.util.List;
import java.util.Map;

import com.framework.entity.TQuestionAnswerEntity;

/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-22 14:40:17
 */
public interface TQuestionAnswerDao extends BaseDao<TQuestionAnswerEntity> {

	public List<TQuestionAnswerEntity> queryQAList(Map<String, Object> map);
	
	public TQuestionAnswerEntity queryQuestionByCode(String code);
	
	int queryQATotal(Map<String, Object> map);
	
	int queryQuestionByCodeCount(Map<String, Object> map);
}
