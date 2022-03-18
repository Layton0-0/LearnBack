package test04;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest04 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test04/applicationContext.xml");
		GoodsDao dao = ac.getBean("test", GoodsDao.class);
		List<GoodsVO> list = dao.listGoods();
		for (GoodsVO res : list) {
			System.out.println(res);
		}
		
		System.out.println("========================");
		GoodsVO vo = ac.getBean("vo01", GoodsVO.class);
		dao.insertGoods(vo);
		vo = ac.getBean("vo02", GoodsVO.class);
		dao.insertGoods(vo);

		list = dao.listGoods();

		for (GoodsVO res : list) {
			System.out.println(res);
		}
		System.out.println("========================");
		
		dao.deleteGoods("node.js");
		dao.deleteGoods("spring-boot");
		list = dao.listGoods();

		for (GoodsVO res : list) {
			System.out.println(res);
		}
		
	}

}
