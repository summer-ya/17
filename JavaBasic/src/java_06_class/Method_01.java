package java_06_class;

public class Method_01 {
	
//	[접근제한자] [리턴타입] [메소드명]( 매개변수 ) {
//	  //실행 코드
//	}
	
	//----------------------------------------------------------

	//** void 리턴타입 : 반환하는 데이터가 없음
	
	public void method() {
		System.out.println("메소드 호출 테스트");
	}
	
	//----------------------------------------------------------
	
	//0. 메소드의 기본형태 작성하기
//	public void method() {
//	}
	//1. 메소드 이름 -> 만들려는 기능을 대표하는 이름으로 정한다
	//2. 매개변수 작성 -> 기능을 수행할 때 필요한 데이터를 저장할 수 있는 변수를 선언한다
	//3. 실행코드 작성 -> 메소드의 기능을 수행하도록 코드를 작성한다
	//4. return코드 작성 -> 기능 수행 결과를 반환하는 코드로 작성한다
	//5. return타입 작성 -> return코드에서 반환한 값의 데이터타입을 작성한다
	
	//----------------------------------------------------------
	
	//2개의 정수를 덧셈하는 기능(메소드)을 구현하자
	
	public int add( int num1, int num2 ) {
		
		int sum = num1 + num2; //덧셈
		
		return sum; //결과값 반환코드
		
	}
	//1. 메소드 이름 -> 덧셈 기능 -> add
	//2. 매개변수 작성 -> 2개 정수 -> int num1, int num2
	//3. 실행코드 작성 -> 2개 정수의 덧셈 -> num1 + num2
	//4. return코드 작성 -> 덧셈의 결과값 반환 -> return sum;
	//5. return타입 작성 -> int

}
