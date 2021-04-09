package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceT {

	
	protected String inputNum() {

		Integer intNum = inService.inputValue("학번", 1);

		if (intNum == null) {
			return null;
		}

		String strNum = String.format("2021%03d", intNum); // 2021001

		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO scoreVO = scoreList.get(i);
			if (strNum.equals(scoreVO.getNum())) {
				return "err";
			}
		}
		return strNum;

	}

	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가

		String strNum = null;
		while (true) {
			strNum = this.inputNum();
			if (strNum == null) {
				return;
			} else if (strNum == "err") {
				System.out.println("이미 입력된 학생입니다");
				continue;
			}
			break;
		}

		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if (strName == null) {
			return;
		}

		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}

		
		if (intKor == null || intEng == null || intMath == null) {
			return;
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		scoreList.add(scoreVO);
	}

	private String inputName(String strNum) {
		// TODO 학번으로 보여주고 이름을 입력받는 method

		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT:입력취소)");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				// return null;
				break;
			} else if (strName.equals("")) { // 입력 없이 Enter만
				System.out.println("학생이름은 반드시 입력해야 합니다");
				continue;
			}
			return strName;
		} // end while
		return null;
	}

}
