package com.callor.controller;

public class Cont_07 {
	public static void main(String[] args) {
		
		int intNum = 9;
		
		for(int i = 2; i < intNum ; i++) {
			System.out.printf("%d = %d\n", i, intNum % i );
		}
	
		intNum = 15;
		// 2~(intnum에 담긴 정수 -1까지) 반복
		// intNum에 담긴 값을 2~-1까지 값으로 나누었을 때
		//나머지가 0인 경우가 있나
		for(int index = 2; index < intNum ; index++) {
			//System.out.println( intNum % index == 0 );
			System.out.println( intNum % index == 0 ? "소수아님" : "" );
		}
	
		
		
	}

}
