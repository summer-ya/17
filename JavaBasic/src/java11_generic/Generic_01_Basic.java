package java11_generic;

import java.util.ArrayList;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		ArrayList al;
//		public class ArrayList<E> {
//		}
		// ArrayListŬ������ ������ �� ���׸��� ����Ǿ��ִ�
		
		// Ŭ���� ���ο��� ����� Ÿ�� �Ķ���� E�� ����Ͽ� ���׸� Ŭ������ ���ǵǾ��ִ�
		
		// ** Ÿ�� �Ķ���� : �Ϲ�ȭ��Ų ������Ÿ��
		//----------------------------------------------------------------------------
		// Ÿ�� �Ķ���͸� Ư�� �ڷ������� �������� �ʰ� ���׸� Ŭ������ ����ϸ� "raw type"���� ǥ���Ѵ�
		// -> Object�� ������ ��ó�� ����� �� �ִ�
	//----------------------------------------------------------------------------
		
		// Ÿ���Ķ���͸� String���� ���� �����ϸ鼭 ��ü ����
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		
		// list.add(123); // ����, String ���� �����߱⶧���� int���� ����� �� ����
		//---------------------------------------------------------
		// Ÿ���Ķ���ʹ� �⺻ ������Ÿ�� ����� �� ����
		// ArrayList<int> list2;
		
		// Wrapper Ŭ������ ����ؾ� �Ѵ�
		ArrayList<Integer> list3 = new ArrayList<Integer>();  //int�� �ȵǰ� �������� Integer��� �־ ���
		
		list3.add(123);
		
		int num = 456;
		list3.add(num);
		
		//---------------------------------------------------------------------------
		
		// ��ü�� �����ϴ� �ڵ忡���� Ÿ�� �Ķ���͸� ������ �� �ִ�
		
		// -> JDK 1.7���� ����
		
		ArrayList<String> list4 = new ArrayList<>();
		
		//---------------------------------------------------------------------------
		
		ArrayList<Integer> list5 = new ArrayList<>();
		
		
	}
}
