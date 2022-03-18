package test05.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import test05.GoodsVO;

// 매퍼를 .클래스로 만들어 연동 @쿼리문
public interface GoodsMapper {
	// 리턴 객체를 생성해 주어야 한다.
	// results 안에 result로 만들어줘야 함. -> 실수를 미연에 방지하기 위함. 요청하는 프로퍼티 이름과 데이터베이스의 column이름을 짝지어줌.
	@Results({ 
		@Result(property = "code", column = "code"),
		@Result(property = "name", column = "name"),
		@Result(property = "price", column = "price"),
		@Result(property = "maker", column = "maker")
	})

	@Select("select * from goodsinfo")
	public List<GoodsVO> listGoods();

	@Select("select * from goodsinfo where code=#{code}")
	public GoodsVO findGoods(String code);

	@Insert("insert into goodsinfo(code, name, price, maker) values(#{code}, #{name}, #{price}, #{maker})")
	public int insertGoods(GoodsVO vo);

	@Update("update goodsinfo set name=#{name}, price=#{price}, maker=#{maker} where code=#{code}")
	public int updateGoods(GoodsVO vo);

	@Delete("delete from goodsinfo where name=#{name}")
	public int deleteGoods(String name);

}
