package java12_exception;

public class Exception_03_multi_catch {
	public static void main(String[] args) {

		try {
			// try���
			// ���� �߻��� �����Ǵ� �ڵ带 �ۼ��Ѵ�

		} catch(NullPointerException e) {
			//catch���
			//NullPointerException ���� �߻� �� ����ó���ϴ� �ڵ带 �ۼ��Ѵ�

		} catch(ArrayIndexOutOfBoundsException e) {
			//catch���
			//ArrayIndexOutOfBoundsException ���� ó�� �ڵ�

		} catch(Exception e) {
			//NullPointerException�� ArrayIndexOutOfBoundsException��
			//������ ������ ��� ���ܰ� �߻��ϸ� ó���ϴ� �ڵ� �ۼ�

		}




		// catch ������ ������ �� �� �ִ�
		//--------------------------------------------------------------

		//���� ����ó��(Multi Catch)
		// -> �ϳ��� catch������ ���� Ŭ������ ���� �� �����ϴ� ����

		try {

		} catch(NullPointerException | ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
			//NullPointerException
			//ArrayIndexOutOfBoundsException
			//NegativeArraySizeException

			//����Ŭ������ ���ÿ� ó���ϴ� catch ����

		}	catch (Exception e) {
			//���� ���� ���� ó���ϴ� catch����
		}
	}


}