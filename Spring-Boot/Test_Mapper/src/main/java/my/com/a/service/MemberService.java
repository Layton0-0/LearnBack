package my.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import my.com.a.dao.MemberDao;
import my.com.a.dto.MemberDto;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	public List<MemberDto> allMember() {
		return dao.allMember();
	}
	
	public List<MemberDto> insertMember() {
		return dao.insertMember();
	}
	
	
	
}





