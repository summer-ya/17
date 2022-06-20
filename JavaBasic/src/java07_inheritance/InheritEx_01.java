package java07_inheritance;

class Parent {
	String name;          // default인 상태
	int num;
	
	public void display() {
		System.out.println("부모 클래스의 메소드");
	}
}


class Child extends Parent {
	int score;
	
	
	public void print() {
		System.out.println("자식 클래스의 메소드");
	}
	
	@Override
	public void display() {
		System.out.println("상속받은 메소드를 재정의한 메소드"); //위에 동일 클래스 있어도 충돌x
		System.out.println("오버라이딩한 메소드");
	}
	
	public void display(String data) {
		System.out.println("오버라이딩한 메소드를 오버로딩한 메소드");
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
		
		Child c = new Child();  //자식 클래스 생성
		c.name =  "Bob";   // 상속받은 멤버필드
		c.num = 456;       // 상속받은 멤버필드
		c.display();       // 상속 받은 멤버메소드  -> 재정의 메소드
		
		c.score = 100; //자식클래스의 고유 멤버필드
		c.print(); //자식클래스의 고유 멤버메소드
	}

}
