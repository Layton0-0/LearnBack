package test06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import test06.GoodsVO;

// 매퍼를 .클래스로 만들어 연동 @쿼리문
public interface GoodsMapper {
	@SelectProvider(type = GoodsProvider.class, method = "listGoods")
	public List<GoodsVO> listGoods();
	
	@SelectProvider(type = GoodsProvider.class, method = "findGoods")
	public GoodsVO findGoods(String code);
	
	// 기본 타입으로 리턴 타입 주면 다 깨짐. (int -> Integer) 래퍼클래스 필요.
	@InsertProvider(type = GoodsProvider.class, method = "insertGoods")
	public Integer insertGoods(GoodsVO vo);
	
	@UpdateProvider(type = GoodsProvider.class, method = "updateGoods")
	public Integer updateGoods(GoodsVO vo);

	@DeleteProvider(type = GoodsProvider.class, method = "deleteGoods")
	public Integer deleteGoods(String name);

}
