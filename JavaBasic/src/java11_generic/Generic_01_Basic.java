package java11_generic;

import java.util.ArrayList;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		ArrayList al;
//		public class ArrayList<E> {
//		}
		// ArrayList클래스를 정의할 때 제네릭이 적용되어있다
		
		// 클래스 내부에서 사용할 타입 파라미터 E를 사용하여 제네릭 클래스로 정의되어있다
		
		// ** 타입 파라미터 : 일반화시킨 데이터타입
		//----------------------------------------------------------------------------
		// 타입 파라미터를 특정 자료형으로 결정하지 않고 제네릭 클래스를 사용하면 "raw type"으로 표현한다
		// -> Object로 결정된 것처럼 사용할 수 있다
	//----------------------------------------------------------------------------
		
		// 타입파라미터를 String으로 직접 결정하면서 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		
		// list.add(123); // 에러, String 으로 결정했기때문에 int형을 사용할 수 없다
		//---------------------------------------------------------
		// 타입파라미터는 기본 데이터타입 사용할 수 없다
		// ArrayList<int> list2;
		
		// Wrapper 클래스를 사용해야 한다
		ArrayList<Integer> list3 = new ArrayList<Integer>();  //int가 안되고 정석으로 Integer라고 넣어서 사용
		
		list3.add(123);
		
		int num = 456;
		list3.add(num);
		
		//---------------------------------------------------------------------------
		
		// 객체를 생성하는 코드에서는 타입 파라미터를 생략할 수 있다
		
		// -> JDK 1.7부터 가능
		
		ArrayList<String> list4 = new ArrayList<>();
		
		//---------------------------------------------------------------------------
		
		ArrayList<Integer> list5 = new ArrayList<>();
		
		
	}
}
