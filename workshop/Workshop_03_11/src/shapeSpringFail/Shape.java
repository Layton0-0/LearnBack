package shapeSpringFail;

public abstract class Shape {
	
	private int width;
	private int height;
	private String colors;
		
	public Shape() {
		super();
	}
	public Shape(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}

	public abstract double getArea();
	
	public String getColors() {
		return colors;
	}
	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + ", colors=" + colors + "]";
	}
	
	
	
	
	
	
}
