package java01_variables;

import java.util.Scanner;

public class Oven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();   // 시
		int m = sc.nextInt();	// 분
		int a = sc.nextInt();	// 필요시간


		h += a / 60;            // 시간은 필요시간을 60으로 나누기
		m += a % 60;            // 분은 필요시간을 60 나눈 나머지

		if(m >= 60) {         // 분이 60분 넘어가면
			h += 1;           // 시간에 1시간 더해주고
			m -= 60;          // 60분에서는 - 해주기
		}
		if(h >=24)  {           // 24시간이 넘어가면
			h -= 24;            // 시간 -1 해주기
		}
		System.out.println(h + " " + m);
	}

}
