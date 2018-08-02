package com.framework.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.framework.dao.MemberDao;
import com.framework.entity.Member;
import com.framework.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	@Override
	public Member queryObject(Long id) {
		return memberDao.queryObject(id);
	}

	@Override
	public List<Member> queryList(Map<String, Object> map) {
		return memberDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return memberDao.queryTotal(map);
	}

	@Override
	public void save(Member member) {
		memberDao.save(member);
	}

	@Override
	public void update(Member member) {
		memberDao.update(member);
	}

	@Override
	public void deleteBatch(Long[] memberIds) {
		memberDao.deleteBatch(memberIds);
	}
}
