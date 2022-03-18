package test05;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test05.dao.GoodsDao;

public class MTest05 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test05/applicationContext.xml");
		GoodsDao dao = ac.getBean("test", GoodsDao.class);
		List<GoodsVO> list = dao.listGoods();
		for (GoodsVO res : list) {
			System.out.println(res);
		}
		
		System.out.println("============추가 후============");
		GoodsVO vo = ac.getBean("vo01", GoodsVO.class);
		dao.insertGoods(vo);
		vo = ac.getBean("vo02", GoodsVO.class);
		dao.insertGoods(vo);

		list = dao.listGoods();

		for (GoodsVO res : list) {
			System.out.println(res);
		}
		System.out.println("============삭제 후============");
		
		dao.deleteGoods(ac.getBean("deleteName", String.class));
		dao.deleteGoods("spring-boot");
		list = dao.listGoods();

		for (GoodsVO res : list) {
			System.out.println(res);
		}
		
		System.out.println("============하나 찾기============");
		vo = dao.findGoods("p0003");
		System.out.println(vo);
				
		System.out.println("============업뎃 + 하나============");
		GoodsVO voUp = new GoodsVO("p0001", "MySQL", 45000, "오라클");
		dao.updateGoods(voUp);
		vo = dao.findGoods("p0001");
		System.out.println(vo);
	}

}
