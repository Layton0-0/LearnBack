package test06.dao;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import test06.GoodsVO;

@Component
public class GoodsProvider {
	// 실행되는 provider의 쿼리문을 리턴하기 때문에 String으로 리턴한다.
	public String listGoods() {
		return new SQL() {
			{
				SELECT("CODE, NAME, PRICE, MAKER");
				FROM("GOODSINFO");
			}
		}.toString();
	};

	public String findGoods(String code) {
		return new SQL() {
			{
				SELECT("CODE, NAME, PRICE, MAKER");
				FROM("GOODSINFO");
				WHERE("CODE=#{code}");
			}
		}.toString();
	};

	public String insertGoods(GoodsVO vo) {
		String sql = new SQL().INSERT_INTO("GOODSINFO")
				.VALUES("CODE, NAME, PRICE, MAKER", "#{code},#{name},#{price},#{maker}").toString();
		return sql;
	};

	public String updateGoods(GoodsVO vo) {
		return new SQL() {
			{
				UPDATE("GOODSINFO");
				SET("name=#{name}", "price=#{price}", "maker=#{maker}");
				WHERE("code=#{code}");
			}
		}.toString();
	};

	public String deleteGoods(String name) {
		String sql = new SQL().DELETE_FROM("GOODSINFO").WHERE("name=#{name}").toString();
		return sql;
	};
}
