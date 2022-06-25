package java01_variables;


class Parent2 {   // 부모클래스
//	private int num;; // pirvate접근제한자는 상속관계여도 접근할 수 없음
	public int num;
	
	public void display() {
		System.out.println("부모 클래스");
	}
}


class Child2 extends Parent2 {    // 자식클래스
	 
	public int num; // 상속받은 멤버필드와 같은 이름 사용 -> 적절한 방법은 아님요
	//멤버필드는 
	
	public String name; // 자식의 고유한 멤버필드
	
	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
		
		num = 111;  // 지역변수 num
		this.num = 222;  //멤버필드 num(자식클래스)
		super.num = 333; //멤버필드 num(부모클래스)
	}
	
	public void print() {
		System.out.println("자식 고유 메소드");
	}
}

public class InheritEx_02 {
	public static void main(String[] args) {
		
		Child2 c = new Child2();
		
		c.num = 123;           // 부모클래스에 public아닌 private사용하면 제어자 안맞는다는 오류뜸
		c.display();   //오버라이딩된 메소드
		
		System.out.println("--------------------");
		
		Parent2 p = new Parent2();
		
		p.num = 456;
		p.display();
		
		System.out.println("--------------------");
		
		//Parent2 변수 <- Child2 객체(인스턴스)
		//부모 타입 변수 <- 자식 타입 객체
		Parent2 pc = new Child2();           // 그냥 문법 외울 것
		
		pc.num = 555; // pc변수의 데이터타입 Parent2에 선언된 부모 멤버필드 num
		
		
		//인스턴스의 데이터타입 Child2에 선언된 자식 멤버필드
		((Child2)pc).num = 666;
		((Child2)pc).name = "HI";
		
		//--------------------------------------------------
		
		//자식(인스턴스) 타입의 메소드를 호출한다(오버라이딩된 메소드)
		pc.display();  // 동적 바인딩
		

		
		System.out.println("--------------------");

//		Child2 cp = (Child2)new Parent2();
		// -> 에러
		// -> ClassCastException 발생한다
		// -> 부모타입을 자식타입으로 형변환할 수 없다
	}

}
