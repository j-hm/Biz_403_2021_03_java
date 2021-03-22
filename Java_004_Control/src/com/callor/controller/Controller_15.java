package com.callor.controller;

import java.util.Random;

public class Controller_15 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intSum = 0;
		float floatAvg =0;
		
		/*
		 * int num(num) = rnd.nextInt(100) + 1;
		 * (num) 변수를 지정하고 합하면 num(1, 2, ..., 10)이 될 것 같은데
		 * 안된다....
		 */
		int num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;
		int num3 = rnd.nextInt(100) + 1;
		int num4 = rnd.nextInt(100) + 1;
		int num5 = rnd.nextInt(100) + 1;
		int num6 = rnd.nextInt(100) + 1;
		int num7 = rnd.nextInt(100) + 1;
		int num8 = rnd.nextInt(100) + 1;
		int num9 = rnd.nextInt(100) + 1;
		int num10 = rnd.nextInt(100) + 1;
		
		intSum = num1;
		intSum += num2;
		intSum += num3;
		intSum += num4;
		intSum += num5;
		intSum += num6;
		intSum += num7;
		intSum += num8;
		intSum += num9;
		intSum += num10;
				
		floatAvg = (float)intSum / 10;
		
		
		System.out.println("=======================");
		System.out.printf("학생1 : %d\n", num1);
		System.out.printf("학생2 : %d\n", num2);
		System.out.printf("학생3 : %d\n", num3);
		System.out.printf("학생4 : %d\n", num4);
		System.out.printf("학생5 : %d\n", num5);
		System.out.printf("학생6 : %d\n", num6);
		System.out.printf("학생7 : %d\n", num7);
		System.out.printf("학생8 : %d\n", num8);
		System.out.printf("학생9 : %d\n", num9);
		System.out.printf("학생10 : %d\n", num10);
		System.out.println("------------------------");
		System.out.printf("총점 : %d  평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("========================");
	}

}
