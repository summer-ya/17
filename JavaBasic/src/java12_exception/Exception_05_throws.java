package java12_exception;

import java.
class ThrowsTest {
	//	throwsŰ���带 �̿��Ͽ� ���� ó���� ���� å���� ���ѱ��
	//	-> �޼ҵ带 ȣ���� �ʿ��� ���� ó���� ����ϵ��� �����
	public void method() throw IOException {
		// 		unchecked
		//		throw new NullPointerException(); -> Runtime Error

		//checked
		throw new IOException();   // Compile Time Error

	}
}




public class Exception_05_throws {
	public static void main(String[] args) {

		//throw Ű����
		//--------------------------------------------------

		ThrowsTest tt = new ThrowsTest();

		try {
			// throws�� ����� �޼ҵ带 ȣ���� ��
			// ����ó���� �ݵ�� �����־���Ѵ�
			tt.method();

		} catch (IOEXception e) {
			// e. pirntStackTrace();
		}
		System.out.println("+ + + ���α׷� ���� + + +");
	}
}
}