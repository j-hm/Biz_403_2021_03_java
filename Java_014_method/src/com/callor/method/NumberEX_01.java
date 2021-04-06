package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class NumberEX_01 {

	public static void main(String[] args) {
		NumberServiceV1 nsV1 = new NumberServiceV1();
		
		//두개의 매개변수를 갖는 addNum()메서드에
		//정수를 전달하고 그 결과를 retNum변수에 담아라
		Integer retNum = nsV1.addNum(31, 29);
		
		if(retNum == null) {
			System.out.println("결과는 짝수가 아님");
		} else {
			System.out.printf("결과 [%d]는 짝수", retNum);
		}
	}
	
}
