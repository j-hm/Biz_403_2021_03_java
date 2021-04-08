package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {

	protected Scanner scan;
	
	public InputServiceV1() {
		scan = new Scanner(System.in);
	}
	
	public Integer InputValue(String title) {
		
		while(true) {
			System.out.println(title + "의 값을 입력해주세요(입력종료 : QUIT)");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			if(strNum.equals("QUIT")) {
				return null;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("정수 또는 QUIT만 입력할 수 있습니다");
				continue;
			}
			return intNum;	
		} //while end
		
	} // method end

	public Integer InputValue(String title, int start) {

		title = String.format("%s(%d 이상)",title, start);
		
		while(true) {
			Integer retNum = this.InputValue(title);
			if(retNum == null) {
				return null;
			} else if( retNum < start ){
				System.out.println(start + "이상의 값을 입력해주세요");
				continue;
			}
			return retNum;	
		}// while end
	}//method end

	public Integer InputValue(String title, int start, int end) {

		title = String.format("%s (%d ~ %d)" ,title, start, end);
		
		Integer retNum = this.InputValue(title);
		if(retNum == null) {
			return null;
		} else if(retNum < start || retNum > end) {
			
		}
		return retNum;
	}
}
