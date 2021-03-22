package com.callor.controller;

import java.util.Random;

/*
 * 1~100까지 범위의 임의 정수 10개를 만들고
 * 3의 배수인지 검사하여 출력하고
 * 수들의 합을 계산하여 출력하라
 * 
 * 변수의 선언 위치
 * 
 */
public class Controller_12 {

	public static void main(String[] args) {

		Random rnd = new Random();
		/*
		 * 1-100까지 랜덤수 10개 10개의 숫자를 모두 다르게 만들어라
		 */
		int intSum = 0; // 먼저 변수 선언하기
		
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(100) + 1;
			if (num % 3 == 0) {
				System.out.println(num);
				intSum += num; // 출력문(sysout) 앞 뒤 상관없음 if{}안에 있으면 오케
			}
		}
		// for() {}안에서 선언된 변수 num / i 는 명령이 끝나면 소멸된다
		System.out.println("================");
		System.out.println("합계 : " + intSum);
		
		
		/*
		 * {}(scope) : 변수의 사용범위를 제한하는 역할을 한다
		 * 지금 작성하는 코드는 main(){}내에 있다
		 * 여기서 선언된 모든 변수는 
		 * main(){ }가 종료되면 모두 소멸된다
		 * 
		 * for(){ }내에 선언된 모든 변수는
		 * for(){반복문이 종료되면 모두 소멸된다}
		 * 
		 * if(){ }내에 선언된 모든 변수는
		 * if(){비교문이 종료되면 모두 소멸된다}
		 * 
		 * for(){ }, if(){ } 명령이 시작되기 전에 선언된 변수들은
		 * for(), if() 명령문 내에서 사용(저장, 읽기)가 가능하고
		 * for(), if() 명령이 종료되어도 그 값을 유지하고 있다
		 * 
		 * for() 반복문이 수행되는 동안에 
		 * 어떤 값을 누적(합산)하거나 할 때
		 * for() 반복문이 시작되기 전에 
		 * 변수를 반드시 선언하고 0으로 클리어하는 것이 좋다
		 */

	}

}
