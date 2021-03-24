package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class ScoreEx_03 {
	public static void main(String[] args) {
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2();
		ssV2.intValue(); // ScoreServiceV2클래스의 intValue()메서드 호출
		ssV2.makeScore(); // ScoreServiceV2클래스의 makeScore()메서드 호출
		ssV2.printScore(); // ScoreServiceV2클래스의 printScore()메서드 호출
	}

}
