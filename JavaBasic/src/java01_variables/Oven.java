package java01_variables;

import java.util.Scanner;

public class Oven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();   // ��
		int m = sc.nextInt();	// ��
		int a = sc.nextInt();	// �ʿ�ð�


		h += a / 60;            // �ð��� �ʿ�ð��� 60���� ������
		m += a % 60;            // ���� �ʿ�ð��� 60 ���� ������

		if(m >= 60) {         // ���� 60�� �Ѿ��
			h += 1;           // �ð��� 1�ð� �����ְ�
			m -= 60;          // 60�п����� - ���ֱ�
		}
		if(h >=24)  {           // 24�ð��� �Ѿ��
			h -= 24;            // �ð� -1 ���ֱ�
		}
		System.out.println(h + " " + m);
	}

}
