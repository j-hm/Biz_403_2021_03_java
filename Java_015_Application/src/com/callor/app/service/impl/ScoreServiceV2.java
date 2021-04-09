package com.callor.app.service.impl;

import com.callor.app.model.ScoreVOa;

//V1에는 ScoreService인터페이스가 impl되어있기 때문에
//V1
public class ScoreServiceV2 extends ScoreServiceImplV1A {
	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가

		while (true) {

			System.out.println("=".repeat(60));

			// #학번 입력 받기
			String num = this.inputName("학번");
			if (num == null) {
				return;
			} // 메뉴로 돌아가기
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(num);
			} catch (NumberFormatException e) {
				System.out.println("!학번은 숫자로만 입력!");
				continue;
			} // 학번 익셉션 검사 문자 -> 숫자

			// #이름 입력
			String name = this.inputName("이름");
			if (name == null) {
				return;
			} else if (name.equals("")) {
				System.out.println("학생이름은 반드시 입력해야합니다");
				continue;
			} // 메뉴로 돌아가거나 처음부터 입력..아 이름 어카지...너무 처음으로 가는 거 아니에여?

			// #성적 입력
			System.out.println(name + "의 성적을 입력해주세요");
			Integer[] score = new Integer[subject.length];

			for (int sb = 0; sb < subject.length; sb++) {
				score[sb] = inService.inputValue(subject[sb], 0, 100);
				if (score[sb] == null) {
					return;
				}
			}

			// #리스트 저장
			// 입력을 마쳤으면 VO에 담기
			ScoreVOa scoreVO = new ScoreVOa();
			scoreVO.setKor(score[0]);
			scoreVO.setEng(score[1]);
			scoreVO.setMath(score[2]);
			scoreVO.setName(name);
			scoreVO.setNum(intNum);

			// VO에 담긴 데이터를 List저장소에 추가
			scoreList.add(scoreVO);
			System.out.println(scoreList.toString());
		}

	}
}
