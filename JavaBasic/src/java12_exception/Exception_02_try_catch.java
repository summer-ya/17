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
			
			// ���ܰ� �߻����� ������ catch ����� �������� �ʴ´�
			// while(i<5) {
			// arr[i] = i+1;
			// i++;
			// }
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("[���ܰ� �߻��߽��ϴ�]");

			System.err.println("[���ܰ� �߻��߽��ϴ�]");   //�����۾�, ����ȿ��
			
			//���� ��Ȳ ���
			e.printStackTrace();

		} finally {
			System.out.println("���� ó�� ��!");
		}
		System.out.println(" +++ ���α׷� ����  +++");
	}

}
