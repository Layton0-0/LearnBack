package com.mydb.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydb.boot.dao.UserDao;
import com.mydb.boot.domain.User;

// view -> controller -> biz(service) -> dao
@Transactional
@Service
public class UserService {
	@Autowired
	@Qualifier("UserDaoJdbc")// 후손의 객체명을 컴포넌트 명으로 지정해준다.
	UserDao dao; // 상속관계의 선조를 선언한 후 참조시킨다.
	
	public boolean insertOne(User user) {
		int r = dao.insertOne(user);
		if(r > 0) {
			return true;
		}
		return false;
	};
	
	public boolean updateOne(User user) {
		int r = dao.updateOne(user);
		if(r > 0) {
			return true;
		}
		return false;
	};
	
	public boolean deleteOne(Integer userId) {
		int r = dao.deleteOne(userId);
		boolean fw = false;
		if(r > 0) {
			fw = true;
		}
		return fw;
	};
	
	// 커밋과 롤백이 필요없는 select구문은 바로 호출한다.
	public User findOne(Integer userId) {
		return dao.findOne(userId);
	};
	
	public List<User> selectAll() {
		return dao.selectAll();
	};
}
