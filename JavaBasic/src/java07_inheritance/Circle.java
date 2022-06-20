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
		//�߽���
		System.out.print("�߽���");
		super.draw();
		
		//���� ����
		System.out.print("���� ���� : ");
		System.out.printf("%.1f", Math.PI * radius * radius);
		
		//���� �ѷ�
		System.out.print("���� �ѷ�");
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
