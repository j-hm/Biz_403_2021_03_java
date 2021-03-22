package com.callor.controller;

public class Controller_01 {
	public static void main(String[] args) {
		int intSum3 = 0;
		int intSum4 = 0;
		int intSum15 = 0;
		
		// 1. 0~99 + 1 => 1~100
		for (int i = 0; i < 100; i ++) {
			
			//1-1.
			int intNum = i + 1;
			
			//2. 3의 배수이면
			if ( intNum % 3 == 0) {
				intSum3 += intNum;
				}
		
			if (intNum % 4 == 0) {
				intSum4 += intNum;
				}
		
		// 3의 배수의 합, 4의 배수의 합
		// 합을 구하기 위해 변수를 선언한다
		// 난 일단 앞에서 함..
		
		/*
		 * 3의 배수이면서 5의 배수
		 * num % 3 == 0 AND num % == 0
		 */
		
		
			if (intNum % 3 == 0) {
				if (intNum % 5 == 0) {
					intSum15 =+ intNum;
				}
			}
			
		}
		System.out.println("=======================");
		System.out.println("3의 배수의 합 : " + intSum3);
		System.out.println("4의 배수의 합 : " + intSum4);
		System.out.println("3과 5의 배수의 합 : " + intSum15);
		System.out.println("=======================");
		

		}
}


