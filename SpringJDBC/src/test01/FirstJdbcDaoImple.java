package test01;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import test02.GoodsVO;

public class FirstJdbcDaoImple extends JdbcDaoSupport implements FirstJdbcDao{

	@Override
	public int insert(String code, String name, int price, String maker) {
		String insertSql = "insert into goodsinfo(code, name, price, maker) values(?,?,?,?)";
		return getJdbcTemplate().update(insertSql, new Object[] {code, name, price, maker});
	}
	
	@Override
	public int delete(String name) { // name으로 받아서 삭제
		String deleteSql = "delete from goodsinfo where name = ?";
		return getJdbcTemplate().update(deleteSql, new Object[] {name});
	}
	
	@Override
	public void execute(String sql) { // select 기능
//		String executeSql = "select * from goodsinfo";
//		getJdbcTemplate().execute(executeSql);
		getJdbcTemplate().query(sql, new MyMapper<Object>());
	}
	
	class MyMapper<T> implements RowMapper<T>{

		@Override
		public T mapRow(ResultSet rs, int rowNum) throws SQLException {
			String code = rs.getString("code");
			String name = rs.getString("NAME");
			String maker = rs.getString("MAKER");
			int price = rs.getInt("PRICE");
			System.out.printf("%10s %10s %10d %10s \n", code, name, price, maker);
			
			return null;
		}
				
	}


}
