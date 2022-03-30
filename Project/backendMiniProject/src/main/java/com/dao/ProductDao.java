package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.ProductVo;

// biz객체에서 전달된 파라미터를 기반으로 데이터베이스에 CRUD 작업을 실행한다.
@Repository
public class ProductDao {
	@Autowired
	private SqlSessionFactory factory;

	public Integer insert(ProductVo vo) {
		SqlSession session = factory.openSession();
		int result = -100;
		try {
			int r = session.insert("mapper.insertProduct", vo);
			if(r > 0) {
				result = vo.getPdCode();
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
	
	public List<ProductVo> select() {
		SqlSession session = factory.openSession();
		List<ProductVo> list = null;
		try {
			list = session.selectList("mapper.selectProduct");
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;		
	}
	
	public List<ProductVo> select(String pdName) {
		SqlSession session = factory.openSession();
		List<ProductVo> list = null;
		try {
			list = session.selectList("mapper.selectDetailProduct", pdName);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;		
	}
	
	public ProductVo find(String code) {
		SqlSession session = factory.openSession();
		ProductVo vo = null;
		try {
			vo = session.selectOne("mapper.findProduct", code);
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
			int r = session.delete("mapper.deleteProduct", id);
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
	
	public ProductVo update(ProductVo vo) {
		SqlSession session = factory.openSession();
		try {
			session.update("mapper.updateProduct", vo);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return vo;
	}
}
