package com.callor.apps;

import java.util.Random;

public class App_01 {
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
		}
		
	}

}
