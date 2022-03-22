package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.MemberVo;

// biz객체에서 전달된 파라미터를 기반으로 데이터베이스에 CRUD 작업을 실행한다.
@Repository
public class MemberDao {
	@Autowired
	private SqlSessionFactory factory;

	public String insert(MemberVo vo) {
		SqlSession session = factory.openSession();
		String result = null;
		try {
			int r = session.insert("member.insertMember", vo);
			if(r > 0) {
				result = vo.getId();
			}
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}
	
	public List<MemberVo> select(String id) {
		SqlSession session = factory.openSession();
		List<MemberVo> list = null;
		try {
			list = session.selectList("member.selectMember", id);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;		
	}
	
	public MemberVo find(String id) {
		SqlSession session = factory.openSession();
		MemberVo vo = null;
		try {
			vo = session.selectOne("member.findMember", id);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return vo;
	}
	
	public String delete(String id) {
		SqlSession session = factory.openSession();
		// 00님이 삭제되었습니다. 하려고 일단 반환값 아이디로 함.
		String result = null;
		try {
			int r = session.delete("member.deleteMember", id);
			if(r > 0) {
				result = id;
			}
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}
	
	public String update(MemberVo vo) {
		SqlSession session = factory.openSession();
		String result = null;
		try {
			int r = session.update("member.updateMember", vo);
			if(r > 0) {
				result = vo.getId();
			}
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}
}
