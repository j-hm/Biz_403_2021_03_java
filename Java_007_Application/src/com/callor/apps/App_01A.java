package com.callor.apps;

import java.util.Random;

public class App_01A {
	public static void main(String[] args) {

		int[] intNums = new int[20];

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}

		for (int i = 0; i < 20; i++) {
			boolean notPrime = false; // 플래그 변수
			for (int j = 2; j < intNums[i]; j++) {
				if (intNums[i] % j == 0) {
					
					//소수가 아닌 것이 발견되면
					//낫프라임변수에 트루를 설정
					notPrime = true; //flag 변수의 setting
					break;
				}
			}
			//포 반복문이 완료되었거나
			//중간에 브레이크를 만나서 중단되었거나
			
			//세팅되거나 그렇지 않은경우를 판단하여
			//결과를 출력하기
			if(notPrime) { //낫프라임이 트루이면 소수가 아닌경우
				
				System.out.println(intNums[i] + "소수가 아님");
			} else {
				System.out.println(intNums[i] + "소수임");
			}
			int num = 0;
			for(num = 2; num < intNums[i]; num++) {
				if(intNums[i] % num == 0) {
					break;
				}
			}
			
			/*
			 * 포 반복문에서 사용할 num(index변수)를
			 * 포 반복문 시작전에 선언을 하고 실행을 하면
			 * 포 반복문이 종료된 후에 num값을 읽을 수 있다
			 * 
			 * 이때
			 * 1. 만약 중간에 브레이크를 만나서 포 반복문이 중단되거나
			 * 2. 브레이크 없이 완료되거나
			 * 할텐데 1과 2의 경우 서로 저장된 num변수의 상태가 다르다
			 * 
			 * num변수의 값은 조건문의 최대값과 같다
			 * 1번의 경우, num값은 intNums[]보다 항상 작다
			 * 2번의 경우, num값은 intNums[]보다 크거나 같다
			 * 
			 * if(num==)라는 비교문을 사용하는 것 보단
			 * if(<)조건문을 사용하는 것이 논리적인 문제를 최소화 할 수 있다
			 */
			
			//조건문에서 값이 애매하게 만들어져
			//논리적 오류를 일으킬 가능성이 있다
			//intNum[] >= num
			if(num == intNums[i]) {
				
			}
			
			//논리적인 오류를 최소하 하기 위하여
			//비교연산자를 1개만 사용하여 검사할 수 있는 코드를 사용하는 것이 좋다
			if(num < intNums[i]) {
				
			}
			
			
		}
		
	}

}
