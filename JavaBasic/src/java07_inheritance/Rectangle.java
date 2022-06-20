package java07_inheritance;

public class Rectangle extends Point {

	private int width;
	private int height;

	public Rectangle() {}

	public Rectangle(int x, int y, int width, int height) {
		super(x,y);

		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.print("좌표 : ");
		super.draw();

		System.out.printf("면적 : %.1f\n", width * (double)height);
		System.out.printf("둘레 : %.1f\n", 2 * ( width + (double)height ));
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}

