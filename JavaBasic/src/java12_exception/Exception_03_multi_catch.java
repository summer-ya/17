package java12_exception;

public class Exception_03_multi_catch {
	public static void main(String[] args) {

		try {
			// try블록
			// 예측 발생이 예측되는 코드를 작성한다

		} catch(NullPointerException e) {
			//catch블록
			//NullPointerException 예외 발생 시 예외처리하는 코드를 작성한다

		} catch(ArrayIndexOutOfBoundsException e) {
			//catch블록
			//ArrayIndexOutOfBoundsException 예외 처리 코드

		} catch(Exception e) {
			//NullPointerException과 ArrayIndexOutOfBoundsException를
			//제외한 나머지 모든 예외가 발생하면 처리하는 코드 작성

		}




		// catch 구문을 여러개 쓸 수 있다
		//--------------------------------------------------------------

		//다중 예외처리(Multi Catch)
		// -> 하나의 catch구문에 예외 클래스를 여러 개 적용하는 문법

		try {

		} catch(NullPointerException | ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
			//NullPointerException
			//ArrayIndexOutOfBoundsException
			//NegativeArraySizeException

			//예외클래스를 동시에 처리하는 catch 구문

		}	catch (Exception e) {
			//남은 예외 전부 처리하는 catch구문
		}
	}


}