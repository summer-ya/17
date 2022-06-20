package java08_abstract;

public class Dog extends Animal {
	
	void ride() {
		System.out.println("Dog가 달립니다");
	}
	void wakeup() {
		System.out.println("Dog가 일어났습니다.");
	}

}

// Dog 클래스는 Animal클래스를 상속받고 있고 같은 메소드를 사용하지만
//오버라이딩으로 다시 정의를 했습니다.
//자식 클래스에 맞게 "Dog가 먹습니다."라고 재정의 한 것입니다요
