package com.dao;

import java.sql.*;
import java.util.*;
import com.entity.*;

import static com.common.JdbcTemplate.*;

// connect statement result close
public class ScoreDao implements ScoreSql {
	Connection con;

	public ScoreDao(Connection con) {
		this.con = con;
	}

	public List<Score> getScoreAll() {
//		String sql = "select * from Score"; -> 인터페이스로 한번에 모아주는 습관을 들여라.

		Score myscore = null; // select의 결과를 한줄씩 담을 객체
		List<Score> all = new ArrayList<Score>();
		ResultSet rs = null;

		Statement stmt = null;

		try {
			// select한 결과를 rs로 리턴
			stmt = con.createStatement();
			rs = stmt.executeQuery(Score_selectAll);

			while (rs.next()) {
				myscore = new Score();
				/*
				 * 긴 버전 myscore.setName(rs.getString(1)); myscore.setKor(rs.getInt(2));
				 * myscore.setEng(rs.getInt(3)); myscore.setMat(rs.getInt(4));
				 */
				myscore = new Score(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
				// list객체에 저장
				all.add(myscore);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
		}
		return all;
	}// getScoreAll()

	public int getScoreInsert(Score myScore) {

		PreparedStatement pstm = null;
		int res = 0; // insert 결과 변수
		try {
			pstm = con.prepareStatement(Score_insert);
			pstm.setString(1, myScore.getName());

			pstm.setInt(2, myScore.getKor());
			pstm.setInt(3, myScore.getEng());
			pstm.setInt(4, myScore.getMat());

			pstm.setInt(5, myScore.getTot());
			pstm.setDouble(6, myScore.getAvg());
			pstm.setString(7, myScore.getGrade());

			res = pstm.executeUpdate();

			if (res > 0) {
				commit(con);
			} 

		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstm);
		}

		return res;
	}

	public int getScoreDelete(String name) {

		PreparedStatement pstm = null;
		int res = 0; // insert 결과 변수
		try {
			pstm = con.prepareStatement(Score_delete);
			pstm.setString(1, name);

			res = pstm.executeUpdate();

			if (res > 0) {
				commit(con);
			} 

		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstm);
		}

		return res;
	}

	public Score getScoreFind(String name) {
//		String sql = "select * from Score"; -> 인터페이스로 한번에 모아주는 습관을 들여라.

		Score myscore = null; // select의 결과를 한줄씩 담을 객체
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// select한 결과를 rs로 리턴
			stmt = con.prepareStatement(Score_find);
			stmt.setString(1, name);
			rs = stmt.executeQuery();

			while (rs.next()) {
				/*
					myscore = new Score();
				 * 긴 버전 myscore.setName(rs.getString(1)); myscore.setKor(rs.getInt(2));
				 * myscore.setEng(rs.getInt(3)); myscore.setMat(rs.getInt(4));
				 */
				myscore = new Score(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
				// list객체에 저장
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
		}
		return myscore;
	}// getScoreAll()

	public int getScoreUpdate(Score myScore) {

		PreparedStatement pstm = null;
		int res = 0; // insert 결과 변수
		try {
			pstm = con.prepareStatement(Score_update);

			pstm.setInt(1, myScore.getKor());
			pstm.setInt(2, myScore.getEng());
			pstm.setInt(3, myScore.getMat());

			pstm.setString(4, myScore.getName());

			res = pstm.executeUpdate();

			if (res > 0) {
				commit(con);
			} 

		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstm);
		}

		return res;
	}

	
}// class
