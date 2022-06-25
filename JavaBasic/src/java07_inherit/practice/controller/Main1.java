package java07_inherit.practice.controller;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("복숭아: 1, 포도:2 \n원하는 과일의 번호를 입력하세요 : ");
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
			System.out.println("찾으시는 과일의 정보가 없슴다");
		}
	}

}
