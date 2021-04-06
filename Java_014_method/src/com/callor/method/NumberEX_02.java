package com.callor.method;

import com.callor.method.service.InputServiceV1;

public class NumberEX_02 {

	public static void main(String[] args) {
		InputServiceV1 inService = new InputServiceV1();
		
		// 문자열 1개만 전달하여 호출
		// 전달된 문자열을 입력하여 return
		// inService.inputValue("새우깡");
		
		//문자열 1개와 정수 2개를 전달하여 호출
		//정수가 범위내의 값인지 유효성 검사를 수행하기
		inService.inputValue("새우깡", 0, 100);
	}
}
