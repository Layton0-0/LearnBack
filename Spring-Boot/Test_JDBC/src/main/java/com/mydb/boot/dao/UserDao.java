package com.mydb.boot.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mydb.boot.domain.User;

public interface UserDao {
	public int insertOne(User user) throws DataAccessException;
	
	public User findOne(Integer userId) throws DataAccessException;
	
	public List<User> selectAll() throws DataAccessException;
	
	public int updateOne(User user) throws DataAccessException;
	
	public int deleteOne(Integer userId) throws DataAccessException;
}
