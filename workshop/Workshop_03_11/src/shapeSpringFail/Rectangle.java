package shapeSpringFail;

public class Rectangle extends Shape implements Resize{

	private int width;
	private int height;
	private String colors;

	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
		this.width = width;
		this.height = height;
		this.colors = colors;
	}

	@Override
	public double getArea() {
		return (double)width * (double)height;
	}
	
	@Override
	public void setResize(int size) {
		width += size;
	}
}
