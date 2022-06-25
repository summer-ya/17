package java07_inherit.practice.controller;

import java07_inheritance.Rectangle;
import java07_inheritance.Circle;
import java07_inheritance.Point;

public class Main2 {
	public static void main(String[] args) {

		Point[] pArr = new Point[5];

		pArr[0] = new Circle();
		pArr[1] = new Rectangle();
		pArr[2] = new Rectangle(1,2,3,4);
		pArr[3] = new Circle(6, 7, 8);
		pArr[4] = new Rectangle(7, 3, 5, 6);

		for(int i=0; i<pArr.length; i++) {
			pArr[i].draw(); //동적 바인딩
			System.out.println("----------");
		}

		System.out.println("= = = = = = = = = =");

		for(Point p : pArr) {
			p.draw();
			System.out.println("----------");
		}

	}
}
