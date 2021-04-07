package com.callor.method.service;

public class ScoreServiceV3 {

	protected InputServiceV2 inScore;

	public ScoreServiceV3() {
		inScore = new InputServiceV2();
	}

	public void inputScore() {

		Integer intKor = inScore.inputValue("국어", 0, 100);
		if (intKor == null) {
			System.out.println("업무종료");
			return;
		}
		Integer intEng = inScore.inputValue("영어", 0, 100);
		if (intEng == null) {
			System.out.println("업무종료");
			return;
		}
		Integer intMath = inScore.inputValue("수학", 0, 100);
		if (intMath == null) {
			System.out.println("업무종료");
			return;
		}
		Integer intTotal = intKor + intEng + intMath;
		Float floatAvg = (float) intTotal / 3;

		System.out.println("=".repeat(50));
		System.out.print("국어 : " + intKor + "\t");
		System.out.print("영어 : " + intEng + "\t");
		System.out.print("수학 : " + intMath + "\n");
		System.out.printf("총점 : %d\t", intTotal);
		System.out.printf("평균 : %3.2f", floatAvg);
	}

}
