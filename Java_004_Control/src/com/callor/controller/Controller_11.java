package com.callor.controller;

import java.util.Random;

public class Controller_11 {
	public static void main(String[] args) {

		Random rnd = new Random();

		// i < n <=만들어진 난수(임의의 숫자) 개수
		for (int i = 0; i < 5; i++) {
			int num = rnd.nextInt(100) // 0 ~ 99까지 임의의 수 범위
									  + 1; // num + 1 => 1 ~ 100
			if (num % 3 == 0) {
				System.out.println(num + "는(은) 3의 배수");
			} else {
				System.out.println(num + "는(은) 3의 배수아님");
			}
		}
	}

}
