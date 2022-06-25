package java11_generic;

class Class02_int {
	private int data;

	public int display(int data) {
		this.data = data;
		return data;

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}




class Class02_double {
	private double data;

	private double display(double data) {
		this.data = data;
		return data;

	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}
}


//---------------------------------------------------------------


class Class02<T> {
	private T data;

	public T display(T data) {
		this.data = data;
		return data;

	}


	public class GEneric_02_GenericClass {
		//public static void main(String[] args) {
		// 타입파라미터를 결정하지 않음

		Class02 cl01 = new Class02();

		//cl01.setData(123); //int
		//에러, 형변환이 필요하다

		//int num = cl01.getData();
		int num = (int)cl01.getData();

		//----------------------------------------------------------------------------

		// 타입파라미터를 String으로 결정함

		Class02<String> cl02 = new Class02<>();

		cl02.setData("Apple");

		String fruit = cl02.getData();



	}


	public int getData() {
		// TODO Auto-generated method stub
		return 0;
	}
}