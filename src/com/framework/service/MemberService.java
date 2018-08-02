package com.framework.service;

import java.util.List;
import java.util.Map;

import com.framework.entity.Member;

public interface MemberService {

	Member queryObject(Long id);

	List<Member> queryList(Map<String, Object> map);

	int queryTotal(Map<String, Object> map);

	void save(Member member);

	void update(Member member);

	void deleteBatch(Long[] memberIds);
}
