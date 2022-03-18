package test03;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("test")
@Repository
public class FirstJdbcDaoImple implements FirstJdbcDao {
	private JdbcTemplate jdbcTemplate;

//	public FirstJdbcDaoImple(DataSource dataSource) {
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//	}
	@Autowired
	public void setDatasource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<GoodsVO> listGoods() {
//		String listSql = "select * from goodsinfo";
//		List<GoodsVO> list = getJdbcTemplate().query(listSql, new GoodsMapper<GoodsVO>());		
//		return list;
		return jdbcTemplate.query("select * from goodsinfo", goodsMapper);

	}

	@Override
	public GoodsVO findGoods(String code) {
		String findSql = "select * from goodsinfo where code = ?";
		return jdbcTemplate.queryForObject(findSql, goodsMapper, new Object[] { code });

	}

	@Override
	public int updateGoods(GoodsVO vo) {
		String updateSql = "update goodsinfo set name=?, price=?, maker=? where code = ?";
		return jdbcTemplate.update(updateSql,
				new Object[] { vo.getName(), vo.getPrice(), vo.getMaker(), vo.getCode() });
	}

	// 이게 바로 람다식(익명함수)
	private final RowMapper<GoodsVO> goodsMapper = (rs, rowNum) -> {
		GoodsVO entity = new GoodsVO();
		entity.setCode(rs.getString("code"));
		entity.setName(rs.getString("name"));
		entity.setPrice(rs.getInt("price"));
		entity.setMaker(rs.getString("maker"));
		return entity;
	};

}
