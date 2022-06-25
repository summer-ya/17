package java01_variables;


class Parent2 {   // �θ�Ŭ����
//	private int num;; // pirvate���������ڴ� ��Ӱ��迩�� ������ �� ����
	public int num;
	
	public void display() {
		System.out.println("�θ� Ŭ����");
	}
}


class Child2 extends Parent2 {    // �ڽ�Ŭ����
	 
	public int num; // ��ӹ��� ����ʵ�� ���� �̸� ��� -> ������ ����� �ƴԿ�
	//����ʵ�� 
	
	public String name; // �ڽ��� ������ ����ʵ�
	
	@Override
	public void display() {
		System.out.println("�������̵� �޼ҵ�");
		
		num = 111;  // �������� num
		this.num = 222;  //����ʵ� num(�ڽ�Ŭ����)
		super.num = 333; //����ʵ� num(�θ�Ŭ����)
	}
	
	public void print() {
		System.out.println("�ڽ� ���� �޼ҵ�");
	}
}

public class InheritEx_02 {
	public static void main(String[] args) {
		
		Child2 c = new Child2();
		
		c.num = 123;           // �θ�Ŭ������ public�ƴ� private����ϸ� ������ �ȸ´´ٴ� ������
		c.display();   //�������̵��� �޼ҵ�
		
		System.out.println("--------------------");
		
		Parent2 p = new Parent2();
		
		p.num = 456;
		p.display();
		
		System.out.println("--------------------");
		
		//Parent2 ���� <- Child2 ��ü(�ν��Ͻ�)
		//�θ� Ÿ�� ���� <- �ڽ� Ÿ�� ��ü
		Parent2 pc = new Child2();           // �׳� ���� �ܿ� ��
		
		pc.num = 555; // pc������ ������Ÿ�� Parent2�� ����� �θ� ����ʵ� num
		
		
		//�ν��Ͻ��� ������Ÿ�� Child2�� ����� �ڽ� ����ʵ�
		((Child2)pc).num = 666;
		((Child2)pc).name = "HI";
		
		//--------------------------------------------------
		
		//�ڽ�(�ν��Ͻ�) Ÿ���� �޼ҵ带 ȣ���Ѵ�(�������̵��� �޼ҵ�)
		pc.display();  // ���� ���ε�
		

		
		System.out.println("--------------------");

//		Child2 cp = (Child2)new Parent2();
		// -> ����
		// -> ClassCastException �߻��Ѵ�
		// -> �θ�Ÿ���� �ڽ�Ÿ������ ����ȯ�� �� ����
	}

}
