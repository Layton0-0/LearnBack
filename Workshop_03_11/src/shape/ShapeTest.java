package shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		
		System.out.println("기본정보");
		for(Shape s: shape) {
			System.out.printf("%s\t %.1f\t %s %n",s.getClass().getSimpleName(), s.getArea(), s.getColors());
		}		
		System.out.println();
		
		System.out.println("사이즈를 변경 후 정보");
		for(Shape s: shape) {
			String shapeName = s.getClass().getSimpleName();
			if(shapeName.equals("Triangle"))
				((Triangle)s).setResize(5);
			else if(shapeName.equals("Rectangle")) 
				((Rectangle) s).setResize(5);
			System.out.printf("%s\t %.1f\t %s %n",shapeName, s.getArea(), s.getColors());
		}
		
	}

}
