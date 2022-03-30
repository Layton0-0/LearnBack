package com.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.vo.ProductVo;

// UI에서 전달된 파라미터를 기반으로 비즈니스 로직을 처리하고 결과를 Controller에 반환한다.
@Service
public class ProductBiz {
	@Autowired
	private ProductDao productDao;
	
	public ProductDao getProductDao() {
		return productDao;
	}

	public Integer insert(ProductVo vo) {
		return productDao.insert(vo);
	}

	public List<ProductVo> select() {
		return productDao.select();
	}
	
	public List<ProductVo> select(String pdName){
		return productDao.select(pdName);
	}

	public ProductVo find(String id) {
		return productDao.find(id);
	}

	public String delete(String id) {
		return productDao.delete(id);
	}

	public ProductVo update(ProductVo vo) {
		return productDao.update(vo);
	}
}
