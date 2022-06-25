package java07_inherit.practice.controller;

import java07_inheritance.Circle;
import java07_inheritance.Rectangle;

public class Main {
	public static void main(String[] args) {

		Circle[] circles;
		circles = new Circle[3];

		circles[0] = new Circle();
		circles[1] = new Circle(2, 5, 8);
		circles[2] = new Circle(23, 34, 4);

		for(int i=0; i<circles.length; i++) {
			System.out.println("- - -" + (i+1) + "번째 원 - - -");
			circles[i].draw();
		}

		System.out.println("= = = = = = = = = = = = =\n");

		Rectangle[] rects = { 
				new Rectangle()
				, new Rectangle(3, 4, 5, 6)
				, new Rectangle(45, 56, 3, 7)
		};

		for(int i=0; i<rects.length; i++) {
			System.out.println("- - - " + (i+1) + "번째 사각형 - - -");
			rects[i].draw();

			System.out.println();
		}

		System.out.println("= = = = = = = = = = = = =\n");

		int[] arr = { 1, 2, 3, 4, 5 };

		//for-each구문
		for( int n : arr ) {
			System.out.println( n );
		}

		System.out.println("-----");

		double[] dArr = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		for( double d : dArr ) {
			System.out.println( d );
		}

		System.out.println("\n= = = = = = = = = = = = =\n");

		// Circle[] 에 대한 for-each구문
		for( Circle c : circles ) {
			c.draw();
			System.out.println();
		}


		// Rectangle[] 에 대한 for-each구문
		for( Rectangle r : rects ) {
			r.draw();
			System.out.println();
		}

	}


}



