package com.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MemberDao;
import com.vo.MemberVo;

// UI에서 전달된 파라미터를 기반으로 비즈니스 로직을 처리하고 결과를 Controller에 반환한다.
@Service
public class MemberBiz {
	@Autowired
	private MemberDao memberDao;
	
	public MemberDao getMemberDao() {
		return memberDao;
	}

	public String insert(MemberVo vo) {
		return memberDao.insert(vo);
	}

	public List<MemberVo> select(String id) {
		return memberDao.select(id);
	}

	public MemberVo find(String id) {
		return memberDao.find(id);
	}

	public String delete(String id) {
		return memberDao.delete(id);
	}

	public String update(MemberVo vo) {
		return memberDao.update(vo);
	}
}
