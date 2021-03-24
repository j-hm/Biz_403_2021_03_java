package com.callor.apps;

import java.util.Random;

public class App_05 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[50];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0; i < intNums.length; i++) {
			// 리스트를 한줄에 출력
			System.out.print(intNums[i] + ","); // "\t"를 쓰거나

			// 5번째 요소를 출력한 후 엔터를 눌러
			// 다음 요소부터 줄바꿈하여 출력하라
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}

}
