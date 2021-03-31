package com.callor.classes.service;

public class IolistServiceV2 extends IolistServiceV1 {

	/*
	 * V1의 input method를 재정의한다 
	 * 매입단가, 매출단가는 반드시 0이상이어야한다 
	 * 유효성검사를 하도록 코드를 재정의한다
	 */
	@Override
	public void input() {
		// TODO 매입매출등록
		Integer iprice;
		while (true) {
			System.out.println("매입단가>> ");
			iprice = scan.nextInt();
			if (iprice < 0) {
				System.out.println("단가는 0원 이상의 값을 입력");
				continue;
			}
		}
		return;
	}

}
