package java07_inherit.practice.controller;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������: 1, ����:2 \n���ϴ� ������ ��ȣ�� �Է��ϼ��� : ");
		int input = sc.nextInt();
		Fruit fruit;
		
		if(input ==1) {
			fruit = new Peach();
			fruit.show();
		}
		else if (input ==2) {
			fruit = new Grape();
			fruit.show();
		}
		else {
			System.out.println("ã���ô� ������ ������ ������");
		}
	}

}
