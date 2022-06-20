package java07_inheritance;

public class Circle extends Point{
	private int radius;
	
	public Circle() {
		
	}

	public Circle(int x, int y, int radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		//중심점
		System.out.print("중심점");
		super.draw();
		
		//원의 면적
		System.out.print("원의 면적 : ");
		System.out.printf("%.1f", Math.PI * radius * radius);
		
		//원의 둘레
		System.out.print("원의 둘레");
		System.out.printf("%.1f", 2 * Math.PI * radius);
		System.out.println();
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

}
