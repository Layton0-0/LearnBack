package shape;

public class Triangle extends Shape implements Resize{
	private int width;
	private int height;
	private String colors;
		
	public Triangle() {
		super();
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	
	@Override
	public double getArea() {
		return (double)width * (double)height / 2.0;
	}
	
	@Override
	public void setResize(int size) {
		height += size;
	}
}
