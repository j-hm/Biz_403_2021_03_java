package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

/*
 * ScoerScerviceV1을 extends(상속/확장)
 * ScoerScerviceV1에 있는 메서드를 그대로 이어 받아서
 * ScoerScerviceV2에 마치 복사 붙이기 한 것처럼 사용하겠다
 * 
 * ScoerScerviceV1에서 작성된 inputScore()를 
 * ScoerScerviceV2에서는 새롭게 개선(기능 업그레이드)
 */
public class ScoreServiceV2 extends ScoreServiceV1 {

	/*
	 * V1에서 protected로 만든 변수는 V2에서 바로 사용가능
	 */
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}

	public Integer inputScore(String strNum, String strSub) { // 매개변수 String strNum

		int intScore = 0;
		while (true) {
			System.out.println(strNum + "번의 " + strSub + "점수를 입력하세요(중단 : -1)");
			System.out.print(">> ");
			intScore = scan.nextInt();
			if (intScore == -1) {
				return null;
			} else if (intScore < 0 || intScore > 100) {
				System.out.println(strSub + "점수는 0~100점까지!!");
				continue;
			}
			break;
		}
		return intScore;
	} // inputScore(String strNum)

	public Integer inputScore() {

		String[] strSubject = { "국어", "영어", "수학" };
		Integer[] intScores = new Integer[strSubject.length];

		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);

		for (int i = 0; i < strSubject.length; i++) {
			intScores[i] = this.inputScore(strNum, strSubject[i]);
			if(intScores[i] == null) {
				return null;
			}
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intScores[0];
		scoreVO.eng = intScores[1];
		scoreVO.math = intScores[2];
		scoreList.add(scoreVO);

		return 0;
	} // inputScore()

}