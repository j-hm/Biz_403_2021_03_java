package com.callor.apps;

import java.util.Random;

public class App_03 {
	public static void main(String[] args) {

		int numsLength = 20;
		int[] intNums = new int[numsLength];

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		
		
		//요소 : 배열의 몇번째 값
		//위치 : 배열의 몇번째
		//첨자 : 배열의 몇번째 인가를 알려주는 값
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] % 2 == 0) {
				//System.out.println(i);
				System.out.printf("%d번째 값 : %d\n" , i , intNums[i]);
			}
		}

	}

}
