package com.mydb.boot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mydb.boot.domain.User;

@Repository("UserDaoJdbc")
public class UserDaoJdbc implements UserDao{
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int insertOne(User user) throws DataAccessException {
		String insertSql = "insert into mUser values(?, ?, ?, ?, ?)";
		int res = jdbc.update(insertSql, user.getUserId(), user.getPassword(), user.getUserName(), user.getAge(), user.getRole());
		return res;
	}

	@Override
	public User findOne(Integer userId) throws DataAccessException {
		User u = new User();
		String findSql = "select * from mUser where userId=?";
		Map<String, Object> map = jdbc.queryForMap(findSql, userId);
		u.setUserId((Integer) map.get("userId"));
		u.setAge((Integer) map.get("age"));
		u.setUserName((String) map.get("userName"));
		u.setPassword((String) map.get("password"));
		u.setRole((String) map.get("role"));
		return u;
	}

	@Override
	public List<User> selectAll() throws DataAccessException {
		List<Map<String, Object>> getList = jdbc.queryForList("SELECT * FROM mUser");       
        List<User> userList = new ArrayList<>();
        for (Map<String, Object> map : getList) {
        	User u  = new User();        
            u.setUserId((Integer)map.get("userId"));
     	    u.setPassword((String)map.get("password"));
     	    u.setUserName((String)map.get("userName"));
     	    u.setRole((String) map.get("role"));
     	    u.setAge((Integer)map.get("age"));
            userList.add(u);
        }
        return userList;
	}

	@Override
	public int updateOne(User user) throws DataAccessException {
		  int res = jdbc.update(
	                "UPDATE mUser   SET  password = ? , userName = ? , age = ?  WHERE userId = ?",
	                user.getPassword(), user.getUserName(), user.getAge(), user.getUserId());
	        return res;
	}

	@Override
	public int deleteOne(Integer userId) throws DataAccessException {
		  int res = jdbc.update(
	                "delete  from mUser where userId =?" ,userId); 
	        return res;
	}

}
