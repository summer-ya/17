package java12_exception;

public class Exception_04_throw {
	public static void main(String[] args) {
		
		//throw Ű����
		//------------------------------------------------------
		
		//���� ��� ����
		String str = null;
		
		System.out.println(str.length());
		
		//NullPointerException �߻� ����
		//System.out,println(str.lengh() ); //���� �߻� �� ���α׷��� ���� ����ȴ�
		
		System.out.println("���ڿ� ���̸� ����ϴ� �ڵ� ����");
		
		//--------------------------------------------------
		
		if(str == null) { //���ܰ� �߻��ϴ� ���
			System.out.println("[ERROR] ���ڿ��� NULL�Դϴ�");
			
			throw new NullPointerException();
			
		} else { //���ܰ� �߻����� �ʴ� ���
			System.out.println(str.lastIndexOf(0));
			
		}
		System.out.println("if�� ó�� ���� �ڵ�");
		
		System.out.println("---------------------------------");
		
		// ���� ���� ��ü
		ArithmeticException ae = new ArithmeticException();  //���ܰ� �������� �ʴ´�(�߻����� �ʴ´�)
		
		//���� ������(���� �߻���Ű��)
		throw ae;
		
		//���� ��ü�� ����(new) �ϸ鼭 ���ܸ� �߻�(throw)��Ű�� ���� �ƴϴ�
		//���ܰ� �߻��� ��ġ�� ��ü�� ������ ���� �����ϰ� �ִ�
		// -> throw�ڵ带 ����� �� new�� �̿��� ��ü ������ �Ѳ����� �ϴ� ���� ����
		
		
		
	}
}
