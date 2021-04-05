package com.callor.method;

import java.util.Scanner;

public class Method_04 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		/*
		 * 입력을 받는데 정수 0~100
		 * 또는 문자열 QUIT
		 * 다른 타입의 데이터를 동시에 취급하기 위해서는
		 * 기본 타입을 스트링 형으로 설정하는 것이 편리
		 */
		System.out.println("0 ~ 100범위의 정수를 입력하세요(입력취소:QUIT)");
		System.out.print(">> ");
		
		// 모든 입력을 문자열 타입으로 하라
		// 입력받은 문자열을 strNum에 저장
		String strNum = scan.nextLine();
		if (strNum == "QUIT") {
			System.out.println("종료합니다");
		} else {
			//QUIT가 아닌 다른 값이 입력되었으면
			//일단 입력된 값을 정수형으로 변환해보자
			//변환된 정수값을 변수에 저장
			
//			int intNum1 = Integer.valueOf(strNum);
			Integer intNum2 = Integer.valueOf(strNum);
			
			System.out.println("입력된 정수 : " + intNum2);
		}
	}
	
	
}
