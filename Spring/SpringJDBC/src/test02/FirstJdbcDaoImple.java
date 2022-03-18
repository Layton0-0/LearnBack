package test02;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class FirstJdbcDaoImple extends JdbcDaoSupport implements FirstJdbcDao {

	@Override
	public List<GoodsVO> listGoods() {
//		String listSql = "select * from goodsinfo";
//		List<GoodsVO> list = getJdbcTemplate().query(listSql, new GoodsMapper<GoodsVO>());		
//		return list;
		return getJdbcTemplate().query("select * from goodsinfo", new GoodsMapper<GoodsVO>());		
		
	}

	@Override
	public GoodsVO findGoods(String code) {
		String findSql = "select * from goodsinfo where code = ?";
		return getJdbcTemplate().queryForObject(findSql, new GoodsMapper<GoodsVO>(), new Object[] {code});
		
	}

	@Override
	public int updateGoods(GoodsVO vo) {
		String updateSql = "update goodsinfo set name=?, price=?, maker=? where code = ?";
		return getJdbcTemplate().update(updateSql, new Object[] {vo.getName(), vo.getPrice(), vo.getMaker(), vo.getCode()});
	}
	
	public class GoodsMapper<T> implements RowMapper<GoodsVO>{
		@Override
		public GoodsVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			GoodsVO entity = new GoodsVO();
			entity.setCode(rs.getString("code"));
			entity.setName(rs.getString("name"));
			entity.setPrice(rs.getInt("price"));
			entity.setMaker(rs.getString("maker"));
			
			return entity;
		}
	}

}
