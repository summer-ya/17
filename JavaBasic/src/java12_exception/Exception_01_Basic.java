package java12_exception;

public class Exception_01_Basic {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int i = 0;
		while(true) {
			
			
			//ArrayIndexOutOFBoundsException �߻�
			// �ε����� ������ �������� ��
			// �ε����� �迭�� ���̿� ���� ������ �������� ��
			// �ε����� �迭�� ���̺��� ū ������ �������� ��
			
			// ���ܻ�Ȳ ó��
			if( i<0 || i>=arr.length) { //���� ��Ȳ ����
				System.out.println("[���� �߻�] �ε����� ����� ����ϼ���!");
				break;  // ���ܰ� �߻��ϴ� ���� ������ ���ϰ� �ϰ� ������ ����������
			}
			
			arr[i] = i+1;   // ���� �߻� ����
			
			i++;
		}
	}

}
