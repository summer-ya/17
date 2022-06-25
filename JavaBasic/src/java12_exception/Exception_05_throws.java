package java12_exception;

import java.
class ThrowsTest {
	//	throws키워드를 이용하여 예외 처리에 대한 책임을 떠넘긴다
	//	-> 메소드를 호출한 쪽에서 예외 처리를 담당하도록 만든다
	public void method() throw IOException {
		// 		unchecked
		//		throw new NullPointerException(); -> Runtime Error

		//checked
		throw new IOException();   // Compile Time Error

	}
}




public class Exception_05_throws {
	public static void main(String[] args) {

		//throw 키워드
		//--------------------------------------------------

		ThrowsTest tt = new ThrowsTest();

		try {
			// throws가 적용된 메소드를 호출할 땐
			// 예외처리를 반드시 적어주어야한다
			tt.method();

		} catch (IOEXception e) {
			// e. pirntStackTrace();
		}
		System.out.println("+ + + 프로그램 종료 + + +");
	}
}
}