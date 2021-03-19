package com.callor.controller;

public class Score_03 {
	public static void main(String[] args) {
		
		int intKor = 87;
		int intEng = 66;
		
		int intSum = intKor + intEng;
		System.out.println("총점 : " + intSum);
		
		//오차가 발생한 평균값
		int intAvg = intSum / 2;
		System.out.println("평균 : " + intAvg);
		
		/*
		 * 과목의 편균을 계산할 때 소수점이하 오류가 발생
		 * 소수점이하 계산을 살리기 위해
		 * 평균을 저장할 변수를 float형으로 선언하였다
		 * 하지만,
		 * 여전히 계산된 결과는 소수점이하 값이 0으로 나오고 있음
		 * 
		 * 이 상황은 대입연산자의 성질때문!!
		 * 대입연산자가 나오면 항상 오른쪽의 연산식이 먼저 실행
		 * 결과적으로 정수 / 정수는 결과가 '정수'이며
		 * 이미 계산결과에서 소수점이하 값이 없는 상태
		 * 이 값을 실수형변수에 담는 것은 아무 의미 없음...
		 * 
		 * 이 며령문을 실행하여 정확한 평균을 계산하기 위해서는
		 * 대입연산자 오른쪽의 계산식 값을
		 * 실수형으로 '강제형변환을 한 다음 연산을 수행'해야한다
		 */
		// 평균값을 저장할 변수를 float형으로 바꾸기
		float floatAvg = intSum / 2;
		
		// intSum /2 연산식에서
		// 정수형변수 intSum을 float형으로 강제형변환하면
		// 나누는 수 2도 2.0으로 변환된다
		// 결국 실수 / 실수 연산이 되어 소수점이하 값을 포함한
		// 계산결과가 만들어진다
		floatAvg = (float)intSum / 2;
		floatAvg = intSum / 2.0F;
		floatAvg = intSum / (float)2; //실무에서 안 쓰는 코드
		
		System.out.println("평균 : " + floatAvg);
	}

}
