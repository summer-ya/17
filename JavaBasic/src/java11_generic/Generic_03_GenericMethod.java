package java11_generic;

//일반 클래스
class Class03 {
	
	//일반 메소드  -> <T>넣는 순간 제네릭 메소드
	public <T> void display(int num) {
		int data;
		
		data = num;
	}
	
	
	//제네릭 메소드
	// -> return타입, 매개변수, 지역변수 전부 타입파라미터를 적용할 수 있다
	public <T> T out(T obj) {
		T data;
		
		data = obj;
		
		return data;
	}
	
	
}








public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		//일반 클래스 생성
		Class03 cl = new Class03();
		
		// 타입파라미터를 결정하지 않고 호출
		// -> 매개변수 타입을 보고 Integer로 자동 결정
		cl.out(12345);
		
		
		//------------------------------------------
		
		
		//에러, T -> Double 결정하고 호출
		//cl.<Double>out(12345);
		
		
		cl.<Double>out(456.789);
	
	
	
	
	
	}

}
