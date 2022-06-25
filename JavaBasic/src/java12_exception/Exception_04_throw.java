package java12_exception;

public class Exception_04_throw {
	public static void main(String[] args) {
		
		//throw 키워드
		//------------------------------------------------------
		
		//참조 대상 없음
		String str = null;
		
		System.out.println(str.length());
		
		//NullPointerException 발생 지점
		//System.out,println(str.lengh() ); //예외 발생 시 프로그램은 강제 종료된다
		
		System.out.println("문자열 길이를 출력하는 코드 이후");
		
		//--------------------------------------------------
		
		if(str == null) { //예외가 발생하는 경우
			System.out.println("[ERROR] 문자열이 NULL입니다");
			
			throw new NullPointerException();
			
		} else { //예외가 발생하지 않는 경우
			System.out.println(str.lastIndexOf(0));
			
		}
		System.out.println("if문 처리 이후 코드");
		
		System.out.println("---------------------------------");
		
		// 예외 정보 객체
		ArithmeticException ae = new ArithmeticException();  //예외가 던져지지 않는다(발생하지 않는다)
		
		//예외 던지기(예외 발생시키기)
		throw ae;
		
		//예외 객체를 생성(new) 하면서 예외를 발생(throw)시키는 것은 아니다
		//예외가 발생된 위치로 객체가 생성된 곳을 지정하고 있다
		// -> throw코드를 사용할 때 new를 이용한 객체 생성을 한꺼번에 하는 것이 좋다
		
		
		
	}
}
