package shapeSpringFail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("shapeSpring/beans.xml");
		
		Shape shape;		
//		for(int i = 0; i < shape.length; i++) {
//			String name = "shape" + i;
//			shape[i] = ac.getBean(name, Shape.class);
//		}
		shape = ac.getBean("shape", Shape.class);
		System.out.println(shape);
		
//		System.out.println("기본정보");
//		for(Shape s: shape) {
//			System.out.println(s);
//		}		
//		System.out.println();
//		
//		System.out.println("사이즈를 변경 후 정보");
//		for(Shape s: shape) {
//			String shapeName = s.getClass().getSimpleName();
//			if(shapeName.equals("Triangle"))
//				((Triangle)s).setResize(5);
//			else if(shapeName.equals("Rectangle")) 
//				((Rectangle) s).setResize(5);
//			System.out.println(s);
//		}
		
	}//main

}//class
