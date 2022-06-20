package java07_inheritance;

class Parent {
	String name;          // default�� ����
	int num;
	
	public void display() {
		System.out.println("�θ� Ŭ������ �޼ҵ�");
	}
}


class Child extends Parent {
	int score;
	
	
	public void print() {
		System.out.println("�ڽ� Ŭ������ �޼ҵ�");
	}
	
	@Override
	public void display() {
		System.out.println("��ӹ��� �޼ҵ带 �������� �޼ҵ�"); //���� ���� Ŭ���� �־ �浹x
		System.out.println("�������̵��� �޼ҵ�");
	}
	
	public void display(String data) {
		System.out.println("�������̵��� �޼ҵ带 �����ε��� �޼ҵ�");
	}
	
}


public class InheritEx_01 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.name = "Alice";
		p.num = 123;
		p.display();
		
		System.out.println("--------------------");
		//------------------------------------------
		
		Child c = new Child();  //�ڽ� Ŭ���� ����
		c.name =  "Bob";   // ��ӹ��� ����ʵ�
		c.num = 456;       // ��ӹ��� ����ʵ�
		c.display();       // ��� ���� ����޼ҵ�  -> ������ �޼ҵ�
		
		c.score = 100; //�ڽ�Ŭ������ ���� ����ʵ�
		c.print(); //�ڽ�Ŭ������ ���� ����޼ҵ�
	}

}
