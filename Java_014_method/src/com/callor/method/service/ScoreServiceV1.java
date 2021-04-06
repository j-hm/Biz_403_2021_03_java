package com.callor.method.service;

public class ScoreServiceV1 {

	public void inputScore() {
		InputServiceV1 inScore = new InputServiceV1();
		
		Integer retNum = inScore.inputValue("국어", 0, 100);
		
		if(retNum == null) {
			System.out.println("종료");
		} else {
			System.out.println("점수 : " + retNum);
		}
		
	}
	
}
