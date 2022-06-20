package java08_abstract;

public class CarExample {
	public static void main(String[] args) {
		
		Car cars = new Car();
		
		System.out.println("회사 : " + cars.company);
		System.out.println("색상 : " + cars.color);
		System.out.println("모델 : " + cars.model);
		System.out.println("최고 속도 : " + cars.maxSpeed);
		
		cars.speed = 120;
		System.out.println("현재 속도 : " + cars.speed);
		
	}

}
