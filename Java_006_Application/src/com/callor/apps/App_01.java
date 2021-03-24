package com.callor.apps;

import java.util.Random;

/*
 * 정수형배열을 20개 선언
 * 짝수의 리스트출력
 * 짝수들의 합을 계산하여 출력
 */
public class App_01 {
	/*
	 * { }내에 있는 코드는 최소화하자 작은 일로 분해하기
	 * 
	 * 나누어서 정복하라 : Divide and Conquer
	 */
	public static void main(String[] args) {

		/*
		 * 배열의 크기를 변수에 설정해두고
		 * 코드내에서 공통으로 사용하기
		 */
		int numsLength = 20;
		
		int[] intNums = new int[numsLength];
		Random rnd = new Random();
		int intSum = 0;

		System.out.println("=================");
		System.out.println("짝수 리스트");
		System.out.println("-----------------");

		// 1. 값을 배열에 저장하기
		for (int i = 0; i < numsLength; i++) {

			// 먼저 선언되어 있는
			// 배열에 값을 저장하기
			intNums[i] = rnd.nextInt(100) + 1;
		}
		// 2. 짝수를 배열에 출력하기
		for (int i = 0; i < numsLength; i++) {
			// 배열에 저장된 값 읽기
			// 읽은 값이 짝수인지 검사
			if (intNums[i] % 2 == 0) {
				// 짝수이면 출력
				System.out.printf("%3d\n", intNums[i]);
			}
		}

		// intSum이 이전 코드에서 어떤 값이 저장되어 있을 지도 모르기 때문에
		// clear하고 시작하기
		intSum = 0;

		// 3. 합산하기
		for (int i = 0; i < numsLength; i++) {
			if (intNums[i] % 2 == 0) {
				// 짝수이면 intSum에 합산(누적)하라
				intSum += intNums[i];
			}
		}
		// 4.출력하기
		System.out.println("=================");
		System.out.println("짝수의 합 : " + intSum);
	}
}
