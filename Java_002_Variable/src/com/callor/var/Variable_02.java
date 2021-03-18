package com.callor.var;

public class Variable_02 {
	public static void main(String[] args) {
		
		// 정수형 변수 선언과 clear
		// 정수형 변수 intNum1, intNum2 생성
		int intNum1 = 0; //기본형 (주로 사용)
		Integer intNum2 = 0; //확장형
		
		// 실수형 변수 선언과 clear
		// 실수형 변수 douNum1, douNum2 생성
		double douNum1 = 0.0;
		Double douNum2 = 0.0;
		
		// 실수형 변수 생성 (주로 사용)
		// 기억장치를 소모하는 용량이 더블보다 작다
		// 대신 정밀도는 낮다
		float floatNum1 = 0.0f;
		Float floatNum2 = 0.0F;
		
		
		// w정수형 변수 생성
		// int보다 기억장치 소모용량이 크다
		// int 최대 2의 32승만큼 공간
		// long 최대 2의 64승만큼 공간
		long longNum1 = 0;
		Long longNum2 = 0;
		
		// 문자열형 변수를 선언하고 clear
		// 문자'열'형 변수를 생성
		String strName1 = ""; // " "<-이것과는 다른 값임
		String strName2 = null;
	}

}
