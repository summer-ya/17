package java12_exception;

public class Exception_01_Basic {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int i = 0;
		while(true) {
			
			
			//ArrayIndexOutOFBoundsException 발생
			// 인덱스를 음수로 지정했을 때
			// 인덱스를 배열의 길이와 같은 값으로 지정했을 때
			// 인덱스를 배열의 길이보다 큰 값으로 지정했을 때
			
			// 에외상황 처리
			if( i<0 || i>=arr.length) { //예외 상황 조건
				System.out.println("[예외 발생] 인덱스를 제대로 사용하세요!");
				break;  // 예외가 발생하는 곳을 만나지 못하게 하고 밖으로 빠져나가게
			}
			
			arr[i] = i+1;   // 예외 발생 지점
			
			i++;
		}
	}

}
