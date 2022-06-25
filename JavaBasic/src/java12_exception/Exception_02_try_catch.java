package java12_exception;

public class Exception_02_try_catch {
	public static void main(String[] args) {

		int[] arr = new int[5];

		int i=0;

		try {

			while(true) {

				arr[i] = i+1;
				i++;

			}
			
			// 예외가 발생하지 않으면 catch 블록을 실행하지 않는다
			// while(i<5) {
			// arr[i] = i+1;
			// i++;
			// }
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("[예외가 발생했습니다]");

			System.err.println("[예외가 발생했습니다]");   //빨간글씨, 강조효과
			
			//예외 상황 출력
			e.printStackTrace();

		} finally {
			System.out.println("예외 처리 끝!");
		}
		System.out.println(" +++ 프로그램 종료  +++");
	}

}
