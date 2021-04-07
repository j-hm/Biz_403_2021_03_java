package com.callor.method.service;

public class ScoreServiceV4 {

	protected InputServiceV2 inScore;
	String[] subject = { "국어", "영어", "수학" };
	Integer[] score = new Integer[3];

	public ScoreServiceV4() {
		inScore = new InputServiceV2();
	}

	public void inputScore() {

		int sum = 0;
		float avg = 0;
		for (int i = 0; i < subject.length; i++) {
			score[i] = inScore.inputValue(subject[i], 0, 100);
			if (score[i] == null) {
				System.out.println("업무 종료");
				return;
			}
			sum += score[i];
			avg = (float) sum / 3;
		}

		System.out.println("=".repeat(50));
		for(int i= 0;  i < subject.length; i++) {
			System.out.println("국어");
		}
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %3.2f", avg);

	}

}
