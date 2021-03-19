package com.callor.controller;

public class Variable_01 {
	public static void main(String[] args) {
		
		int intNum = 4;
		System.out.println(intNum % 2);
		System.out.println(intNum % 2 == 0);
		System.out.println(intNum % 2 == 0 ? "0" : "0 아님~");
		
		int intResuit = intNum % 2;
		
		boolean bYes = (intNum % 2) == 0;
		Boolean bYes1 = 3 == 3;
		
		/*
		 * 블린값(형)
		 * true, false : 키워드이면서 하나의 값
		 * 값 : 연산된 결과
		 */
		boolean bYes2 = true;
		bYes = false;
		
		//비교연산자
		// : 어떤 값들이 같은지, 크기가 어떠한지를 판단하는 연산
		// 결과는 (only) true, false
		bYes = 3 > 3; //f
		bYes = 3 >= 3; //t
		bYes = 3 < 3; //f
		bYes = 3 <= 3; //t
		bYes = 3 == 3; //t
		
		bYes = false;
		
		// 어떤 조건이 true인경우만 코드를 실행하고 싶을 때
		// bYes에 담긴 값이 true이냐
		if( bYes ) {
			//byes에 담긴 값이 true일때 실행할 코드들
			System.out.println("bYes는 true");
			
		}
		
	}

}
