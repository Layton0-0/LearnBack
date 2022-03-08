package com.biz;

import com.dao.*;
import com.entity.*;
import java.sql.*;
import java.util.*;

import static com.common.JdbcTemplate.*;

// view -> controller -> biz -> dao
public class ScoreBiz {

	// biz 연산한 결과를 db에 보내거나 연산 없이 db만 호출
	// 반드시 해줘야 할 것: db의 c&C (connection, Close)
	public List<Score> getScoreAll() {
		Connection conn = getConnection();

		List<Score> all = new ScoreDao(conn).getScoreAll();
		close(conn);

		return all;
	}

	public int getScoreInsert(Score myScore) {
		Connection conn = getConnection();

		int res = new ScoreDao(conn).getScoreInsert(myScore);
		close(conn);

		return res;
	}

	public int getScoreDelete(String name) {
		Connection conn = getConnection();

		int res = new ScoreDao(conn).getScoreDelete(name);
		close(conn);

		return res;
	}
	
	public int getScoreUpdate(Score myScore) {
		Connection conn = getConnection();

		int res = new ScoreDao(conn).getScoreUpdate(myScore);
		close(conn);

		return res;
	}
	
	public Score getScoreFind(String name) {
		Connection conn = getConnection();

		Score res = new ScoreDao(conn).getScoreFind(name);
		close(conn);

		return res;
	}

}
