package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV2 {

	/*
	 * 정수를 키보드에서 입력받아
	 * 정수를 리턴하거나
	 * QUIT를 입력하면 null을 리턴
	 */
	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		System.out.println("0 ~ 100범위의 정수를 입력하세요");
		System.out.println("(입력취소:QUIT)");
		System.out.print(">> ");
		String strNum = scan.nextLine();
		if (strNum.equals("QUIT")) {
			return null;
		} else {
			Integer intNum = Integer.valueOf(strNum);
			return intNum;
		}
	}
	
}
