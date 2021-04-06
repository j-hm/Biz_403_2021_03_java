package com.callor.method.service;

import java.util.Scanner;

public class InputServiceV1 {

	/*
	 * Scanner 클래스는 키보드 자원을 연동하여 
	 * 키보드로 부터 값을 입력받기 위한 클래스이다 
	 * 이 클래스는 컴퓨터의 자원을 사용하는 관리가
	 * 매우 엄격하게 필요하다 사용하는 방법에 따라, 
	 * 오류가 발생하거나 심지어 컴퓨터 시스템이 멈추는 현상까지 발생할 수 있다 
	 * 이러한 클래스는
	 * 사용할 때 상당한 주의가 필요하다
	 */
	// Scanner클래스를 main() method가 아닌
	// Service 등의 클래스에서 사용할 때는 클래스 영역에 선언하고
	// 클래스 생성자에서 생성(초기화)하는 것이 좋다
	protected Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	/*
	 * 문자열 정수 정수 매개변수를 갖는 메서드 선언
	 * 
	 * 문자열과 범위(start~end)깞을 전달받아
	 * 프롬프트 문자열을 생성하고
	 * inputValue(String title) 메서드를 호출하여 값을 입력받도록 하고
	 * 리턴된 값에 따라 널 값이 리턴되면 그냥 리턴을 해버리고
	 * 정수 값이 리턴되면 start와 end값 범위에 있는 값인지
	 * 유효성 검사를 하고
	 * 범위를 벗어나면 다시 입력을 반복한다.
	 */
	public Integer inputValue(String title, int start, int end) {

		title = String.format("%s (%d ~ %d)", title, start, end);

		while (true) {
			Integer retNum = this.inputValue(title);
			if (retNum == null) {
				return null;
			} else {
				if (retNum < start || retNum > end) {
					System.out.printf("입력값은 %d ~ %d 범위이어야합니다\n", start, end);
					continue;
				}
				return retNum;
			}
		} // while end
	}

	/*
	 * String title 매개변수를 받고
	 * 정수 값이나 QUIT가 입력되는지 확인하고
	 * 잘못 입력된 값이 있으면 다시 입력받도록하는
	 * 메서드
	 */

	public Integer inputValue(String title) {

		while (true) {
			System.out.println(title + "의 값을 입력하세요");
			System.out.println("입력취소 : QUIT");
			System.out.print(">> ");
			String strInput = scan.nextLine();

			if (strInput.equals("QUIT")) {
				System.out.println("종료되었습니다.");
				return null;
			} else {
				Integer intInput = null;
				try {
					intInput = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					System.out.println("!정수 또는 QUIT만 입력가능!");
					continue;
				}
				return intInput; // 입력 정수 리턴
			}
		} // while end
	}
}
