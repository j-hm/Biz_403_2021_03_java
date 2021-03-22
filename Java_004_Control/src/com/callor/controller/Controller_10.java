package com.callor.controller;

import java.util.Random;

/*
 * 0~100까지 중에 임의의 정수 5개를 만들어서
 * 그 수가 짝수인지 아닌지를 출력
 */
public class Controller_10 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		int num3 = rnd.nextInt(100);

		// 등등

		if (num1 % 2 == 0) {
			System.out.println(num1 + "짝수");
		} else {
			System.out.println(num1 + "짝수아님");
		}
		
		if (num2 % 2 == 0) {
			System.out.println(num2 + "짝수");
		} else {
			System.out.println(num2 + "짝수아님");
		}

		// 등등으로 반복됨
		
		
		
		/*
		 *반복문을 사용하여 임의 정수 100을 만들고
		 *그 수가 짝수인지 아닌지 판별하는 코드 
		 */
		System.out.println("==============");

		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt();
			if (num % 2 == 0) {
				System.out.println(num + "짝수");
			} else {
				System.out.println(num + "짝수아님");
			}
		}
	}

}
