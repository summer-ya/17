package java11_generic;

//�Ϲ� Ŭ����
class Class03 {
	
	//�Ϲ� �޼ҵ�  -> <T>�ִ� ���� ���׸� �޼ҵ�
	public <T> void display(int num) {
		int data;
		
		data = num;
	}
	
	
	//���׸� �޼ҵ�
	// -> returnŸ��, �Ű�����, �������� ���� Ÿ���Ķ���͸� ������ �� �ִ�
	public <T> T out(T obj) {
		T data;
		
		data = obj;
		
		return data;
	}
	
	
}








public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		//�Ϲ� Ŭ���� ����
		Class03 cl = new Class03();
		
		// Ÿ���Ķ���͸� �������� �ʰ� ȣ��
		// -> �Ű����� Ÿ���� ���� Integer�� �ڵ� ����
		cl.out(12345);
		
		
		//------------------------------------------
		
		
		//����, T -> Double �����ϰ� ȣ��
		//cl.<Double>out(12345);
		
		
		cl.<Double>out(456.789);
	
	
	
	
	
	}

}
